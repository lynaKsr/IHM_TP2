/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice08;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import javafx.stage.Stage;

/**
 *
 * @author kesso
 */
public class Exercice08 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        /*
        Board tableau = new Board(10);
        tableau.setCell('c', 3, 4, "blue");
        tableau.resetCell(3, 4);
        tableau.setCell('1', 3, 2, "green");
        tableau.setCell('2', 4, 2, "blue");
        tableau.setCell('0', 4, 5, "grey");
        
        direction dir = new direction();
       
        String roles[] = {"elfe", "magicien", "chasseur", "lapin"};
        RoleChoice role = new RoleChoice(roles);
       
        
        String roles[] = {"elfe", "magicien", "chasseur", "lapin"};
        PlayerTab pTab = new PlayerTab(roles);
        PlayerTabs pTabs = new PlayerTabs(playerNames, rolesNames);
        */
        
        String playerNames[] = {"le bon", "la brute", "le truand"};
        String rolesNames[] = {"elfe", "magicien", "chasseur", "lapin"};
        int size = 10;
        
        GamePane gamepane = new GamePane(size,playerNames,rolesNames);
        
        gamepane.setPlayerSelected(2);
        gamepane.setRolePlayer(1, 0);
        gamepane.setCell('6', 1, 4, "#00FFFF");
        gamepane.getButtonQuit() ;
        gamepane.getButtonReset() ;
        StackPane root = new StackPane();
       
        root.getChildren().add(gamepane);
        
        Scene scene = new Scene(root, 480, 350);
        
        primaryStage.setTitle("Jouer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
    // classe board
    public class Board extends GridPane {
        private int size;
        private Label boardlab[][];
        
        public Board(int size) {
            this.size = size;
            char firstLetter = 'A';
            
            // création des indices pour les lignes 
            for(int i=1; i<size+1; i++) {
                Label ligne = new Label("" +i);
                setHalignment(ligne,HPos.CENTER);
                this.add(ligne, 0, i);
            }
            
            // création des indices pour les colonnes 
            for(int i=1; i<size+1; i++) {
                Label colonne = new Label(""+firstLetter);
                firstLetter++;
                setHalignment(colonne, HPos.CENTER);
                this.add(colonne, i, 0);
            }    
            
            // remplissage des cellules 
            boardlab = new Label[size+1][size+1];
            for(int i=1; i<size+1; i++)
            {
                for(int j=1; j<size+1; j++)
                {
                    Label lab = new Label();
                    lab.setMaxSize(20, 20);
                    lab.setMinSize(20, 20);
                    lab.setAlignment(Pos.CENTER);
                    lab.setStyle("-fx-background-color: #FF0F0F;");
                    this.add(lab, i, j);
                    boardlab[i][j] = lab;
                }
            }
            
                   setPadding(new Insets(3) );

            // écart entre les colonnes et les lignes
            setHgap(3);
            setVgap(3);
            
            // la bordure 
            BorderStroke bs = new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, new CornerRadii(5), new BorderWidths(3));
            setBorder(new Border(bs));
            
        }
        // méthode setCell
        public void setCell(char val, int x, int y, String numberColor)
        {
            if((x>0 && x<size) && (y>0 && y<= size)) {
                boardlab[x][y].setStyle("-fx-background-color: "+ numberColor + ";");
                boardlab[x][y].setText(""+val);
            }
                
        }
        
        // méthode resetCell
        public void resetCell(int x, int y) {
            if((x>0 && x<size) && (y>0 && y<= size))
            {
                boardlab[x][y].setText("");
                boardlab[x][y].setStyle("-fx-background-color: #FF0F0F;");
            }
        }
    }
    
    
    // classe Direction
    public class direction extends GridPane {
        private Button buttonUp, buttonDown, buttonRight, buttonLeft;
        
        public direction () {
            super();
            buttonUp = new Button("H");
            buttonDown = new Button("B");
            buttonLeft = new Button("G");
            buttonRight = new Button("D");
            
            // je positionne les boutons 
            add(buttonUp, 2, 0);
            add(buttonDown, 2, 2);
            add(buttonLeft, 0, 1);
            add(buttonRight, 3, 1);
            
            BorderStroke bs2 = new BorderStroke(Color.GOLD, BorderStrokeStyle.SOLID, 
                                                new CornerRadii(5), new BorderWidths(5));
            this.setBorder(new Border(bs2));
            this.setWidth(50);
            this.setAlignment(Pos.CENTER);
            
            
        }
        
        public Button getButtonUp() {
            return this.buttonUp;
        }
        
        public Button getButtonDown() {
            return this.buttonDown;
        }
        
        public Button getButtonRight() {
            return this.buttonRight;
        }
        
        public Button getButtonLeft() {
            return this.buttonLeft;
        }
        
    }
    
    public class RoleChoice extends VBox {
        
        private String roles[];
        private RadioButton rb[];
        private ToggleGroup tg;
        
        
        public RoleChoice(String roles[]) {
            
            super();
            this.roles = roles;
            this.setAlignment(Pos.TOP_CENTER);
            this.setSpacing(10);
            Insets padding = new Insets(30, 30, 30, 30);
            this.setPadding(padding);
          
            tg = new ToggleGroup();
            rb = new RadioButton[roles.length];
            
            // j'attribue les roles dans les radio button
            for(int i=0; i<roles.length; i++) {
                rb[i] = new RadioButton(" "+roles[i]);
                VBox.setVgrow(rb[i], Priority.ALWAYS);
                rb[i].setMaxWidth(Double.MAX_VALUE);
                rb[i].setToggleGroup(tg);
                getChildren().add(rb[i]);
            }
        }
        public void setRole(int i) {
            if(i > 0 && i < roles.length)
                rb[i].setSelected(true);
        }
        
        public String[] getRoles() {
            return this.roles;
        }
        
        public ToggleGroup getTg() {
            return this.tg;
        }
        
    
    }
    
    public class PlayerTab extends VBox {
        
        private Pane panneau;
        private String roleNames[];
        private RoleChoice choices;
        private direction dir;
        
        public PlayerTab(String roleNames[]) {
            super();
            this.setAlignment(Pos.BOTTOM_RIGHT);
            //this.setSpacing(10);
            //this.setPadding(new Insets(5));
            
            this.roleNames = roleNames;
            choices = new RoleChoice(roleNames);
            dir = new direction();
            
            this.setMargin(dir, new Insets(20, 70, 20, 70));
            this.getChildren().addAll(choices, dir);
            BorderStroke bs3 = new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID,
                                                new CornerRadii(2),
                                                new BorderWidths(5));
            setBorder(new Border(bs3));
            
        }
        
        public void setRole(int i) {
            choices.setRole(i);
        } 
        
        public void setRoleChoiceDisable(boolean b) {
            choices.setDisable(b);
        }
        
        public Button getButtonUp() {
            return dir.buttonUp;
        }
        
        public Button getButtonDown() {
            return dir.buttonDown;
        }
        
        public Button getButtonRight() {
            return dir.buttonRight;
        }
        
        public Button getButtonLeft() {
            return dir.buttonLeft;
        }
                
    }
    
    public class PlayerTabs extends TabPane {
        Tab[] tabs;
        PlayerTab[] tabsContent;
        String playerNames[];
        String roleNames[];
        
        public PlayerTabs(String playerNames[], String roleNames[]) {
            this.playerNames = playerNames;
            this.roleNames = roleNames;
            
            tabs = new Tab[playerNames.length];
            tabsContent = new PlayerTab[playerNames.length];
            
            for(int i=0; i<playerNames.length; i++)
            {
                tabs[i] = new Tab(""+i+" : "+playerNames[i]);
                tabsContent[i] = new PlayerTab(roleNames);
                tabs[i].setContent(tabsContent[i]);
                getTabs().add(tabs[i]);
                
            }
            BorderStroke bs4 = new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, new CornerRadii(5), new BorderWidths(4));
            this.setBorder(new Border(bs4));
            
        }
        
        // selectionner un onglet précis 
        void setSelected(int i) {
            this.getSelectionModel().select(i);
        }
        
        // choisir un role sur l'onglet i 
        void setPlayerRole(int i, int role) {
            ((PlayerTab)tabs[i].getContent()).setRole(role);
        }
        
        // activer/désactiver le choix de role pour l'onglet i 
        public void setPlayerRoleChoiceDisable(int i, boolean b) {
            ((PlayerTab) tabs[i].getContent()).setRoleChoiceDisable(b);
        }
        
        // retourne le bouton haut du joueur i 
        public Button getPlayerButtonUp(int i) {
            return tabsContent[i].getButtonUp();
        }
        
        // return le bouton bas du joueur i
        public Button getPlayerButtonDown(int i) {
            return tabsContent[i].getButtonDown();
        }
        
        // retourne le bouton droit du joueur i 
        public Button getPlayerButtonRight(int i) {
            return tabsContent[i].getButtonRight();
        }
        
        // retourne le bouton gauche du joueur i
        public Button getButtonLeft(int i) {
            return tabsContent[i].getButtonLeft();
        }
                
    }
    
    public class GamePane extends GridPane {
        private Label label;
        private Button reset, quit; 
        private Board board;
        private PlayerTabs playertabs;
        private int size;
        private String playerNames[];
        private String roleNames[];
        private VBox leftSide;
        
        public GamePane(int size, String playerNames[], String roleNames[]) {
            size = size;
            playerNames = playerNames;
            roleNames = roleNames;
            
            // coté droit 
            playertabs = new PlayerTabs(playerNames, roleNames);
            this.add(playertabs, 1, 0);
            
            // coté gauche 
            label = new Label("Plateau de jeu");
            reset = new Button("reset");
            Spring ressortH = new Spring();
            quit = new Button("quit");
            board = new Board(10);
            leftSide = new VBox();
            Spring ressortV = new Spring();
            // coté gauche bas 
            HBox hbb = new HBox();
            hbb.getChildren().addAll(reset, ressortH, quit);
            leftSide.getChildren().addAll(label,board,ressortV,hbb);
            this.add(leftSide, 0, 0);
            
        }
        
        // methode qui permet de selectionner l'onglet (le joueur) i
        public void setPlayerSelected(int i) {
            playertabs.setSelected(i);
        }
        
        // méthode qui permet de selectionner le role pour le joueur player 
        public void setRolePlayer(int player, int role) {
            playertabs.setPlayerRole(player, role);
        }
        
        // méthode qui permet d'activer/desactiver le choix des roles pour le joueur player 
        public void setRoleChoiceDisablePlayer(int player, boolean b) {
            playertabs.setPlayerRoleChoiceDisable(player, b);
        }
        
        // méthode qui positionne un caractère à la position (x,y) dans le damier, avec la couleur numberColor (au format css)
        public void setCell(char val, int x, int y, String numberColor) {
            board.resetCell(x,y);
        }
        
        // méthode qui retourne le bouton quit 
        public Button getButtonQuit() {
            return this.quit;
        }
        
        // méthode qui retourne le bouton reset 
        public Button getButtonReset() {
            return this.reset;
        }
    }
    
    public class Spring extends Region {
        // construit un ressort 
        public Spring() {
            this.setMaxWidth(Double.MAX_VALUE);
            HBox.setHgrow(this, Priority.ALWAYS);
            this.setMaxHeight(Double.MAX_VALUE);
            VBox.setVgrow(this, Priority.ALWAYS);
        }
    }
}

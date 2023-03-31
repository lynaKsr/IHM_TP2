/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice07;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import static javafx.geometry.Pos.BOTTOM_CENTER;
import static javafx.geometry.Pos.TOP_CENTER;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author kesso
 */
public class Exercice07Q1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        
        // création des labels NORTH, SOUTH et CENTER 
        Label lnorth = new Label(" NORTH ");
        Label lsouth  = new Label(" SOUTH ");
        Label lcenter = new Label(" CENTER ");
        
        // création de WEST avec un label pour chaque lettre 
        Label lw = new Label(" W ");
        Label le1 = new Label(" E ");
        Label ls1 = new Label(" S ");
        Label lt1 = new Label(" T ");
        
        // création de EAST avec un label pour chaque lettre 
        Label le2 = new Label(" E ");
        Label la = new Label(" A ");
        Label ls2 = new Label(" S ");
        Label lt2 = new Label(" T ");
        
        // création des Bordures pour chaque lettre de WEST
        BorderStroke bs3 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        lw.setBorder(new Border(bs3));
        
        BorderStroke bs4 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        le1.setBorder(new Border(bs4));
        
        BorderStroke bs5 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        ls1.setBorder(new Border(bs5));
        
        BorderStroke bs6 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        lt1.setBorder(new Border(bs6));
        
        // création des Bordures pour chaque lettre de EAST       
        BorderStroke bs7 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        le2.setBorder(new Border(bs7));
        
        BorderStroke bs8 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        la.setBorder(new Border(bs8));
        
        BorderStroke bs9 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        ls2.setBorder(new Border(bs9));
        
        BorderStroke bs10 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        lt2.setBorder(new Border(bs10));
        
        // création du HBox NORTH  
        HBox hBnorth = new HBox(lnorth);
        hBnorth.setAlignment(Pos.CENTER);
        
        // création du HBox SOUTH 
        HBox hBsouth = new HBox(lsouth);
        hBsouth.setAlignment(Pos.CENTER);
        
        // création du HBox CENTER
        HBox hBcenter = new HBox(lcenter);
        hBcenter.setAlignment(Pos.CENTER);
        
        // création du VBox WEST 
        VBox VBwest = new VBox();
        VBwest.getChildren().addAll(lw, le1, ls1, lt1);
        VBwest.setAlignment(Pos.CENTER);
        
        // création du VBox EAST 
        VBox VBeast = new VBox();
        VBeast.getChildren().addAll(le2, la, ls2, lt2);
        VBeast.setAlignment(Pos.CENTER);
        
        // création des bordures pour le HBox NORTH
        BorderStroke bs1 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        hBnorth.setBorder(new Border(bs1));
        
        // création des bordures pour le HBox SOUTH 
        BorderStroke bs2 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        hBsouth.setBorder(new Border(bs2));
        
        // création des bordures pour le HBox CENTER 
        BorderStroke bs13 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        hBcenter.setBorder(new Border(bs13));
        
        // création des bordures pour le VBox WEST 
        BorderStroke bs11 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        VBwest.setBorder(new Border(bs11));
        
        // création des bordures pour le VBox EAST 
        BorderStroke bs12 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        VBeast.setBorder(new Border(bs12));
        
        // positionnement des hbox et vbox dans le BorderPane 
        root.setTop(hBnorth);
        root.setBottom(hBsouth);
        root.setLeft(VBwest);
        root.setRight(VBeast);
        root.setCenter(hBcenter);
        
        // alignements des HBox et VBox
        root.setAlignment(hBnorth, Pos.TOP_CENTER);
        root.setAlignment(hBsouth, Pos.BOTTOM_CENTER);
        root.setAlignment(VBwest, Pos.CENTER_LEFT);
        root.setAlignment(VBeast, Pos.CENTER_RIGHT);
        root.setAlignment(hBcenter, Pos.CENTER);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Border Layout Show");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

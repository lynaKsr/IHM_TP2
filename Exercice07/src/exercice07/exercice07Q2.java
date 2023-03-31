/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice07;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author kesso
 */
public class exercice07Q2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        
        // création des labels NORTH et SOUTH 
        Label lnorth = new Label(" NORTH ");
        Label lsouth  = new Label(" SOUTH ");
        
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
        
        // création de CENTER avec un label pour chaque lettre 
        Label lc = new Label(" C ");
        Label le3 = new Label(" E ");
        Label ln = new Label(" N ");
        Label lt3 = new Label(" T ");
        Label le4 = new Label(" E ");
        Label lr = new Label(" R ");
        
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
        
        // création des Bordures pour chaque lettre de CENTER 
        BorderStroke bs13 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        lc.setBorder(new Border(bs13));
        
        BorderStroke bs14 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        le3.setBorder(new Border(bs14));
        
        BorderStroke bs15 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        ln.setBorder(new Border(bs15));
        
        BorderStroke bs16 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        lt3.setBorder(new Border(bs16));
        
        BorderStroke bs17 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        le4.setBorder(new Border(bs17));
        
        BorderStroke bs18 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        lr.setBorder(new Border(bs18));
        
        // création du HBox NORTH  
        HBox hBnorth = new HBox(lnorth);
        hBnorth.setAlignment(Pos.CENTER);
        
        // création du HBox SOUTH 
        HBox hBsouth = new HBox(lsouth);
        hBsouth.setAlignment(Pos.CENTER);
        
        // création du VBox WEST 
        VBox VBwest = new VBox();
        VBwest.getChildren().addAll(lw, le1, ls1, lt1);
        VBwest.setAlignment(Pos.CENTER);
        
        // création du VBox EAST 
        VBox VBeast = new VBox();
        VBeast.getChildren().addAll(le2, la, ls2, lt2);
        VBeast.setAlignment(Pos.CENTER);
        
        // Création d'un ressort            
        Region ressort = new Region();
        HBox.setHgrow(ressort, Priority.ALWAYS);
        
        // création du HBox CENTER 
        HBox HBcenter = new HBox(lc, le3, ln, lt3, le4, lr);
      
        
        
        // création des bordures pour le HBox NORTH
        BorderStroke bs1 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        hBnorth.setBorder(new Border(bs1));
        
        // création des bordures pour le HBox SOUTH 
        BorderStroke bs2 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        hBsouth.setBorder(new Border(bs2));
        
        // création des bordures pour le HBox CENTER 
        BorderStroke bs19 = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0), BorderWidths.DEFAULT);
        HBcenter.setBorder(new Border(bs19));
        
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
        root.setCenter(HBcenter);
        
        // alignements des HBox et VBox
        root.setAlignment(hBnorth, Pos.TOP_CENTER);
        root.setAlignment(hBsouth, Pos.BOTTOM_CENTER);
        root.setAlignment(VBwest, Pos.CENTER_LEFT);
        root.setAlignment(VBeast, Pos.CENTER_RIGHT);
        root.setAlignment(HBcenter, Pos.CENTER);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Border Layout Show");
        primaryStage.setScene(scene);
        primaryStage.show();
   
    }
    
    
}

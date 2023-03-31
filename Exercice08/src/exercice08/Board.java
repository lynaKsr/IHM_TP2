/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice08;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author kesso
 */
public class Board extends GridPane {
    private final int size;
    private Label labelBoard[][];
    
    private Board(int size) {
        this.size = size;
        this.labelBoard = new Label[size][size];
         
        for(int i=0; i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                labelBoard[i][j] = new Label();
            }
        }
    }
    public void setCell(char val, int x, int y, String numberColor)
    {
        labelBoard[x][y].setText(" " + val);
    }
    
    public void resetCell(int x, int y) {
        labelBoard[x][y].setText(" ");
    }
    
    
    
    
}

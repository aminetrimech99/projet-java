/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilan.gui;

import bilan.entities.article;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import bilanservices.Bilanservices;
import java.sql.SQLException;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;

/**
 *
 * @author PCS
 */
public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try{
            
        Parent root = FXMLLoader.load(getClass().getResource("Interfaceanalyse.fxml"));
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("analysefinan");
        primaryStage.setScene(scene);
        primaryStage.show();
        }
        catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
                 List<String> month = new ArrayList<>();
                 Bilanservices mo = new Bilanservices();
                 int prix ; 
                 
    mo.getAllarticles();
             
        
        
        launch(args);
    }
    
    
}

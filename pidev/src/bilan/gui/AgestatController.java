/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilan.gui;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;
import  javax.management.Query.*;

/**
 * FXML Controller class
 *
 * @author PCS
 */
public class AgestatController implements Initializable {

    @FXML
    private PieChart piechartage;
    @FXML
    private JFXButton showagestat;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
         
        // TODO
    }    

    @FXML
    private void ShowAge(ActionEvent event) throws SQLException {
        List<String> l1=new ArrayList<>();
        l1.add("18");l1.add("25");
        List<String> l2=new ArrayList<>();
        l2.add("26");l2.add("33");
        List<String> l3=new ArrayList<>();
        l3.add("34");l3.add("41");
        List<String> l4=new ArrayList<>();
        l4.add("42");l4.add("50");
        List<String> l5=new ArrayList<>();
        l5.add("50");l5.add("99");
        bilanservices.Bilanservices S=new bilanservices.Bilanservices();
        ObservableList<PieChart.Data> pieChartData =FXCollections.observableArrayList(
                new PieChart.Data("18-25",S.nbrAge(l1)),
                 new PieChart.Data("26-33",S.nbrAge(l2)),
                  new PieChart.Data("34-41", S.nbrAge(l3)),
        new PieChart.Data("42-50", S.nbrAge(l4)),
        new PieChart.Data("50+", S.nbrAge(l5)));
                  piechartage.setData(pieChartData);
                  piechartage.setTitle("pourcentage de categories pour les equipements");
    }

    @FXML
    private void retour_par_age(ActionEvent event) {
         try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            

            Scene scene = new Scene(FXMLLoader.load(getClass().getResource("Interfaceanalyse.fxml")));
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
    }
    }
    
}

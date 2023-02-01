/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilan.gui;
import bilanservices.Bilanservices;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
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

/**
 * FXML Controller class
 *
 * @author PCS
 */
public class TypeequipController implements Initializable {

    @FXML
    private PieChart piechart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void LOADpiechart(ActionEvent event) throws SQLException {
        Bilanservices eq = new Bilanservices() ; 
        ObservableList<PieChart.Data> pieChartData =FXCollections.observableArrayList(
                new PieChart.Data("SAHARA", eq.nbrCat("Sahara")),
                 new PieChart.Data("FOREST", eq.nbrCat("Forest")),
                  new PieChart.Data("BEACH", eq.nbrCat("Beach")));
                  piechart.setData(pieChartData);
                  piechart.setTitle("pourcentage de categories pour les equipements");
    }

    @FXML
    private void Retour_typeequip(ActionEvent event) {
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

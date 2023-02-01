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
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PCS
 */
public class AnalyseevenementController implements Initializable {

    @FXML
    private BarChart<?, ?> analyseeven;
    @FXML
    private Spinner<String> entreryeareven;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
        ObservableList<String> years = FXCollections.observableArrayList("2017","2018","2019","2020","2021","2022","2023","2024","2025","2026");
        SpinnerValueFactory<String> valueFactory =new SpinnerValueFactory.ListSpinnerValueFactory<String>(years);
        entreryeareven.setValueFactory(valueFactory);
        // TODO
    }    

    @FXML
    private void loadanalyseeven(ActionEvent event) throws SQLException {
        
           
                 Bilanservices prix = new Bilanservices();
        
        String e = entreryeareven.getValue();
        int test =Integer.parseInt(e);
        analyseeven.setTitle("total d'evenements en "+test);
        XYChart.Series series1 =new XYChart.Series();
        series1.setName(" "+test);
        
        series1.getData().add(new XYChart.Data("jan",prix.analyseEvent(1, test)));
        series1.getData().add(new XYChart.Data("fev",prix.analyseEvent(2, test)));
        series1.getData().add(new XYChart.Data("mars",prix.analyseEvent(3, test)));
        series1.getData().add(new XYChart.Data("avril",prix.analyseEvent(4, test)));
        series1.getData().add(new XYChart.Data("may",prix.analyseEvent(5, test)));
        series1.getData().add(new XYChart.Data("juin",prix.analyseEvent(6, test)));
        series1.getData().add(new XYChart.Data("jui",prix.analyseEvent(7, test)));
        series1.getData().add(new XYChart.Data("aout",prix.analyseEvent(8, test)));
        series1.getData().add(new XYChart.Data("sep",prix.analyseEvent(9, test)));
        series1.getData().add(new XYChart.Data("oct",prix.analyseEvent(10, test)));
        series1.getData().add(new XYChart.Data("nov",prix.analyseEvent(11, test)));
        series1.getData().add(new XYChart.Data("dec",prix.analyseEvent(12, test)));
        analyseeven.getData().add(series1);
        
        
        
        
        
    }

    @FXML
    private void Retour_analeven(ActionEvent event) {
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

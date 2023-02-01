/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilan.gui;
import bilan.utilities.Connexionbilan;
import bilan.entities.personne;
import bilanservices.Bilanservices;
import com.mysql.jdbc.PreparedStatement;
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
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author PCS
 */
public class AnalysefinanController implements Initializable {

    @FXML
    private LineChart<?, ?> analysenbpersonnes;
    @FXML
    private Spinner<String> enteryear;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
        
       // XYChart.Series series1 = (XYChart.Series)analysenbpersonnes.getData().get(0);
        
        ObservableList<String> years = FXCollections.observableArrayList("2017","2018","2019","2020","2021","2022","2023","2024","2025","2026");
        SpinnerValueFactory<String> valueFactory =new SpinnerValueFactory.ListSpinnerValueFactory<String>(years);
        enteryear.setValueFactory(valueFactory);
        
    }    

    @FXML
    private void loadanalysepersone(ActionEvent event) throws SQLException {
        
        
        //XYChart.Series series1 = (XYChart.Series)analysenbpersonnes.getData().get(0);
        List<String> month = new ArrayList<>();
                 Bilanservices mo = new Bilanservices();
        
         String e = enteryear.getValue();
        int test =Integer.parseInt(e);
        analysenbpersonnes.setTitle("nombre de participants en "+test);
        XYChart.Series series1 =new XYChart.Series();
        series1.setName(" "+test);
        
        series1.getData().add(new XYChart.Data("jan",mo.importation(1, test)));
        series1.getData().add(new XYChart.Data("fev",mo.importation(2, test)));
        series1.getData().add(new XYChart.Data("mars",mo.importation(3, test)));
        series1.getData().add(new XYChart.Data("avril",mo.importation(4, test)));
        series1.getData().add(new XYChart.Data("may",mo.importation(5, test)));
        series1.getData().add(new XYChart.Data("juin",mo.importation(6, test)));
        series1.getData().add(new XYChart.Data("jui",mo.importation(7, test)));
        series1.getData().add(new XYChart.Data("aout",mo.importation(8, test)));
        series1.getData().add(new XYChart.Data("sep",mo.importation(9, test)));
        series1.getData().add(new XYChart.Data("oct",mo.importation(10, test)));
        series1.getData().add(new XYChart.Data("nov",mo.importation(11, test)));
        series1.getData().add(new XYChart.Data("dec",mo.importation(12, test)));
        analysenbpersonnes.getData().add(series1);
        
    }

    @FXML
    private void Retour_analysefinan(ActionEvent event) {
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

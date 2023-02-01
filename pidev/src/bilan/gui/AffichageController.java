/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilan.gui;

import bilan.entities.article;
import bilanservices.Bilanservices;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author PCS
 */
public class AffichageController implements Initializable {

    @FXML
    private TableView<article> tableview;
    @FXML
    private TableColumn<article, Integer> idcol;
    @FXML
    private TableColumn<article, String> nomcol;
    @FXML
    private TableColumn<article, String> descol;
    @FXML
    private TableColumn<article, String> contcol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        idcol.setCellValueFactory(new PropertyValueFactory<article, Integer>("id_article"));
        nomcol.setCellValueFactory(new PropertyValueFactory<article, String>("nom_article"));
        descol.setCellValueFactory(new PropertyValueFactory<article, String>("description_article"));
        contcol.setCellValueFactory(new PropertyValueFactory<article, String>("contenue_article"));
        Bilanservices mo = new Bilanservices();
        ObservableList<article> list=mo.getAllarticles();
        tableview.setItems(list);
        // TODO
    }    
    
}

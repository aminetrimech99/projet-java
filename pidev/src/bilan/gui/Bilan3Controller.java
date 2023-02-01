/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilan.gui;
import bilanservices.produitService;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author PCS
 */
public class Bilan3Controller implements Initializable {

    @FXML
    private Pane ProduitPane;
    @FXML
    private TextArea recherche;
    @FXML
    private JFXButton btnSupprimerProduit;
    @FXML
    private Label labelNomProduit;
    @FXML
    private Label labelDescriptionProduit;
    @FXML
    private Spinner<?> spinbtnQuantityProduit;
    @FXML
    private Label labelTypeProduit;
    @FXML
    private Label labelPrixProduit;
    @FXML
    private AnchorPane espacepanier;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        produitService produit1 = new produitService("Gel","evenement","gel douchee",15.6,3);
        produitService produit2 = new produitService("tante","evenement","tante de 3 personnes",1.8,6);
        List<produitService> produits = new ArrayList<>();
        produits.add(produit1);
        produits.add(produit2);
        
        remplirPanier(produits);
    }    
    public void remplirPanier(List<produitService> produits){
        
        if (!produits.isEmpty()){
            int i=0;
            List<Pane> paneL=new ArrayList<>();
            for (produitService p : produits){
                Pane pane1=new Pane();
               // ObservableList kk = espacepanier.getChildren();
               
                /*Node node=ProduitPane.s   t ;
                espacepanier.se*/
                //System.out.println(ProduitPane.getChildren().getClass().getName());
                //pane1.getChildren().add(ProduitPane.getChildren());
                pane1.setLayoutY(4);
               
                //espacepanier.setTopAnchor(pane1, 4+106.0*i);
                paneL.add(pane1);
                
                i++;
                //paneL.add(pane1);*/
            }
            System.out.println(paneL);
        }
        else{
            
        }
        
    }
    @FXML
    private void poursuivrecommande(ActionEvent event) {
    }

    @FXML
    private void validercommande(ActionEvent event) {
        
    }

    @FXML
    private void supprimerpanier(MouseEvent event) {
    }

    @FXML
    private void supprimerproduit(ActionEvent event) {
        ProduitPane.setVisible(false);
    }
    
}






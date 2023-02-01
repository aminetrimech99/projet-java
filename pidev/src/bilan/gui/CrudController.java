/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilan.gui;

import bilan.entities.article;
import com.jfoenix.controls.JFXTextField;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author PCS
 */
public class CrudController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private JFXTextField text1;
    @FXML
    private JFXTextField text2;
    @FXML
    private JFXTextField text3;
    @FXML
    private JFXTextField textsu;
    @FXML
    private JFXTextField text13;
    @FXML
    private JFXTextField text12;
    @FXML
    private JFXTextField text11;
    @FXML
    private JFXTextField text131;
    @FXML
    private Label mess;
    @FXML
    private Label mess1;
    @FXML
    private Label mess2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ajouterarticle(ActionEvent event) {
        article a = new article() ;
        String nom = text1.getText();
        String description = text2.getText();
        String contenue = text3.getText();
        a.setContenue_article(contenue);
        a.setDescription_article(description);
        a.setNom_article(nom);
        if (description.length()==0||nom.length()==0||contenue.length()==0){
            mess.setText("veuillez remplir les champs");
        
                }else {
            bilanservices.Bilanservices S=new bilanservices.Bilanservices();
        S.ajouterarticle(a);
         mess.setText("article ajouté avec succées");
        }
    }

    @FXML
    private void modifierarticle(ActionEvent event) {
        
        String id = text131.getText();
        
        String nom = text13.getText();
        String description = text11.getText();
        String contenue = text12.getText();
        if (id.length()==0||description.length()==0||nom.length()==0||contenue.length()==0){
            mess1.setText("veuillez remplir les champs");
        
                }else {
            int id1 =parseInt(id);
        bilanservices.Bilanservices S=new bilanservices.Bilanservices();
        S.modifierarticle(id1,nom,description,contenue);
          mess1.setText("article modifié avec succées");}
    }

    @FXML
    private void supprimerarticle(ActionEvent event) {
       
        String id = textsu.getText();
        
         if (id.length()==0){
            mess2.setText("veuillez remplir le champs");
        
                }else {
        bilanservices.Bilanservices S=new bilanservices.Bilanservices();
        int id1 =parseInt(id);
        S.supprimerarticle(id1);
           mess2.setText("article supprimé avec succées");}
    }
    
    
}

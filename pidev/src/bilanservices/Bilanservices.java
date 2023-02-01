/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilanservices;

import bilan.entities.article;
import bilan.entities.bilan;
import bilan.entities.evenementcalcul;
import bilan.utilities.Connexionbilan;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.List;
import java.util.Observer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author PCS
 */
public class Bilanservices {
     private Connection cnx;

    public Bilanservices() {
        cnx = Connexionbilan.getMyCnx().getConnection();
    }
    
   /*  public void ajouterBilan (bilan b){
        try {
            String req = "INSERT INTO bilan (id_facture,id_bilan,revenue,taxe,prix_facture) values ('"+b.getPrix_facture()+"','"+b.getRevenue()+"','"+b.get)";
            Statement st = (Statement) cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Personne added !");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }*/
     public void ajouterarticle(article b){
        try {
            String req = "INSERT INTO article (id_article,nom_article,description_article,contenue_article) values (?,?,?,?)";
            PreparedStatement pst = (PreparedStatement) cnx.prepareStatement(req);
            pst.setInt(1, b.getId_article());
            pst.setString(2, b.getNom_article());
            pst.setString(3, b.getDescription_article());
            pst.setString(4, b.getContenue_article());
            pst.executeUpdate();
            System.out.println("article added !");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
     public int importation (int mon , int year) throws SQLException{
         List<String> month = new ArrayList<>();
         int mo ;
         String test ;
     
        try {
            String req =" SELECT COUNT(*) as nbr FROM `personne` WHERE MONTH(date_inscription)="+mon+" AND YEAR(date_inscription)="+year;
           
            Statement st = (Statement) cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while(rs.next()){
                String m;
                m = rs.getString(1);
                month.add(m);
        }} catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        test = month.get(0);
        mo=Integer.parseInt(test); 
        
         return mo;
     }
     public ObservableList<article> getAllarticles(){
      ObservableList<article> list=FXCollections.observableArrayList();
         try {
            String req ="SELECT * from article";
            Statement st = (Statement) cnx.createStatement();
          
          
            ResultSet rs = st.executeQuery(req);
            while(rs.next()){
                String m;
                m = rs.getString(1);
       list.add(new article(rs.getInt("id_article"),rs.getString("nom_article"),rs.getString("description_article"),rs.getString("contenue_article")));
        }} catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
         System.out.println(list);
     return (list);
     }
     
          public int analyseEvent (int mon , int year) throws SQLException{
         List<String> prixtot = new ArrayList<>();
         int prix ;
         String test ;
     
        try {
            String req ="  SELECT SUM(prix) FROM `dawssen` WHERE MONTH(date_event)="+mon+" and YEAR(date_event)="+year;
            Statement st = (Statement) cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while(rs.next()){
                String m;
                m = rs.getString(1);
                prixtot.add(m);
        }} catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        test = prixtot.get(0);
        prix=Integer.parseInt(test); 
        
         return prix;
     }
          
          public int nbrCat (String str) throws SQLException{
              
             List<String> equip = new ArrayList<>();
              int nbr;
              String test; 
                try {
                   
            String req ="SELECT COUNT(*) FROM equipement WHERE Category_Produit ='"+str+"'";
            
            Statement st = (Statement) cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while(rs.next()){
                
                String m;
                
                m = rs.getString(1);
                
                equip.add(m);
                
        }} catch (SQLException ex) {
            System.err.println(ex.getMessage());
            
        }
        test = equip.get(0);
      
        nbr=Integer.parseInt(test); 
         return nbr;
     }
       public int nbrAge (List l) throws SQLException{
              
             List<String> equip = new ArrayList<>();
              int nbr;
              String test; 
                try {
                   
            String req ="SELECT COUNT(*) FROM personne WHERE age between '"+l.get(0)+"' and '" +l.get(1)+"'";
            
            Statement st = (Statement) cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while(rs.next()){
                
                String m;
                
                m = rs.getString(1);
                
                equip.add(m);
                
        }} catch (SQLException ex) {
            System.err.println(ex.getMessage());
            
        }
        test = equip.get(0);
      
        nbr=Integer.parseInt(test); 
         return nbr;
     }
    
            public void supprimerarticle(int id){
                try {
                    String req = "DELETE FROM article WHERE id_article ="+id;
                    PreparedStatement pst = (PreparedStatement) cnx.prepareStatement(req);

                    pst.executeUpdate(req);
                    System.out.println("article moved !");
                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                }
            }
  /*  public void rechercherbilan(int idd){
        try {
            String req = "SELECT * FROM bilan WHERE id_bilan ="+idd;
            st =  cnx.createStatement(); 
           
           rst=st.executeUpdate(req);
           
            System.out.println("bilan moved !");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    } 
    */
            public void modifierarticle(int id ,String dd,String kk,String ll){
                try {
                    String req = "UPDATE  article SET nom_article ='"+dd+ "',description_article = '"+kk+"',contenue_article = '"+ll+"'WHERE id_article = "+id;
                    PreparedStatement pst = (PreparedStatement) cnx.prepareStatement(req);

                    pst.executeUpdate(req);
                    System.out.println("article updated !");
                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                }
            }
            
            
            
            
          /*  public void ajouteven(evenementcalcul e){
        try {
            String req = "INSERT INTO bilan (id_facture,id_bilan,revenue,prix_facture) values (?,?,?,?)";
            PreparedStatement pst = (PreparedStatement) cnx.prepareStatement(req);
            pst.setInt(1, b.getId_facture());
            pst.setInt(2, b.getId_bilan());
            pst.setInt(3, b.getRevenue());
            pst.setInt(4, b.getPrix_facture());
            pst.executeUpdate();
            System.out.println("evenement added !");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
            */
            
            
            
            
            
            
            
         /*public int importation (int mon , int year) throws SQLException{
         List<String> month = new ArrayList<>();
         int mo ;
         String test ;
     
        try {
            String req =" SELECT COUNT(*) as nbr FROM `personne` WHERE MONTH(date_inscription)="+mon+" AND YEAR(date_inscription)="+year;
           
            Statement st = (Statement) cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while(rs.next()){
                String m;
                m = rs.getString(1);
                month.add(m);
        }} catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        test = month.get(0);
        mo=Integer.parseInt(test); 
        
         return mo;
     }
    */

  

   
}
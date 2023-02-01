/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilan.utilities;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PCS
 */
public class Connexionbilan {
     private String url = "jdbc:mysql://localhost:3306/paiement";
    private String user = "root";
    private String pwd = "";
    private Connection cnx;
    
    private static Connexionbilan myCnx;

    private Connexionbilan() {
        try {
            cnx = (Connection) DriverManager.getConnection(url, user, pwd);
            System.out.println("Connected !");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public Connection getConnection(){
        return cnx;
    }   
    
    public static Connexionbilan getMyCnx(){
        if(myCnx == null){
            myCnx = new Connexionbilan();
        }
        return myCnx;
    }

    
}

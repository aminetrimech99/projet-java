package bilan.entities;
        



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PCS
 */
public class bilan {
    private int id_facture;
    private int id_bilan;
    private int revenue  ;
    private int prix_facture;
    private final int taxe =5/100;
   
    
    public int getRevenue() {
        return revenue;
    }

    

    
    

    public void setRevenue(int revenue) {
        this.revenue = revenue+(taxe*prix_facture);
    }

    

   

    public int getPrix_facture() {
        return prix_facture;
    }

    public void setPrix_facture(int prix_facture) {
        this.prix_facture = prix_facture;
    }

    public int getId_bilan() {
        return id_bilan;
    }

    public void setId_bilan(int id_bilan) {
        this.id_bilan = id_bilan;
    }   

    public int getId_facture() {
        return id_facture;
    }

    public void setId_facture(int id_facture) {
        this.id_facture = id_facture;
    }

    
    

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final bilan other = (bilan) obj;
        if (this.id_bilan != other.id_bilan) {
            return false;
        }
        if (this.id_facture != other.id_facture) {
            return false;
        }
        return true;
    }

    public bilan(int id_facture, int id_bilan, int revenue, int prix_facture) {
        this.id_facture = id_facture;
        this.id_bilan = id_bilan;
        this.revenue = revenue;
        this.prix_facture = prix_facture;
    }

    

    
   
    
    
    
}


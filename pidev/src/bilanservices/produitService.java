/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilanservices;

/**
 *
 * @author PCS
 */
public class produitService {
    private String nomP;

    public String getNomP() {
        return nomP;
    }

    public String getType() {
        return Type;
    }

    public String getDescription() {
        return Description;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantity() {
        return quantity;
    }
    private String Type;
    private String Description;
    private double prix;
    private int quantity;

    public produitService() {
    }

    public produitService(String nomP, String Type, String Description, double prix, int quantity) {
        this.nomP = nomP;
        this.Type = Type;
        this.Description = Description;
        this.prix = prix;
        this.quantity = quantity;
    }
    
    
}

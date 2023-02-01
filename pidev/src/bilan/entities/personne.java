/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilan.entities;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author PCS
 */
public class personne {
    private int id_per;
    private String cin;
    private String nom;
    private String prenom;
    private Date date;

    public personne(int id_per, String cin, String nom, String prenom, Date date) {
        this.id_per = id_per;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
    }

    public int getId_per() {
        return id_per;
    }

    public String getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDate() {
        return date;
    }

    public void setId_per(int id_per) {
        this.id_per = id_per;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDate(Date date) {
        this.date = date;
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
        final personne other = (personne) obj;
        if (this.id_per != other.id_per) {
            return false;
        }
        if (!Objects.equals(this.cin, other.cin)) {
            return false;
        }
        return true;
    }
    
    
}

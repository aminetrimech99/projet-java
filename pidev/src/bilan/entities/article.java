/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilan.entities;

import java.util.Objects;

/**
 *
 * @author PCS
 */
public class article {
      private int id_article;
    private String nom_article ;
    private String description_article  ;
    private String contenue_article;

    public int getId_article() {
        return id_article;
    }

    public String getNom_article() {
        return nom_article;
    }

    public String getDescription_article() {
        return description_article;
    }

    public String getContenue_article() {
        return contenue_article;
    }

    public void setId_article(int id_article) {
        this.id_article = id_article;
    }

    public void setNom_article(String nom_article) {
        this.nom_article = nom_article;
    }

    public void setDescription_article(String description_article) {
        this.description_article = description_article;
    }

    public void setContenue_article(String contenue_article) {
        this.contenue_article = contenue_article;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id_article;
        hash = 29 * hash + Objects.hashCode(this.nom_article);
        hash = 29 * hash + Objects.hashCode(this.description_article);
        hash = 29 * hash + Objects.hashCode(this.contenue_article);
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
        final article other = (article) obj;
        if (this.id_article != other.id_article) {
            return false;
        }
        if (!Objects.equals(this.nom_article, other.nom_article)) {
            return false;
        }
        if (!Objects.equals(this.description_article, other.description_article)) {
            return false;
        }
        if (!Objects.equals(this.contenue_article, other.contenue_article)) {
            return false;
        }
        return true;
    }

    public article(int id_article, String nom_article, String description_article, String contenue_article) {
        this.id_article = id_article;
        this.nom_article = nom_article;
        this.description_article = description_article;
        this.contenue_article = contenue_article;
    }

    public article() {
    }

    @Override
    public String toString() {
        return "article{" + "id_article=" + id_article + ", nom_article=" + nom_article + ", description_article=" + description_article + ", contenue_article=" + contenue_article + '}';
    }

   
    
}

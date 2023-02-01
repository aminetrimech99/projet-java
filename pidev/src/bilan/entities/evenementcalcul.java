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
public class evenementcalcul {
    private int id_evenement;
    private int prix_event;
    private int etat_event;
    private Date date_event;
    private int nbpersonnesevent;
    private int prixtot;

    public evenementcalcul(int id_evenement, int prix_event, int etat_event, Date date_event, int nbpersonnesevent, int prixtot) {
        this.id_evenement = id_evenement;
        this.prix_event = prix_event;
        this.etat_event = etat_event;
        this.date_event = date_event;
        this.nbpersonnesevent = nbpersonnesevent;
        this.prixtot = prixtot;
    }

    public int getId_evenement() {
        return id_evenement;
    }

    public int getPrix_event() {
        return prix_event;
    }

    public int getEtat_event() {
        return etat_event;
    }

    public Date getDate_event() {
        return date_event;
    }

    public int getNbpersonnesevent() {
        return nbpersonnesevent;
    }

    public int getPrixtot() {
        return prixtot;
    }

    public void setId_evenement(int id_evenement) {
        this.id_evenement = id_evenement;
    }

    public void setPrix_event(int prix_event) {
        this.prix_event = prix_event;
    }

    public void setEtat_event(int etat_event) {
        this.etat_event = etat_event;
    }

    public void setDate_event(Date date_event) {
        this.date_event = date_event;
    }

    public void setNbpersonnesevent(int nbpersonnesevent) {
        this.nbpersonnesevent = nbpersonnesevent;
    }

    public void setPrixtot(int prixtot) {
        this.prixtot = prixtot;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final evenementcalcul other = (evenementcalcul) obj;
        if (this.id_evenement != other.id_evenement) {
            return false;
        }
        if (this.prix_event != other.prix_event) {
            return false;
        }
        if (this.etat_event != other.etat_event) {
            return false;
        }
        if (this.nbpersonnesevent != other.nbpersonnesevent) {
            return false;
        }
        if (this.prixtot != other.prixtot) {
            return false;
        }
        if (!Objects.equals(this.date_event, other.date_event)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "evenementcalcul{" + "id_evenement=" + id_evenement + ", prix_event=" + prix_event + ", etat_event=" + etat_event + ", date_event=" + date_event + ", nbpersonnesevent=" + nbpersonnesevent + ", prixtot=" + prixtot + '}';
    }
    
    
    
    
    
    
}

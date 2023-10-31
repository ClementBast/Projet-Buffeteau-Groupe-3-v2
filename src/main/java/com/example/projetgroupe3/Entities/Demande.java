package com.example.projetgroupe3.Entities;

import java.util.Date;

public class Demande {
    private int idDemande;
    private String sous_matiere;
    private String user;
    private Date date_updated;
    private Date date_fin_demande;
    private String matiere;
    private String status;

    // Constructeur
    public Demande(int idDemande, String user,String sous_matiere,  Date date_updated, Date date_fin_demande, String matiere, String status) {
        this.idDemande = idDemande;
        this.user = user;
        this.sous_matiere = sous_matiere;
        this.date_updated = date_updated;
        this.date_fin_demande = date_fin_demande;
        this.status = status;
        this.matiere = matiere;

    }

    // Méthodes getters et setters
    public int getIdDemande() {
        return idDemande;
    }

    public void setIdDemande(int idDemande) {
        this.idDemande = idDemande;
    }

    public String getSousMatiere() {
        return sous_matiere;
    }

    public void setSousMatiere(String sous_matiere) {
        this.sous_matiere = sous_matiere;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getDateUpdated() {
        return date_updated;
    }

    public void setDateUpdated(Date date_updated) {
        this.date_updated = date_updated;
    }

    public Date getDateFinDemande() {
        return date_fin_demande;
    }

    public void setDateFinDemande(Date date_fin_demande) {
        this.date_fin_demande = date_fin_demande;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }
    public void setIdMatiere(String matiere) {
        this.matiere = matiere;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


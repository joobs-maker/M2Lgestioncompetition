package com.example.comapplication.entity;

public class Competition {
    private int id_competition;
    private String nom_competition;
    private String description;
    private String datededebut ;
    private String datefin;

    private String nombredeparticipant;

    public int getId_competition() {
        return id_competition;
    }

    public void setId_competition(int id_competition) {
        this.id_competition = id_competition;
    }

    public String getNom_competition() {
        return nom_competition;
    }

    public void setNom_competition(String nom_competition) {
        this.nom_competition = nom_competition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDatededebut() {
        return datededebut;
    }

    public void setDatededebut(String datededebut) {
        this.datededebut = datededebut;
    }

    public String getDatefin() {
        return datefin;
    }

    public void setDatefin(String datefin) {
        this.datefin = datefin;
    }

    public string getNombredeparticipant() {
        return nombredeparticipant;
    }

    public void setNombredeparticipant(string nombredeparticipant) {
        this.nombredeparticipant = nombredeparticipant;
    }
}


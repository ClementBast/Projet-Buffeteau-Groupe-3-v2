package com.example.projetgroupe3.Tools;

import com.example.projetgroupe3.Entities.Demande;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ServiceDemandes {
    private Connection uneCnx ;
    private PreparedStatement ps;
    private ResultSet rs;

    public ServiceDemandes(){
        uneCnx = ConnexionBDD.getCnx();
    }

    public ObservableList<Demande> getAllDemande() throws SQLException {
        ObservableList<Demande> lesDemandes = FXCollections.observableArrayList();

        ps = uneCnx.prepareStatement("SELECT demande.id, demande.id_user, demande.sous_matiere, demande.date_updated, demande.date_fin_demande, demande.status, matiere.designation FROM demande JOIN matiere ON demande.id_matiere = matiere.id");
        rs = ps.executeQuery();

        // Parcourir le jeu d'enregistrement
        while (rs.next()) {
            // Instancier un objet Demande
            Demande laDemande = new Demande(
                    rs.getInt("id"),
                    rs.getString("user"), // Changer "user" en "id_user" si le nom de la colonne est "id_user"
                    rs.getString("sous_matiere"),
                    rs.getDate("date_updated"),
                    rs.getDate("date_fin_demande"),
                    rs.getString("status"),
                    rs.getString("designation") // Changer "matiere" en "designation" si le nom de la colonne est "designation"
            );

            lesDemandes.add(laDemande);
        }
        return lesDemandes;
    }

}


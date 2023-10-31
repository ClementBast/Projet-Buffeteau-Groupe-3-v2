package com.example.projetgroupe3;

import com.example.projetgroupe3.Entities.Demande;
import com.example.projetgroupe3.Tools.ConnexionBDD;
import com.example.projetgroupe3.Tools.ServiceDemandes;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.TreeMap;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ProjetController implements Initializable {

    ConnexionBDD maCnx;
    ServiceDemandes serviceDemandes = new ServiceDemandes();

    private TreeMap<String, TreeMap<String, Demande>> mesAides;
    TreeItem root;
    @FXML
    private Button btnEtudiant;
    @FXML
    private Button BtnAdmin;
    @FXML
    private AnchorPane apAdmin;
    @FXML
    private Button btnMat;
    @FXML
    private Button btnSalles;
    @FXML
    private Button btnSoutiens;
    @FXML
    private AnchorPane apMat;
    @FXML
    private TextField txtMat;
    @FXML
    private Button btnCreerMat;
    @FXML
    private TableView tvMat;
    @FXML
    private TableColumn tcMatEx;
    @FXML
    private Button btnModifMat;
    @FXML
    private AnchorPane apSalles;
    @FXML
    private TextField txtSalles;
    @FXML
    private Button btnCreerSalle;
    @FXML
    private TableView tvSallesEx;
    @FXML
    private TableColumn tcSallesEx;
    @FXML
    private Button btnModifSalle;
    @FXML
    private AnchorPane apSoutiens;
    @FXML
    private TreeView tvSoutiens;
    @FXML
    private AnchorPane apEtudiant;
    @FXML
    private TextField txtId;
    @FXML
    private Button btnValider;
    @FXML
    private Button btnDem;
    @FXML
    private Button btnComp;
    @FXML
    private Button btnAide;
    @FXML
    private AnchorPane apComp;
    @FXML
    private Button btnCreerComp;
    @FXML
    private Button btnModifComp;
    @FXML
    private TableColumn tcMat;
    @FXML
    private TableView tvSousMat;
    @FXML
    private TableColumn tcSousMat;
    @FXML
    private AnchorPane apDem;
    @FXML
    private Button btnCreerDem;
    @FXML
    private Button btnModifDem;
    @FXML
    private TableView tvMatDem;
    @FXML
    private TableColumn tcMatDem;
    @FXML
    private TableView tvSousMatDem;
    @FXML
    private TableColumn tcSousMatDem;
    @FXML
    private AnchorPane apAide;
    @FXML
    private TreeView tvAides;
    @FXML
    private AnchorPane apCreerComp;
    @FXML
    private ComboBox cboMat;
    @FXML
    private ComboBox cboSousMat;
    @FXML
    private Button btnValiderCreerComp;
    @FXML
    private TextField txtMdp;
    @FXML
    private AnchorPane apCreerDem;
    @FXML
    private DatePicker dpDate;
    @FXML
    private TableView tvCreerDemMat;
    @FXML
    private TableColumn tcCreerDemMat;
    @FXML
    private TableView tvDemCreerSousMat;
    @FXML
    private TableColumn tcCreerDemSousMat;
    @FXML
    private Button btnCreerValiderDem;
    @FXML
    private AnchorPane apLesAides;
    @FXML
    private TreeView tvLesAides;
    @FXML
    private Button btnLesAides;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void btnEtudiantClicked(Event event) {
        apEtudiant.toFront();
    }

    @FXML
    public void btnAdminClicked(Event event) {
        apAdmin.toFront();
    }

    @FXML
    public void btnMatClicked(Event event) {
        apMat.toFront();
    }

    @FXML
    public void btnSallesClicked(Event event) {
        apSalles.toFront();
    }

    @FXML
    public void btnSoutiensClicked(Event event) {
        apSoutiens.toFront();
    }

    @FXML
    public void btnCreerMat(Event event) {
        apCreerComp.toFront();
    }

    @FXML
    public void btnModifMat(Event event) {

    }

    @FXML
    public void btnCreerSalle(Event event) {
    }

    @FXML
    public void btnModifSalle(Event event) {
    }

    @FXML
    public void btnValiderClicked(Event event) {
    }

    @FXML
    public void btnDemClicked(Event event) {
        apDem.toFront();
    }

    @FXML
    public void btnCompClicked(Event event) {
        apComp.toFront();
    }

    @FXML
    public void btnAideClicked(Event event) {
        apAide.toFront();
    }

    @FXML
    public void btnCreerComp(Event event) {
        apCreerComp.toFront();
    }

    @FXML
    public void btnModifComp(Event event) {
    }

    @FXML
    public void btnCreerDemClicked(Event event) {
        apCreerDem.toFront();
    }

    @FXML
    public void btnModifDemClicked(Event event) {
    }

    @FXML
    public void btnValiderDemClicked(Event event) {
    }

    @FXML
    public void btnLesAidesClicked(Event event) {
        apLesAides.toFront();
    }
}
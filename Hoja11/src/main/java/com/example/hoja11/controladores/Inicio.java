package com.example.hoja11.controladores;

import com.example.hoja11.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Inicio {


    @FXML
    private Button botonComenzar;

    @FXML
    private ImageView imgInicio;

    @FXML
    public void initialize() {
        String ruta = "img/dioses.jpg";
        Image img = new Image(ruta);
        imgInicio.setImage(img);
    }

    @FXML
    void empezarTest(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(Main.class.getResource("Pregunta.fxml"));
        Pane pane = (Pane) loader.load();
        Scene scene = new Scene(pane);
        stage.setTitle("Pregunta");

        stage.setScene(scene);
    }
}

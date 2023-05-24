package com.example.hoja11.controladores;

import com.example.hoja11.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Final {


    @FXML
    private Button botonRepetir;

    @FXML
    private Text nombreRespuesta;

    @FXML
    private Text textoRespuesta;

    public void initialize() {
        nombreRespuesta.setText(Pregunta.ending.getNombre());
        textoRespuesta.setText(Pregunta.ending.getTextoFinal());
    }

    @FXML
    void reintentarTest(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(Main.class.getResource("Inicio.fxml"));
        Pane pane = (Pane) loader.load();
        Scene scene = new Scene(pane);
        stage.setTitle("Inicio");

        stage.setScene(scene);
    }
}

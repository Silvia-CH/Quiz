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
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Inicio {


    @FXML
    private Button botonComenzar;

    @FXML
    private ImageView imgInicio;

    @FXML
    private VBox paneInicio;

    @FXML
    public void initialize() throws IOException {
        botonComenzar.setBackground(Background.fill(Color.GREEN));
        String ruta = "C:\\Users\\Silvia\\IdeaProjects\\Hoja11\\src\\main\\resources\\com\\example\\hoja11\\img\\dioses.jpg";
        Image img = new Image(ruta);
        imgInicio.setImage(img);
        String rutaVBox = "C:\\Users\\Silvia\\IdeaProjects\\Hoja11\\src\\main\\resources\\com\\example\\hoja11\\img\\nubes.png";
        Image imgVBox = new Image(rutaVBox);
        paneInicio.setBackground(new Background(new BackgroundImage(imgVBox,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT)));
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

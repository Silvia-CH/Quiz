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
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Final {


    @FXML
    private Button botonRepetir;


    @FXML
    private ImageView imgFinal;

    @FXML
    private Text nombreRespuesta;

    @FXML
    private Text textoRespuesta;


    @FXML
    private VBox paneFinal;
    public void initialize() {
        nombreRespuesta.setText(Pregunta.ending.getNombre());
        textoRespuesta.setText(Pregunta.ending.getTextoFinal());
        String ruta = "C:\\Users\\Silvia\\IdeaProjects\\Hoja11\\src\\main\\resources\\com\\example\\hoja11\\img\\" + Pregunta.ending.getFoto();
        Image img = new Image(ruta);
        imgFinal.setImage(img);

        String rutaVBox = "C:\\Users\\Silvia\\IdeaProjects\\Hoja11\\src\\main\\resources\\com\\example\\hoja11\\img\\nubes.png";
        Image imgVBox = new Image(rutaVBox);
        paneFinal.setBackground(new Background(new BackgroundImage(imgVBox,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT)));
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

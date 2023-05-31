package com.example.hoja11.controladores;

import com.example.hoja11.BD.AccederBD;
import com.example.hoja11.Main;
import com.example.hoja11.objetos.Ending;
import com.example.hoja11.objetos.Test;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;


@SuppressWarnings("ALL")
public class Pregunta {

    public static int contador;
    public static Test newTest;
    public static char[] posiciones;
    public static char[] rasgos;

    public static Ending ending;

    @FXML
    private Button botonAnterior;
    @FXML
    private Button botonSiguiente;
    @FXML
    private Button botonFinal;

    @FXML
    private Text pregunta;

    @FXML
    private Button respuestaA;

    @FXML
    private Button respuestaB;

    @FXML
    private Button respuestaC;

    @FXML
    private Button respuestaD;


    @FXML
    private ImageView imgPregunta;


    @FXML
    private VBox panePregunta;

    @FXML
    public void initialize() {
        newTest = new Test();
        posiciones = new char[6];
        rasgos = new char[6];
        contador = 0;
        botonSiguiente.setBackground(Background.fill(Color.GRAY));

        botonAnterior.setBackground(Background.fill(Color.GRAY));
        botonAnterior.setDisable(true);

        botonFinal.setVisible(false);
        botonFinal.setBackground(Background.fill(Color.GREEN));
        botonFinal.setScaleZ(5);

        respuestaA.setBackground(Background.fill(Color.ALICEBLUE));
        respuestaB.setBackground(Background.fill(Color.ALICEBLUE));
        respuestaC.setBackground(Background.fill(Color.ALICEBLUE));
        respuestaD.setBackground(Background.fill(Color.ALICEBLUE));

        setEscena();

        String rutaVBox = "C:\\Users\\Silvia\\IdeaProjects\\Hoja11\\src\\main\\resources\\com\\example\\hoja11\\img\\nubes.png";
        Image imgVBox = new Image(rutaVBox);
        panePregunta.setBackground(new Background(new BackgroundImage(imgVBox,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT)));
    }

    @FXML
    public void anteriorPregunta() {
        if (contador != 0) {
            botonAnterior.setDisable(false);
            botonSiguiente.setDisable(false);
            botonSiguiente.setBackground(Background.fill(Color.GRAY));
            contador--;
            setEscena();
        } else {
            botonAnterior.setDisable(true);
        }
    }

    @FXML
    public void siguientePregunta(ActionEvent event) throws IOException {
        if (contador < newTest.getPreguntas().size() - 1) {
            botonSiguiente.setBackground(Background.fill(Color.GRAY));
            botonAnterior.setDisable(false);

            respuestaA.setBackground(Background.fill(Color.ALICEBLUE));
            respuestaB.setBackground(Background.fill(Color.ALICEBLUE));
            respuestaC.setBackground(Background.fill(Color.ALICEBLUE));
            respuestaD.setBackground(Background.fill(Color.ALICEBLUE));

            contador++;
            setEscena();
        } else {
            sumarRasgos();
        }
    }

    public void setEscena() {
        pregunta.setText((contador + 1) + ") " + newTest.getPreguntas().get(contador).getTextoPregunta());
        respuestaA.setText("A) " + newTest.getPreguntas().get(contador).getRespuestas().get(0).getTextoRespuesta());
        respuestaB.setText("B) " + newTest.getPreguntas().get(contador).getRespuestas().get(1).getTextoRespuesta());
        respuestaC.setText("C) " + newTest.getPreguntas().get(contador).getRespuestas().get(2).getTextoRespuesta());
        respuestaD.setText("D) " + newTest.getPreguntas().get(contador).getRespuestas().get(3).getTextoRespuesta());
        setRadioButton();
        String ruta = "C:\\Users\\Silvia\\IdeaProjects\\Hoja11\\src\\main\\resources\\com\\example\\hoja11\\img\\pregunta_"
                + newTest.getPreguntas().get(contador).getIdPregunta() + ".png";
        Image img = new Image(ruta);
        imgPregunta.setImage(img);
    }

    public void terminarTest(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(Main.class.getResource("Final.fxml"));
        Pane pane = (Pane) loader.load();
        Scene scene = new Scene(pane);
        stage.setTitle("Final");


        stage.setScene(scene);
    }

    @FXML
    public void selectA() {
        validacionRasgo(contador, newTest.getPreguntas().get(contador).getRespuestas().get(0).getTipo());
        validacionPosicion(contador, 'A');
        respuestaA.setBackground(Background.fill(Color.ORANGE));
        respuestaB.setBackground(Background.fill(Color.ALICEBLUE));
        respuestaC.setBackground(Background.fill(Color.ALICEBLUE));
        respuestaD.setBackground(Background.fill(Color.ALICEBLUE));
    }

    @FXML
    public void selectB() {
        validacionRasgo(contador, newTest.getPreguntas().get(contador).getRespuestas().get(1).getTipo());
        validacionPosicion(contador, 'B');
        respuestaA.setBackground(Background.fill(Color.ALICEBLUE));
        respuestaB.setBackground(Background.fill(Color.ORANGE));
        respuestaC.setBackground(Background.fill(Color.ALICEBLUE));
        respuestaD.setBackground(Background.fill(Color.ALICEBLUE));
    }

    @FXML
    public void selectC() {
        validacionRasgo(contador, newTest.getPreguntas().get(contador).getRespuestas().get(2).getTipo());
        validacionPosicion(contador, 'C');
        respuestaA.setBackground(Background.fill(Color.ALICEBLUE));
        respuestaB.setBackground(Background.fill(Color.ALICEBLUE));
        respuestaC.setBackground(Background.fill(Color.ORANGE));
        respuestaD.setBackground(Background.fill(Color.ALICEBLUE));
    }

    @FXML
    public void selectD() {
        validacionRasgo(contador, newTest.getPreguntas().get(contador).getRespuestas().get(3).getTipo());
        validacionPosicion(contador, 'D');
        respuestaA.setBackground(Background.fill(Color.ALICEBLUE));
        respuestaB.setBackground(Background.fill(Color.ALICEBLUE));
        respuestaC.setBackground(Background.fill(Color.ALICEBLUE));
        respuestaD.setBackground(Background.fill(Color.ORANGE));
    }


    public void validacionPosicion(int idPregunta, char posicion) {
        posiciones[idPregunta] = posicion;
    }

    public void validacionRasgo(int idPregunta, char rasgo) {
        rasgos[idPregunta] = rasgo;
    }

    public void setRadioButton() {
        respuestaA.setBackground(Background.fill(Color.ALICEBLUE));
        respuestaB.setBackground(Background.fill(Color.ALICEBLUE));
        respuestaC.setBackground(Background.fill(Color.ALICEBLUE));
        respuestaD.setBackground(Background.fill(Color.ALICEBLUE));
        switch (posiciones[contador]) {
            case 'A' -> respuestaA.setBackground(Background.fill(Color.ORANGE));
            case 'B' -> respuestaB.setBackground(Background.fill(Color.ORANGE));
            case 'C' -> respuestaC.setBackground(Background.fill(Color.ORANGE));
            case 'D' -> respuestaD.setBackground(Background.fill(Color.ORANGE));
        }
    }

    public void sumarRasgos() {
        int rasgoA = 0;
        int rasgoB = 0;
        int rasgoC = 0;
        int rasgoD = 0;
        Ending fin = null;
        ArrayList<Integer> faltan = new ArrayList<Integer>();

        for (int i = 0; i < 6; i++) {
            switch (rasgos[i]) {
                case 'A' -> rasgoA++;
                case 'B' -> rasgoB++;
                case 'C' -> rasgoC++;
                case 'D' -> rasgoD++;
                default -> faltan.add(i);
            }
        }
        if (faltan.size() == 0) {
            contador = 0;
            botonSiguiente.setVisible(false);
            botonFinal.setVisible(true);
            botonFinal.setText("Finalizar");
            fin = AccederBD.selectFinal(rasgoA, rasgoB, rasgoC, rasgoD);
            ending = fin;
        } else {
            botonSiguiente.setDisable(true);
        }

    }
}

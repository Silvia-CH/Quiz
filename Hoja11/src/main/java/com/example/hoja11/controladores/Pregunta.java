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
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;


public class Pregunta {

    public static int contador = 0;
    public static Test newTest = new Test();
    public static char[] posiciones = new char[6];
    public static char[] rasgos = new char[6];

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
    private RadioButton respuestaA;

    @FXML
    private RadioButton respuestaB;

    @FXML
    private RadioButton respuestaC;

    @FXML
    private RadioButton respuestaD;

    @FXML
    public void initialize() {
        pregunta.setText((contador + 1) + ") " + newTest.getPreguntas().get(contador).getTextoPregunta());
        respuestaA.setText("A) " + newTest.getPreguntas().get(contador).getRespuestas().get(0).getTextoRespuesta());
        respuestaB.setText("B) " + newTest.getPreguntas().get(contador).getRespuestas().get(1).getTextoRespuesta());
        respuestaC.setText("C) " + newTest.getPreguntas().get(contador).getRespuestas().get(2).getTextoRespuesta());
        respuestaD.setText("D) " + newTest.getPreguntas().get(contador).getRespuestas().get(3).getTextoRespuesta());
        botonSiguiente.setBackground(Background.fill(Color.GRAY));
        botonAnterior.setBackground(Background.fill(Color.GRAY));
        botonAnterior.setDisable(true);
        botonFinal.setVisible(false);
        botonFinal.setBackground(Background.fill(Color.GREEN));
        botonFinal.setScaleZ(5);
    }

    @FXML
    public void anteriorPregunta() {
        if (contador != 0) {
            botonAnterior.setDisable(false);
            botonSiguiente.setBackground(Background.fill(Color.GRAY));
            contador--;
            pregunta.setText((contador + 1) + ") " + newTest.getPreguntas().get(contador).getTextoPregunta());
            respuestaA.setText("A) " + newTest.getPreguntas().get(contador).getRespuestas().get(0).getTextoRespuesta());
            respuestaB.setText("B) " + newTest.getPreguntas().get(contador).getRespuestas().get(1).getTextoRespuesta());
            respuestaC.setText("C) " + newTest.getPreguntas().get(contador).getRespuestas().get(2).getTextoRespuesta());
            respuestaD.setText("D) " + newTest.getPreguntas().get(contador).getRespuestas().get(3).getTextoRespuesta());
            setRadioButton();
        } else {
            botonAnterior.setDisable(true);
        }
    }

    @FXML
    public void siguientePregunta(ActionEvent event) throws IOException {
        if (contador < newTest.getPreguntas().size() - 1) {
            botonSiguiente.setBackground(Background.fill(Color.GRAY));
            botonAnterior.setDisable(false);

            respuestaA.setSelected(false);
            respuestaB.setSelected(false);
            respuestaC.setSelected(false);
            respuestaD.setSelected(false);

            contador++;
            pregunta.setText((contador + 1) + ") " + newTest.getPreguntas().get(contador).getTextoPregunta());
            respuestaA.setText("A) " + newTest.getPreguntas().get(contador).getRespuestas().get(0).getTextoRespuesta());
            respuestaB.setText("B) " + newTest.getPreguntas().get(contador).getRespuestas().get(1).getTextoRespuesta());
            respuestaC.setText("C) " + newTest.getPreguntas().get(contador).getRespuestas().get(2).getTextoRespuesta());
            respuestaD.setText("D) " + newTest.getPreguntas().get(contador).getRespuestas().get(3).getTextoRespuesta());
            setRadioButton();
        } else {
            contador = 0;
            botonSiguiente.setVisible(false);
            botonFinal.setVisible(true);
            botonFinal.setText("Finalizar");
            ending = sumarRasgos();
        }
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
        respuestaA.setSelected(true);
        respuestaB.setSelected(false);
        respuestaC.setSelected(false);
        respuestaD.setSelected(false);
    }

    @FXML
    public void selectB() {
        validacionRasgo(contador, newTest.getPreguntas().get(contador).getRespuestas().get(1).getTipo());
        validacionPosicion(contador, 'B');
        respuestaA.setSelected(false);
        respuestaB.setSelected(true);
        respuestaC.setSelected(false);
        respuestaD.setSelected(false);
    }

    @FXML
    public void selectC() {
        validacionRasgo(contador, newTest.getPreguntas().get(contador).getRespuestas().get(2).getTipo());
        validacionPosicion(contador, 'C');
        respuestaA.setSelected(false);
        respuestaB.setSelected(false);
        respuestaC.setSelected(true);
        respuestaD.setSelected(false);
    }

    @FXML
    public void selectD() {
        validacionRasgo(contador, newTest.getPreguntas().get(contador).getRespuestas().get(3).getTipo());
        validacionPosicion(contador, 'D');
        respuestaA.setSelected(false);
        respuestaB.setSelected(false);
        respuestaC.setSelected(false);
        respuestaD.setSelected(true);
    }


    public static void validacionPosicion(int idPregunta, char posicion) {
        posiciones[idPregunta] = posicion;
    }

    public static void validacionRasgo(int idPregunta, char rasgo) {
        rasgos[idPregunta] = rasgo;
    }

    public void setRadioButton() {
        respuestaA.setSelected(false);
        respuestaB.setSelected(false);
        respuestaC.setSelected(false);
        respuestaD.setSelected(false);
        switch (posiciones[contador]) {
            case 'A' -> respuestaA.setSelected(true);
            case 'B' -> respuestaB.setSelected(true);
            case 'C' -> respuestaC.setSelected(true);
            case 'D' -> respuestaD.setSelected(true);
        }
    }

    public Ending sumarRasgos() {
        int rasgoA = 0;
        int rasgoB = 0;
        int rasgoC = 0;
        int rasgoD = 0;
        Ending fin = null;

        for (int i = 0; i < 6; i++) {
            switch (rasgos[i]) {
                case 'A' -> rasgoA++;
                case 'B' -> rasgoB++;
                case 'C' -> rasgoC++;
                case 'D' -> rasgoD++;
            }
        }
        fin = AccederBD.selectFinal(rasgoA, rasgoB, rasgoC, rasgoD);
        System.out.println(fin.getNombre());
        return fin;
    }
}

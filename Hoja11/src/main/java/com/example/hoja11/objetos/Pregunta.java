package com.example.hoja11.objetos;

import com.example.hoja11.BD.AccederBD;

import java.util.ArrayList;
import java.lang.String;

public class Pregunta {
    private int idPregunta;
    private String textoPregunta;
    private char rasgo;
    private ArrayList<Respuesta> respuestas;

    public Pregunta(int idPregunta, String textoPregunta, char rasgo) {
        this.idPregunta = idPregunta;
        this.textoPregunta = textoPregunta;
        this.rasgo = rasgo;
        this.respuestas = recogerRespuestas(AccederBD.selectPregunta_has_Respuesta(this.getIdPregunta()));
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }

    public String getTextoPregunta() {
        return textoPregunta;
    }

    public void setTextoPregunta(String textoPregunta) {
        this.textoPregunta = textoPregunta;
    }

    public char getRasgo() {
        return rasgo;
    }

    public void setRasgo(char rasgo) {
        this.rasgo = rasgo;
    }

    public void setRespuestas(ArrayList<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "idPregunta=" + idPregunta +
                ", textoPregunta='" + textoPregunta + '\'' +
                ", rasgo='" + rasgo + '\'' +
                '}';
    }

    public ArrayList<Respuesta> recogerRespuestas(Pregunta_has_Respuesta lista){
        ArrayList<Respuesta> answers = new ArrayList<Respuesta>();
            answers.add(AccederBD.selectRespuesta(lista.getRespuesta_id1()));
            answers.add(AccederBD.selectRespuesta(lista.getRespuesta_id2()));
            answers.add(AccederBD.selectRespuesta(lista.getRespuesta_id3()));
            answers.add(AccederBD.selectRespuesta(lista.getRespuesta_id4()));
        return answers;
    }
}

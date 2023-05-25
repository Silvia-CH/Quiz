package com.example.hoja11.objetos;

import
        java.lang.String;
public class Respuesta {
    private int idRespuesta;
    private String textoRespuesta;
    private char tipo;
    private int Pregunta_id;

    public Respuesta(int idRespuesta, String textoRespuesta, char tipo, int pregunta_id) {
        this.idRespuesta = idRespuesta;
        this.textoRespuesta = textoRespuesta;
        this.tipo = tipo;
        Pregunta_id = pregunta_id;
    }

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getTextoRespuesta() {
        return textoRespuesta;
    }

    public void setTextoRespuesta(String textoRespuesta) {
        this.textoRespuesta = textoRespuesta;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getPregunta_id() {
        return Pregunta_id;
    }

    public void setPregunta_id(int pregunta_id) {
        Pregunta_id = pregunta_id;
    }

    @Override
    public String toString() {
        return "Respuesta{" +
                "idRespuesta=" + idRespuesta +
                ", textoRespuesta='" + textoRespuesta + '\'' +
                ", tipo=" + tipo +
                ", Pregunta_id=" + Pregunta_id +
                '}';
    }
}

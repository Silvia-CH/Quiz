package com.example.hoja11.objetos;

public class Pregunta_has_Respuesta {
    private int pregunta_id;
    private int respuesta_id1;
    private int respuesta_id2;
    private int respuesta_id3;
    private int respuesta_id4;

    public Pregunta_has_Respuesta(int pregunta_id, int respuesta_id1, int respuesta_id2, int respuesta_id3, int respuesta_id4) {
        this.pregunta_id = pregunta_id;
        this.respuesta_id1 = respuesta_id1;
        this.respuesta_id2 = respuesta_id2;
        this.respuesta_id3 = respuesta_id3;
        this.respuesta_id4 = respuesta_id4;
    }

    public int getPregunta_id() {
        return pregunta_id;
    }

    public void setPregunta_id(int pregunta_id) {
        this.pregunta_id = pregunta_id;
    }

    public int getRespuesta_id1() {
        return respuesta_id1;
    }

    public void setRespuesta_id1(int respuesta_id1) {
        this.respuesta_id1 = respuesta_id1;
    }

    public int getRespuesta_id2() {
        return respuesta_id2;
    }

    public void setRespuesta_id2(int respuesta_id2) {
        this.respuesta_id2 = respuesta_id2;
    }

    public int getRespuesta_id3() {
        return respuesta_id3;
    }

    public void setRespuesta_id3(int respuesta_id3) {
        this.respuesta_id3 = respuesta_id3;
    }

    public int getRespuesta_id4() {
        return respuesta_id4;
    }

    public void setRespuesta_id4(int respuesta_id4) {
        this.respuesta_id4 = respuesta_id4;
    }
}

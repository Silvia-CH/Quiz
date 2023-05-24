package com.example.hoja11.objetos;

import java.lang.String;

public class Ending {
    private int idFinal;
    private String nombre;
    private String foto;
    private String textoFinal;
    private int rasgoA;
    private int rasgoB;
    private int rasgoC;
    private int rasgoD;

    public Ending(int idFinal, String nombre, String textoFinal, String foto, int rasgoA, int rasgoB, int rasgoC, int rasgoD) {
        this.idFinal = idFinal;
        this.nombre = nombre;
        this.textoFinal = textoFinal;
        this.foto = foto;
        this.rasgoA = rasgoA;
        this.rasgoB = rasgoB;
        this.rasgoC = rasgoC;
        this.rasgoD = rasgoD;
    }

    public int getIdFinal() {
        return idFinal;
    }

    public void setIdFinal(int idFinal) {
        this.idFinal = idFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTextoFinal() {
        return textoFinal;
    }

    public void setTextoFinal(String textoFinal) {
        this.textoFinal = textoFinal;
    }

    public int getrasgoA() {
        return rasgoA;
    }

    public void setrasgoA(int rasgoA) {
        this.rasgoA = rasgoA;
    }

    public int getrasgoB() {
        return rasgoB;
    }

    public void setrasgoB(int rasgoB) {
        this.rasgoB = rasgoB;
    }

    public int getrasgoC() {
        return rasgoC;
    }

    public void setrasgoC(int rasgoC) {
        this.rasgoC = rasgoC;
    }

    public int getrasgoD() {
        return rasgoD;
    }

    public void setrasgoD(int rasgoD) {
        this.rasgoD = rasgoD;
    }

    @Override
    public String toString() {
        return "Ending{" +
                "idFinal=" + idFinal +
                ", nombre='" + nombre + '\'' +
                ", foto='" + foto + '\'' +
                ", textoFinal='" + textoFinal + '\'' +
                ", rasgoA=" + rasgoA +
                ", rasgoB=" + rasgoB +
                ", rasgoC=" + rasgoC +
                ", rasgoD=" + rasgoD +
                '}';
    }
}

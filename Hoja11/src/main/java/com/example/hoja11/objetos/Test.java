package com.example.hoja11.objetos;

import com.example.hoja11.BD.AccederBD;

import java.util.ArrayList;
import java.lang.String;

public class Test {
    private ArrayList<Pregunta> preguntas;
    private ArrayList<Ending> finales;

    public Test() {
        this.preguntas = recogerPreguntas();
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    @Override
    public String toString() {
        return "Test{" + "preguntas=" + preguntas + '}';
    }

    private ArrayList<Pregunta> recogerPreguntas() {
        ArrayList<Pregunta> lista = new ArrayList<Pregunta>();
        int id;
        int posicion = 0;
        int longitud = 0;
        boolean continuar = false;
        char rasgo;
        int contador;
        boolean existe = false;

        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                rasgo = 'Y';
            } else {
                rasgo = 'X';
                posicion = 6;
            }
            do {
                continuar = false;
                contador = 0;
                id = posicion + numeroRandom(6);
                if (!lista.isEmpty()) {
                    do {
                        if (contador < longitud) {
                            if (lista.get(contador).getIdPregunta() == id) {
                                continuar = true;
                            }
                        }
                        contador++;
                    } while (contador < longitud && !continuar);
                }
            } while (continuar);
            lista.add(AccederBD.selectPregunta(id, rasgo));
            longitud++;
        }
        return lista;
    }
    public static int numeroRandom(int longitud){
        int numero = 0;
        numero = (int) (Math.random() * longitud) + 1;
        return numero;
    }
}

package org.example;

public class Conversor {

    private int valor;


    public Conversor(int valor) {
        this.valor = valor;
    }

    public int converter(Conversao conversao){
        return conversao.converter(valor);
    }


}
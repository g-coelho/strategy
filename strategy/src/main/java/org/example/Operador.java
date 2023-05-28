package org.example;

public class Operador {
    private int valor;

    public int getValor() {
        return valor;
    }

    public void converterBinario(int valor){
        Conversor conversor = new Conversor(valor);
        this.valor = conversor.converter(new ConversaoBinario());
    }

    public void converterHexadecimal(int valor){
        Conversor conversor = new Conversor(valor);
        this.valor = conversor.converter(new ConversaoOctal());
    }

    public void converterTernario(int valor){
        Conversor conversor = new Conversor(valor);
        this.valor = conversor.converter(new ConversaoTernario());
    }


    public void converterQuaternario(int valor){
        Conversor conversor = new Conversor(valor);
        this.valor = conversor.converter(new ConversaoQuaternario());
    }

}

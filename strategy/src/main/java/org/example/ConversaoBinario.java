package org.example;

public class ConversaoBinario implements Conversao {

    @Override
    public int converter(int valor) {
        String bin = Integer.toBinaryString(valor);
        return Integer.parseInt(bin);
    }

}

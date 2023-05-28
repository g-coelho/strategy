package org.example;

public class ConversaoQuaternario implements Conversao{
    @Override
    public int converter(int valor) {
        StringBuilder result = new StringBuilder();
        while (valor > 0) {
            int remainder = valor % 4;
            result.insert(0, remainder);
            valor = valor / 4;
        }

        return Integer.parseInt(result.toString());

    }
}

package org.example;

public class ConversaoTernario implements Conversao {
    @Override
    public int converter(int valor) {
        int ret = 0, factor = 1;
        while (valor > 0) {
            ret += valor % 3 * factor;
            valor /= 3;
            factor *= 10;
        }
        return ret;
    }
}

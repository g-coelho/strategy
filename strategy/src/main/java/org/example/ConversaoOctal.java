package org.example;

public class ConversaoOctal implements Conversao{

    @Override
    public int converter(int valor) {
        // Initially declaring and initializing the
        // octal number with zero
        int octalNum = 0, countval = 1;
        int dNo = valor;

        // Condition check
        while (valor != 0) {

            // Decimals remainder is calculated
            int remainder = valor % 8;

            // Storing the octalvalue
            octalNum += remainder * countval;

            // Storing exponential value
            countval = countval * 10;
            valor /= 8;
        }

        // Print and display the octal
        return octalNum;
    }
}

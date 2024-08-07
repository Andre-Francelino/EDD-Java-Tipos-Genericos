package com.tiposgenericos.metodos;

import java.util.Arrays;

import static com.tiposgenericos.metodos.GenericMethod.printArray;

public class MainGenericMethod {
    public static void main(String[] args) {

        // criando array de inteiros com os números de 1 até 10
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(intArray);

        // criando array do nome de minha banda favorita
        String[] stringArray = {"M", "E", "T", "A", "L", "L", "I", "C", "A"};
        printArray(stringArray);

        // criando um array de Strings coom os botões do controle do Sega Genesis (Mega Drive III)
        String[] segaGenesisButtons = {"A", "B", "C", "X", "Y", "Z", "START", "L", "R", "LEFT <", "UP ^", "RIGHT >", "DOWN v"};
        printArray(segaGenesisButtons);


        Boolean[] booleanArray = {true, false};
        printArray(booleanArray);

        Float[] floatArray = {3.14f, 9.5f, 3.3f};
        printArray(floatArray);

    }
}

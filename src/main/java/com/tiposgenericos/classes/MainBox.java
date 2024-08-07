package com.tiposgenericos.classes;

import com.tiposgenericos.classes.Box;

public class MainBox {
    public static void main(String[] args) {
        System.out.println("=== Bem vindo aos Tipos Genéricos no Java === \n");

        System.out.println("Genenerics - Strings");
        // instanciando um objeto Box do tipo String usando construtor vázio
        Box<String> stringBox = new Box<>();
        stringBox.setItem("String Box 1");
        System.out.println(stringBox.getItem());

        // instanciando um novo objeto Box do tipo String usando construtor com argumento
        Box<String> stringBox2 = new Box<>("String Box 2 \n");
        System.out.println(stringBox2.getItem()); // se não utilizar o método GET irá retornar a referência em memória



        System.out.println("Generics - Integer");
        // instanciando um objeto Box do tipo Integer usando construtor vázio
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(85);
        System.out.println(integerBox.getItem());

        // instanciando um objeto Box do tipo Integer usando construtor com argumento
        Box<Integer> integerBox1 = new Box<>(58);
        System.out.println(integerBox1.getItem()); // se não utilizar o método GET irá retornar a referência em memória
        System.out.println("");


        System.out.println("Generics - Double");
        // instanciando um objeto Box do tipo Double usando construtor vázio
        Box<Double> doubleBox = new Box<>();
        doubleBox.setItem(3.14);
        System.out.println(doubleBox); // aqui será exibido pelo toString

        // instanciando um objeto Box do tipo Double usando construtor com argumento
        Box<Double> doubleBox1 = new Box<>(9.5);
        System.out.println(doubleBox1); // aqui será exibido pelo toString


    }
}
package com.tiposgenericos.interfaces;

public class MainPair {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new OrderedPair<>("One", 1);
        System.out.println(pair.getKey() + ": " + pair.getValue());
    }
}

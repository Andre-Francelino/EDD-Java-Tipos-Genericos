package com.tiposgenericos.classes;

// Definição de classe genérica

public class Box<T> {
    private T item;

    // construtor com argumento T
    public Box(T item) {
        this.item = item;
    }

    // construtor vázio
    public Box() {

    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Box{" +
                "item=" + item +
                '}';
    }
}

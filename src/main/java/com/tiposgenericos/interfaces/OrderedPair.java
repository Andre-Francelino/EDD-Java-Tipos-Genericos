package com.tiposgenericos.interfaces;

// implementação interface genérica
public class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // implementação obrigatória dos métodos criados na interface Pair para pegar os atributos de Chave e Valor
    @Override
    public K getKey() {
        return null;
    }

    @Override
    public V getValue() {
        return null;
    }
}

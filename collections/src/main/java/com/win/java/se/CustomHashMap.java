package com.win.java.se;

import java.util.*;

public class CustomHashMap<K, V> implements Map<K, V> {

    private static final int CAPACITY = 16;
    private int size = 0;

    private CustomEntry<K, V>[] buckets = new CustomEntry[CAPACITY];

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) return true;
        else return false;
    }

    @Override
    public boolean containsKey(Object key) {
        int index = getHash((K) key);
        if (buckets[index] != null) {
            if (buckets[index].key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (int i = 0; i < CAPACITY; i++) {
            if (buckets[i] != null) {
                CustomEntry temp = buckets[i];
                while (temp != null) {
                    if (temp.value == value) {
                        return true;
                    }
                    temp = temp.next();
                }
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        Objects.requireNonNull(key);
        int index = getHash(key);
        if (buckets[index] == null) {
            buckets[index] = new CustomEntry<K, V>(key, value);
            size++;
            return buckets[index].value;
        } else {
            if (buckets[index].value != value) {
                CustomEntry temp = buckets[index];
                while (temp.next() != null) {
                    temp = temp.next();
                }
                temp.setNext(new CustomEntry(key, value));
                buckets[index] = temp;
                return buckets[index].next().value;
            }
        }
        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    private int getHash(K key) {
        return Math.floorMod(key.hashCode(), CAPACITY);
    }

    private class CustomEntry<K, V> implements Iterator<CustomEntry<K, V>> {

        private final K key;
        private V value;
        private CustomEntry<K, V> next = null;

        CustomEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public boolean hasNext() {
            return this.next != null;
        }

        public CustomEntry<K, V> next() {
            return this.next;
        }

        void setNext(CustomEntry<K, V> next) {
            this.next = next;
        }
    }
}

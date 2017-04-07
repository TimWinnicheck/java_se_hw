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
        int index = getHash((K) key);
        if (buckets[index] != null) {
            return buckets[index].value;
        }
        return null;
    }


    public V[] getAll(Object key) {
        int index = getHash((K) key);
        if (buckets[index] != null) {
            Object[] toReturn = new Object[buckets[index].size];
            CustomEntry temp = buckets[index];
            for (int i = 0; i < buckets[index].size; i++) {
                toReturn[i] = temp.value;
                temp = temp.next();
            }
            return (V[]) toReturn;
        }
        return null;
    }

    private int getBucketSize(CustomEntry<K, V> bucket) {
        int size = 0;
        while (bucket != null) {
            size++;
            bucket = bucket.next();
        }
        return size;
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
                buckets[index].size++;
                return buckets[index].next().value;
            }
        }
        return null;
    }

    @Override
    public V remove(Object key) {
        V toReturn = null;
        int index = getHash((K) key);
        if (buckets[index] != null) {

            toReturn = get(key);
            buckets[index] = null;
        }
        return toReturn;
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

    @Override
    public String toString() {
        return "CustomHashMap{" +
                "size=" + size +
                ", buckets=" + Arrays.toString(buckets) +
                '}';
    }

    private class CustomEntry<K, V> implements Iterator<CustomEntry<K, V>> {

        private final K key;
        private V value;
        private CustomEntry<K, V> next = null;
        private int size;

        CustomEntry(K key, V value) {
            this.key = key;
            this.value = value;
            this.size = 1;
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

        @Override
        public String toString() {
            return "CustomEntry{" +
                    "key=" + key +
                    ", value=" + value +
                    ", next=" + next +
                    ", size=" + size +
                    '}';
        }
    }
}

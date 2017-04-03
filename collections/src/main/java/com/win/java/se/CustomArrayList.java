package com.win.java.se;

import java.util.*;

public class CustomArrayList<T> implements List<T> {

    public static final int CAPACITY = 10;

    private Object[] data = new Object[CAPACITY];
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (data[i] == null) {
                if (o == null) {
                    return true;
                }
            } else if (data[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                if (index >= 0 && index < size) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public T next() {
                if (index + 1 < size) {
                    index++;
                    return (T) data[index];
                } else {
                    return null;
                }
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] Array = new Object[size];
        System.arraycopy(data, 0, Array, 0, size);
        return Array;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return (T1[]) toArray();
    }

    @Override
    public boolean add(T t) {
        if (size == data.length) {
            int newLength = (data.length * 3) / 2 + 1;
            data = Arrays.copyOf(data, newLength);
        }
        data[size++] = t;
        return false;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(data[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        data = new Object[CAPACITY];
        size = 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) data[index];
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

        if (size == data.length) {
            int newLength = (data.length * 3) / 2 + 1;
            data = Arrays.copyOf(data, newLength);
        }

        if (index >= 0 && index < size) {
            add((T) data[size]);
            int i = size;
            while (i > index) {
                data[i] = data[i - 1];
                i--;
            }
            data[i] = element;
        } else {
            throw new IndexOutOfBoundsException();
        }


    }

    @Override
    public T remove(int index) {
        int length = data.length - index;
        T value = (T) data[index];
        System.arraycopy(data, index + 1, data, index, length - 1);
        size--;
        return value;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder SB = new StringBuilder();
        SB.append("{ ");

        int i = 0;
        while (i < size) {
            SB.append(data[i] + " ");
            i++;
        }

        SB.append(" }");
        return SB.toString();
    }
}

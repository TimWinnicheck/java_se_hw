package com.win.java.se;

import java.util.*;

public class CustomLinkedList<T> implements List<T> {

    private Node<T> head = new Node<>(null);
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return !head.hasNext();
    }

    @Override
    public boolean contains(Object o) {
        Node<T> node = head;
        while (node.hasNext()) {
            node = node.next;
            if (node.value == null) {
                if (o == null) {
                    return true;
                }
            } else if (node.value.equals(o)) {
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
                return getNodeByIndex(index).hasNext();
            }

            @Override
            public T next() {
                return (T) getNodeByIndex(index++).next;
            }
        };
    }

    @Override
    public Object[] toArray() {

        Object[] Array = new Object[size];
        Node<T> current = head.next;
        for (int i = 0; i < size; i++) {
            Array[i] = current.value;
            current = current.next;
        }
        return Array;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return (T1[]) toArray();
    }

    @Override
    public boolean add(T t) {
        Node<T> iterator = head;
        while (iterator.hasNext()) {
            iterator = iterator.next;
        }
        iterator.next = new Node<>(t);
        size++;
        return false;
    }

    @Override
    public boolean remove(Object o) {
        Node<T> current = head.next;
        Node<T> prev = head;
        while (current != null) {
            if (o.equals(current.value)) {
                prev.next = current.next;
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object value : c) {
            if (!contains(value)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        if (c == null) {
            return false;
        } else {
            for (Object value : c) {
                add((T) value);
            }
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        if (c == null) {
            return false;
        } else {
            for (Object value : c) {
                add(index, (T) value);
            }
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        if (c == null) {
            return false;
        } else {
            for (Object value : c) {
                remove(value);
            }
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        Objects.requireNonNull(c);

        Node<T> current = head.next;
        for (int i = 0; i < size; i++) {
            if (c.contains(current.value) != true) {
                remove(i);
            }
            current = current.next;
        }
        return true;
    }

    @Override
    public void clear() {
        head = new Node<>(null);
        size = 0;
    }

    @Override
    public T get(int index) {
        return getNodeByIndex(index).value;
    }

    @Override
    public T set(int index, T element) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> current = head.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        T previous = current.value;
        current.value = element;
        return previous;
    }

    @Override
    public void add(int index, T element) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> current = head.next;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node<T> temp = current.next;
        current.next = new Node<>(element);
        current.next.next = temp;
        size++;

    }

    @Override
    public T remove(int index) {
        Node<T> current = getNodeByIndex(index - 1);
        size--;
        T value = current.next.value;
        current.next = current.next.next;
        return value;
    }

    @Override
    public int indexOf(Object o) {
        Node<T> current = head.next;
        for (int i = 0; i < size; i++) {
            if (current.value == o) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        Node<T> current = head.next;
        int found = -1;
        for (int i = 0; i < size; i++) {
            if (current.value == o) {
                found = i;
            }
            current = current.next;
        }
        return found;
    }

    @Override
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return new ListIterator<T>() {

            private int iterator = index + 1;

            public boolean hasNext() {
                if (get(iterator) != null) {
                    return getNodeByIndex(iterator).hasNext();
                }
                return false;
            }

            public T next() {
                return getNodeByIndex(iterator++).next.value;
            }

            public boolean hasPrevious() {
                if (iterator < size && iterator > 0)
                    return true;
                else {
                    return false;
                }
            }

            public T previous() {
                if (hasPrevious() == true) {
                    return getNodeByIndex(--iterator).value;
                } else {
                    return null;
                }
            }

            public int nextIndex() {
                return iterator + 1;
            }

            public int previousIndex() {
                return iterator - 1;
            }

            public void remove() {
                CustomLinkedList.this.remove(iterator);
                iterator = iterator - 1;
            }

            public void set(T t) {
                CustomLinkedList.this.set(iterator + 1, t);
            }

            public void add(T t) {
                CustomLinkedList.this.add(t);
            }
        };
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder SB = new StringBuilder();
        SB.append("{ ");
        Node<T> iterator = head;
        while (iterator.hasNext()) {
            iterator = iterator.next;
            SB.append(iterator.value + " ");
        }
        SB.append(" }");
        return SB.toString();
    }

    private Node<T> getNodeByIndex(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> current = head.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    private class Node<T> {

        private Node<T> next;
        private T value;

        public Node(T value) {
            this.value = value;
        }

        public boolean hasNext() {
            return next != null;
        }

    }
}

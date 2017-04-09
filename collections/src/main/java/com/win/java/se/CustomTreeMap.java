package com.win.java.se;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class CustomTreeMap<K extends Comparable<K>, V> implements Map<K, V> {

    private Node<K, V> root;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean containsKey(Object key) {
        Objects.requireNonNull(key);

        if (root == null) return false;
        root.key.compareTo((K) key);
        return find(root, (K) key) != null;
    }

    @Override
    public boolean containsValue(Object value) {
        if (root == null) return false;
        if (root.value == null) {
            return value == null;
        } else {
            if (root.value.equals(value)) {
                return true;
            } else if (findValue(root, (V) value) != null) {
                return true;
            }
        }
        return false;
    }

    private Node<K, V> findValue(Node<K, V> node, V value) {
        if (node == null) {
            return null;
        }
        if (node.value.equals(value)) {
            return node;
        }
        Node out;
        out = findValue(node.left, value);
        if (out == null) {
            out = findValue(node.right, value);
            if (out != null) {
                return out;
            }
        } else {
            return out;
        }
        return null;
    }


    @Override
    public V get(Object key) {
        return find(root, (K) key).value;
    }

    @Override
    public V put(K key, V value) {
        Objects.requireNonNull(key);
        root = put(root, key, value);
        return value;
    }

    private Node<K, V> put(Node<K, V> node, K key, V value) {
        if (node == null) {
            size++;
            return new Node<>(key, value);
        }
        if (node.key.equals(key)) {
            node.value = value;
        } else if (node.key.compareTo(key) > 0) {
            node.left = put(node.left, key, value);
        } else {
            node.right = put(node.right, key, value);
        }
        return node;
    }

    private Node<K, V> find(Node<K, V> node, K key) {
        if (node == null) {
            return null;
        }
        if (node.key.equals(key)) {
            return node;
        } else if (node.key.compareTo(key) > 0) {
            return find(node.left, key);
        } else {
            return find(node.right, key);
        }
    }

    private boolean findAndRemove(Node<K, V> node, K key) {
        if (node.key.equals(key)) {
            return true;
        } else if (node.key.compareTo(key) > 0) {
            if (findAndRemove(node.left, key) == true) {
                Node temp = node.left.left;
                node.left = node.left.right;
                if (node.left != null) {
                    node.left.left = temp;

                } else {
                    node.left = temp;
                }
            }
        } else {
            if (findAndRemove(node.right, key) == true) {
                Node temp = node.right.right;
                node.right = node.right.left;
                if (node.right != null) {
                    node.right.right = temp;

                } else {
                    node.right = temp;
                }
            }
        }
        return false;
    }

    private int sizeOfNode(Node<K, V> node) {
        int out = 0;
        if (node.left != null) {
            out = out + sizeOfNode(node.left);
        } else {
            if (node.right != null) {
                out = out + sizeOfNode(node.right);
            }
        }
        if (node != null) {
            out = out + 1;
        }
        return out;
    }


    @Override
    public V remove(Object key) {
        if (find(root, (K) key) == null) {
            return null;
        }
        V valueToReturn = find(root, (K) key).value;
        size = size() - 1;
        findAndRemove(root, (K) key);
        return valueToReturn;
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

    @Override
    public String toString() {
        return "CustomTreeMap{" +
                "root=" + root +
                ", size=" + size +
                '}';
    }

    private class Node<K extends Comparable<K>, V> {
        private final K key;
        private V value;
        private Node<K, V> left;
        private Node<K, V> right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

}

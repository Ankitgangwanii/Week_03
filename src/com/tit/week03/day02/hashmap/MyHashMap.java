package com.tit.week03.day02.hashmap;

import java.util.LinkedList;

class MyHashMap {
    static class Entry {
        int key, value;
        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int SIZE = 1000;
    private LinkedList<Entry>[] map;

    public MyHashMap() {
        map = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            map[i] = new LinkedList<>();
        }
    }

    private int getHash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = getHash(key);
        for (Entry entry : map[index]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        map[index].add(new Entry(key, value));
    }

    public int get(int key) {
        int index = getHash(key);
        for (Entry entry : map[index]) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return -1; // Key not found
    }

    public void remove(int key) {
        int index = getHash(key);
        map[index].removeIf(entry -> entry.key == key);
    }

    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 10);
        hashMap.put(2, 20);
        hashMap.put(1001, 30); // Collision handled
        System.out.println(hashMap.get(1)); // Output: 10
        System.out.println(hashMap.get(2)); // Output: 20
        System.out.println(hashMap.get(1001)); // Output: 30
        hashMap.remove(2);
        System.out.println(hashMap.get(2)); // Output: -1 (Key removed)
    }
}

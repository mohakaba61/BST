package edu.citytech.finance.map;

public class MyMap<K, V> {
    private Entry<K, V>[] buckets;
    private int size = 0;
    private int collisionCount=0;
    private int capacity=30;

    public MyMap() {
        this.buckets = new Entry[capacity];
    }

    public MyMap(int capacity) {
        this.capacity=capacity;
        this.buckets = new Entry[capacity];
    }

    public void put(K key, V value) {
        Entry<K, V> entry = new Entry<>(key, value, null);

        int bucket = getHash(key) % getBucketSize();

        Entry<K, V> existing = buckets[bucket];
        if (existing == null) {
            buckets[bucket] = entry;
            size++;
        } else {
            // compare the keys see if key already exists
            collisionCount++;
            while (existing.next != null) {
                if (existing.key.equals(key)) {
                    existing.value = value;
                    return;
                }
                existing = existing.next;
            }

            if (existing.key.equals(key)) {
                existing.value = value;
            } else {
                existing.next = entry;
                size++;
            }
        }
    }

    public int size(){
        return size;
    }
    private int getHash(K key) {
        return (key.hashCode() & 0xfffffff) % this.capacity;
    }

    private int getBucketSize() {
        // TODO Auto-generated method stub
        return this.buckets.length;
    }
    public int getCollisionCount(){
        return this.collisionCount;
    }

    public V get(K key) {
        Entry<K, V> bucket = buckets[getHash(key) % getBucketSize()];

        while (bucket != null) {
            if (bucket.key.equals(key)) {
                return bucket.value;
            }
            bucket = bucket.next;
        }
        return null;
    }

}
package edu.citytech.finance.map;

import com.jbbwebsolutions.ds.facade.IMap;
import com.jbbwebsolutions.ds.facade.KeyValuePair;
import com.jbbwebsolutions.ds.facade.Summary;
import edu.citytech.finance.binarysearchtree.AVLTree;

import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class DictionaryModel <K, M extends Comparable<M> >implements IMap<K,M> {

    private AVLTree<M>[] avlBuckets;
    private int size=0;
    private int collisionCount=0;
    private int capacity=30;

    public DictionaryModel(){
        this.avlBuckets= new AVLTree[capacity];
    }

    public DictionaryModel(int capacity) {
        this.capacity=capacity;
        this.avlBuckets= new AVLTree[capacity];
    }
    private int getHash(K key) {
        return (key.hashCode() & 0xfffffff) % this.capacity;
    }

    private int getBucketIndex(K key){
        int bucket = getHash(key) % getBucketSize();
        return bucket;
    }
    @Override
    public void put(KeyValuePair<K, M> model, BiConsumer<Integer, M> biConsumer) {

        K key= model.getKey();
        M value = model.getValue();

        int bucket = getBucketIndex(key);
        AVLTree<M>  existing = avlBuckets[bucket];

        if (existing == null) {
            AVLTree<M> entry= new AVLTree<>();
            avlBuckets[bucket] = entry;
        } else {
            // compare the keys see if key already exists
            collisionCount++;
            biConsumer.accept(bucket,value);
        }
        avlBuckets[bucket].insert(value);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int getBucketSize() {
        return avlBuckets.length;
    }

    @Override
    public int getCollisionCount() {
        return collisionCount;
    }

    @Override
    public Optional<M> get(KeyValuePair<K, M> keyValuePair, Consumer<M> consumer) {

        K key = keyValuePair.getKey();
        M value = keyValuePair.getValue();
        int index= getBucketIndex(key);
        AVLTree<M> bucket = this.avlBuckets[index];

        if(bucket==null)
            return Optional.empty();

        Optional<M> m= bucket.findOne((value),consumer);
        return m;
    }

    @Override
    public double min() {
        return IMap.super.min();
    }

    @Override
    public double max() {
        return IMap.super.max();
    }

    @Override
    public Optional<M> maxT() {
        return IMap.super.maxT();
    }

    @Override
    public Optional<M> minT() {
        return IMap.super.minT();
    }

    @Override
    public double average(Predicate<M> predicate) {
        return IMap.super.average(predicate);
    }


    @Override
    public double sum() {
        double sum=0;
        for(var k: avlBuckets)
            sum+=k.sum();
        return sum ;
    }

    @Override
    public double average() {
        return sum()/size;
    }

}


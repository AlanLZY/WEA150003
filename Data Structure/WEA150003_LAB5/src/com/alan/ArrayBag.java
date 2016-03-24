package com.alan;
import java.util.*;

public class ArrayBag < T > implements BagInterface < T > {
    private T[] bag; 
    private final int DEFAULT_CAPACITY = 20;
    private int numberOfEntries;
    Random random = new Random();

    public ArrayBag(){
        T[] bag = (T[]) new Object[DEFAULT_CAPACITY];
        this.numberOfEntries = 0;
    }
    
    @Override
    public int getCurrentSize(){ return this.bag.length; }
    
    @Override
    public boolean isFull(){ return (this.DEFAULT_CAPACITY - this.bag.length  == 0); }
    
    @Override
    public boolean isEmpty(){
        return (this.bag.length == 0);
    }
    
    @Override
    public boolean add(T newEntry){
        if (!isFull()){
            bag[numberOfEntries - 1] = newEntry;
            numberOfEntries++;
            return true;
        }
            return false;
    }
    
    @Override
    public T remove(){
        int rand = random.nextInt(numberOfEntries);
        T temp;
        if (!isEmpty()){
            temp = bag[rand];
            for(int i = rand; i < bag.length; i++ ){
                if (i - bag.length != 0)
                    bag[i] = bag[i+1];
            }
            return temp;
        }
        return null;
    }
    
    @Override
    public boolean remove(T anEntry){
        if (!isEmpty()){
            for(int i = 0; i < bag.length; i++){
                if(bag[i] == anEntry)
                    for(int j = i; j < bag.length; j++ ){
                        if (j - bag.length != 0)
                        bag[j] = bag[j+1];
                    }
                break;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void clear(){
        this.bag = null;
    }
    
    @Override
    public int getFrequencyOf(Object anEntry){
        int frequency = 0;
        for (T bag1 : bag) {
            if (bag1 == anEntry) {
                frequency++;
            }
        }
        return frequency;
                
    }
    
    @Override
    public boolean contains(Object anEntry){
        for (T bag1 : bag) {
            if (bag1 == anEntry) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public T[] toArray(){
        T[] elements = (T[]) new Object[DEFAULT_CAPACITY];
        System.arraycopy(bag, 0, elements, 0, bag.length);
        return elements;
    }
}

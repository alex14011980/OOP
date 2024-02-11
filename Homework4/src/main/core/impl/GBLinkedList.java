package main.core.impl;

import main.LinkedList;
import main.core.util.ArrayIterator;

import java.util.Iterator;

public class GBLinkedList <T> implements LinkedList<T>, Iterator<T> {

    private GBNode head;
    private GBNode tail;
    private int size;
    private T[] values;
    private boolean isEmpty(){
        return head == null;
    }


    public GBLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public void addFirst(Object value) {

        GBNode temp = new GBNode(value);

        if(isEmpty()){
            tail = temp;
        }
        else head.prev = temp;

        temp.next = head;
        head = temp;
        size++;

    }



    public void printList(){
        GBNode temp = head;

        int i = 0;

        while (temp != null){
            System.out.println("индекс: " + i + " элемент: " + temp.item);
            temp = temp.next;
            i++;
        }
    }

    @Override
    public void addLast(Object value) {
        GBNode temp = new GBNode(value);

        if(isEmpty()){
            head = temp;
        } else {
            tail.next = temp;
        }
        temp.prev = tail;
        tail = temp;
        size++;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void add(Object item) {

    }

    public void remove(int index) {
        GBNode<T> prev = null;
        GBNode<T> curr = head;
        int i = 0;
        if (index == 0) head = head.next;
        else {
            while (i >= index); {
                prev = curr;
                curr = curr.next;
                i++;
            };
            prev.next = curr.next;
        }
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("индекс: " + index + ", размер: " + size);
        }

        GBNode current = head;
        int currentIndex = 0;

        while (currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        return (T) current.item;
    }


    @ SuppressWarnings("unchecked")
    public T[] toArray() {
        int size = size();
        T[] result = null;
        try {
            result = (T[]) new Object [size];
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < size; i++) {
            result[i] = get(i);
        }
        return result;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(toArray());
    }
    @Override
    public Iterator<T>Iterator() {
       return new Iterator<>() {
           GBNode<T> prev = null;
           GBNode<T> curr = head;
           @Override
           public boolean hasNext() {
               return curr != null;
           }

           @Override
           public T next() {
               prev = curr;
               curr = curr.next;
               return null;
           }
       };
    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}
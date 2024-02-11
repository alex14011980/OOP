package main;

import main.core.impl.GBLinkedList;
import java.util.LinkedList;


public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<String> linkedlist = new LinkedList<>();
        GBLinkedList<Integer> list = new GBLinkedList<>();

        list.addFirst(23);
        list.addLast(67);
        list.addFirst(98);
        list.addLast(12);
        list.addFirst(56);

        list.printList();
        System.out.println("Размер: " + list.size());
        System.out.println(list.get(4));

        System.out.println("________________________________________________");
//        list.remove(0);
//        list.printList();






        for (Object item: list){
            System.out.println(item);

        }



    }

}

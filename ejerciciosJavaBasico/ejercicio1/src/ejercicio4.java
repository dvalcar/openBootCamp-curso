package com.example;

import java.util.Vector;

public class ejercicio4 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        for (int i = 0; i < vector.size(); i++){
            System.out.println(vector.size());
            if(i%2 == 0){
                vector.remove(i);
                System.out.println(vector);
                continue;
            }
            System.out.println(vector.get(i) + " " + i);
        }
    }
}
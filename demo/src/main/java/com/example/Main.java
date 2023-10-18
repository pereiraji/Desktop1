package com.example;

import java.util.HashSet;
import java.util.Set;
import java.awt.Point;

import org.xml.sax.HandlerBase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Conjuntos!");

        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);

        System.out.println(s1);
        System.out.println(s1.contains(1));

        Set<Integer> empty = new HashSet<>();
        System.out.println(s1.containsAll(empty));
        Set<Integer> s2 = new HashSet<>();
        s2.add(1);
        s2.add(2);

        Set<Integer> s3 = new HashSet<>();
        s3.add(1);
        s3.add(2);
        s3.add(3);
        s3.add(4);

        System.out.println(s3.containsAll(s2));

        Set<Integer> dif = new HashSet<>(s3);
        dif.removeAll(s2);

        System.out.println(s3.containsAll(s2) && !dif.isEmpty());

        Set<Integer> s4 = new HashSet<>();
        s4.add(1);
        s4.add(2);
        s4.add(5);

        Set<Integer> dif2 = new HashSet(s3);
        dif2.removeAll(s2);

        System.out.println(dif2);

        Set <Integer> s5 = new HashSet<>();
        s5.add(1);
        s5.add(2);

        Set <Integer> s6 = new HashSet<>();
        s6.add(3);
        s6.add(4);

        Set <Point> prod = new HashSet<>();

        for (Integer a : s5){
            for (Integer b : s6){
                Point p = new Point(a,b);
                prod.add(p);
            }

        }
        System.out.println(prod);

        
    }
}
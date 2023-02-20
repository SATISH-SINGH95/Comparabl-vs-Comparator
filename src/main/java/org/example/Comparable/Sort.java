package org.example.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {

        List<Employee> l = new ArrayList<>();
        l.add(new Employee(1, "satish", "lucknow"));
        l.add(new Employee(3, "manish", "Bihar"));
        l.add(new Employee(2, "rahul", "delhi"));

        System.out.println("Before sorting");
        System.out.println(l);


        System.out.println("After sorting");
        Collections.sort(l);
        System.out.println(l);



    }
}
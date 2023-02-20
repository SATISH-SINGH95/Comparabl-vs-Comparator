package org.example.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// for multiple sorting login we use compartor

public class Sort {
    public static void main(String[] args) {

        List<Employee> l = new ArrayList<>();
        l.add(new Employee(1, "satish", "lucknow"));
        l.add(new Employee(3, "manish", "bihar"));
        l.add(new Employee(2, "rahul", "delhi"));

        System.out.println("Before sorting");
        System.out.println(l);

        System.out.println();

        System.out.println("After sorting");
        System.out.println("Sorting by ID");
        Collections.sort(l, new sortById());
        System.out.println(l);

        System.out.println();

        List<Employee> l1 = new ArrayList<>(l);
        System.out.println("Sorting by Name");
        Collections.sort(l1, new SortByName());
        System.out.println(l1);

        System.out.println();

        List<Employee> l2 = new ArrayList<>(l);
        System.out.println("Sorting by City");
        Collections.sort(l2, new SortByCity());
        System.out.println(l2);





    }
}
package org.example.Comparator;

import java.util.Comparator;

public class SortByCity implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getCity().compareTo(o2.getCity());
    }
}

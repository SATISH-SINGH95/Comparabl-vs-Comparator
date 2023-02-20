package org.example.Comparator;

// comparable interface is used to sort the objects or we can say user defined objects;

// we can sort elements of String objects, Wrapper class objects, User-defined class objects

// The limitation of comparable interface is that it provides only single sorting technique.
// Using this interface we can sort the object only by using one attribute.

// This interface is found in java.lang package and contains only one method named compareTo(Object).
// Return type of this method is integer.


public class Employee{

    private int id;
    private String name;
    private String city;



    public Employee(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + city ;
    }


}

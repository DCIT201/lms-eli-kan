// Patron class
package org.example;

public class Patron {
    private String name;
    private int id;

    public Patron(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
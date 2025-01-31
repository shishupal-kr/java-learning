package OOPS.This_keyword;

class Student {
    private String name;

    public Student setName(String name) {
        this.name = name;
        return this; // Returns the current object
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("John").display(); // Method changing
    }
}
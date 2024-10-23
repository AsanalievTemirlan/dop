package org.example;

public class Human implements Action {
    private int age;
    private String name;
    private int height;
    private String lastName;

    public Human(int age, String name, int height, String lastName) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void move() {
        System.out.println("Пошел домой");
    }
}

package org.example;

public class Oleg extends Human{
    private String work;
    private boolean familyStatus;

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public boolean isFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(boolean familyStatus) {
        this.familyStatus = familyStatus;
    }

    public Oleg(int age, String name, int height, String lastName, String work, boolean familyStatus) {
        super(age, name, height, lastName);
        this.work = work;
        this.familyStatus = familyStatus;
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Олег пошел в психологу");
    }
}

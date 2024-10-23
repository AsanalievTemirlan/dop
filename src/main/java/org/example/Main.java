package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        final String MOVE = "jdalwkd";

        System.out.println("I live in " + Name.BISHKEK);

        Human nikita = new Human(10, "Nikita", 150, "Bobrov");

        Oleg name = new Oleg(40, "Oleg", 180, "Bykov", "Danser", true);

        name.setWork("Programer");


        boolean g = false;
        String s = "fjaesgbkjl;sfg;hdkjf'E:LKf';dskf;dlsmf;lkds';fkds'f";


        float d = 234.0f;
        double ty = 234.23;
        int a = 23;


        char q = 's';

        System.out.println(calculate(1,3, "-"));
        System.out.println(three());
        two(12);

        ArrayList<String> names = new ArrayList<>();
        names.add("Emiliano");
        names.add("Sadyr Japarov");
        names.add("Putin");
        names.add("Beka");
        names.add("Aika");
        names.add("sekdglfkmgl;d");
        names.add("wadawdaw");
        names.add("dawda");
        names.add("dawdaw");
        names.add("daww");


        for (String at: names){
            System.out.println(" Salam " + at);
        }

        int m = 0;



    }




    private static void salam(ArrayList name){
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Salam " + name.get(i));
        }

    }


    static void two(int a){
        System.out.println(a);
    }
    static String three(){
        return "kfslkef";
    }
    static int four(int q){
        return q + 1;
    }


    private static int calculate(int a, int b, String comand){
        switch (comand){
            case "-" -> {
                return a - b;
            }case "+" -> {
                return a + b;
            }case "*" -> {
                return a * b;
            }case "/" -> {
                if (a == 0 && b == 0){
                    return 0;
                }
                else {
                    return a / b;
                }
            }
        }
        return 0;
    }
}
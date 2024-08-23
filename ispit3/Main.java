package org.example.cas4.ispit3;

public class Main {

    public static void main(String[] args) {
        try {
            Student s1 = StudentFactory.getInstance("2017200179", "Pera", "Peric");
            Student s2 = StudentFactory.getInstance("2017640199", "Ivana", "Peric");
            Student s3 = StudentFactory.getInstance("2017945007", "Tijana", "Peric");
            Student s4 = StudentFactory.getInstance("20#_118067", "L", "Peric");

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);

        } catch (Exception ex){
            System.out.println("Izuzetak");
        }
    }
}

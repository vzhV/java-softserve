package taskRunners;

import models.Wheel;

public class Equals_HashCode {
    public static void main(String[] args) {
        //override only equals (comment hashCode method)
        //Hashcodes are not equal, but objects that are equal must return the same hashCode

        //override only hashCode (comment equals method)
        //It uses default implementation of equals that is in Object class, and it returns true only if we compare object to itself

        //If hashCode return same value for different objects
        //If we use hash table, it will degrade the functionality of it , as every object would be stored in the same single bucket

        //If equals return same value for different objects
        //In hashCode contract there is a rule that unequal objects may have the same hashCode, but two objects
        //with distinct hashCode must not be equal


        Wheel w1 = new Wheel();
        Wheel w2 = new Wheel();
        w2.setTempId(w1.getTempId());
        System.out.println("Wheel1 hashcode : " + w1.hashCode());
        System.out.println("Wheel2 hashcode : " + w2.hashCode());
        System.out.println("Wheels are equal : " + w1.equals(w2));
    }
}

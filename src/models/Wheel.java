package models;

import java.util.Random;

public class Wheel {

    //temporary variable to test equals/hashcode
    private long tempId;

    public Wheel(){
        Random r = new Random();
        tempId = r.nextInt();
        System.out.println("Create wheel");
    }

    @Override
    public String toString() {
        return "Wheel{}";
    }

    public long getTempId() {
        return tempId;
    }

    public void setTempId(long tempId) {
        this.tempId = tempId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wheel wheel = (Wheel) o;

        return tempId == wheel.tempId;
    }

    @Override
    public int hashCode() {
        return (int) (tempId ^ (tempId >>> 32));
    }
}
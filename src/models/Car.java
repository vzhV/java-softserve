package models;

import exceptions.MissingEngineException;
import models.engines.AbstractEngine;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.abs;

public class Car implements Comparable<Car>{
    private final Wheel[] wheels = new Wheel[4];
    private AbstractEngine engine;
    private final int weight;

    public Car(){
        Random r = new Random();
        weight = abs(r.nextInt());
        for(int i = 0; i < 4; i++){
            wheels[i] = new Wheel();
        }
    }

    public Car(AbstractEngine eng){
        this();
        engine = eng;
        System.out.println("Create " + eng);
        System.out.println("Car has been created");
    }

    public void drive(){
        if(engine != null){
            System.out.println("Car is ready to ride somewhere");
        }
        else{
            throw new MissingEngineException("Engine is missing!");
        }
    }

    public AbstractEngine getEngine() {
        return engine;
    }

    public void setEngine(AbstractEngine eng) {
        this.engine = eng;
        System.out.println(eng + " has been added to your car!");
    }

    public int getWeight() {
        return weight;
    }

    public boolean wheelsEquals(){
        return wheels[0].equals(wheels[1]) &&
                wheels[0].equals(wheels[2]) &&
                wheels[0].equals(wheels[3]);
    }

    @Override
    public String toString() {
        return "Car {" +
                "wheels = " + Arrays.toString(wheels) +
                ", engine = " + (engine == null ? "Engine is missing" : engine) +
                ", weight = " + this.weight + " kg " +
                '}';
    }


    @Override
    public int compareTo(Car anotherCar) {
        return Integer.compare(this.getWeight(), anotherCar.getWeight());
    }
}
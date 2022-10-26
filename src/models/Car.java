package models;

import exceptions.MissingEngineException;
import models.engines.AbstractEngine;

import java.util.Arrays;

public class Car {
    private final Wheel[] wheels = new Wheel[4];
    private AbstractEngine engine;

    public Car(){
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

    @Override
    public String toString() {
        return "Car {" +
                "wheels = " + Arrays.toString(wheels) +
                ", engine = " + (engine == null ? "Engine is missing" : engine) +
                '}';
    }
}
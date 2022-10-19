import exceptions.UnknownEngineException;
import models.Car;
import models.Engine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter engine type: ");
        Engine carEngine = null;
        try {
            carEngine = Engine.findByValue(sc.nextLine());
        } catch (UnknownEngineException e) {
            System.out.println(e.getMessage());
        }
        Car car1 = carEngine == null ? new Car() : new Car(carEngine);
        car1.drive();
        System.out.println(car1);
    }
}
import exceptions.UnknownEngineException;
import models.*;
import models.engines.ElectricalMotor;
import models.engines.EngineEnum;
import models.engines.FuelMotor;
import models.engines.GasMotor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter engine type: ");
        EngineEnum carEngine = null;
        try {
            carEngine = EngineEnum.findByValue(sc.nextLine());
        } catch (UnknownEngineException e) {
            System.out.println(e.getMessage());
            System.out.println("Default (Electrical motor) will be set");
        }

        Car car1;
        if(carEngine == EngineEnum.FUEL_MOTOR){
            car1 = new Car(new FuelMotor());
        }
        else if(carEngine == EngineEnum.GAS_MOTOR){
            car1 = new Car(new GasMotor());
        }
        else{
            car1 = new Car(new ElectricalMotor());
        }

        car1.drive();
        System.out.println(car1);
    }
}
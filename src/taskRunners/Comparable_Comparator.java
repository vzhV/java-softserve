package taskRunners;

import comparators.CarEngineComparator;
import models.Car;
import models.engines.ElectricalMotor;
import models.engines.FuelMotor;
import models.engines.GasMotor;

import java.util.ArrayList;
import java.util.List;

public class Comparable_Comparator {
    public static void main(String[] args) {
        //Compare two cars by their weight using Comparable

        Car firstCar = new Car();
        Car secondCar = new Car();

        int tempRes = firstCar.compareTo(secondCar);
        if(tempRes > 0){
            System.out.println("First car > Second car");
        }
        else if(tempRes < 0){
            System.out.println("Second car > First car");
        }
        else{
            System.out.println("Equal");
        }
        System.out.println(firstCar);
        System.out.println(secondCar);

        //Compare Engine's horsepower using comparator

        List<Car> ls = new ArrayList<>();
        Car thirdCar = new Car(new FuelMotor());
        firstCar.setEngine(new ElectricalMotor());
        secondCar.setEngine(new GasMotor());
        ls.add(firstCar);
        ls.add(secondCar);
        ls.add(thirdCar);
        System.out.println(ls);
        ls.sort(new CarEngineComparator());
        System.out.println(ls);
    }
}

package comparators;

import models.Car;

import java.util.Comparator;

public class CarEngineComparator implements Comparator<Car> {
    @Override
    public int compare(Car firstcar, Car secondcar) {
        return Integer.compare((int) firstcar.getEngine().getHorsePower(), (int) secondcar.getEngine().getHorsePower());
    }
}

package models;

import exceptions.UnknownEngineException;

public enum Engine {
    ELECTRICAL_MOTOR("Electrical Motor"),
    FUEL_MOTOR("Fuel Motor"),
    GAS_MOTOR("Gas Motor");

    private final String value;

    Engine(String val) {
        this.value = val;
    }

    public static Engine findByValue(String name) throws UnknownEngineException {
        for(Engine eng : values()){
            if(eng.value.equalsIgnoreCase(name)){
                return eng;
            }
        }
        throw new UnknownEngineException("Unknown motor : " + name);
    }

    @Override
    public String toString() {
        return value;
    }
}
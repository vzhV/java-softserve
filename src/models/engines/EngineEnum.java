package models.engines;

import exceptions.UnknownEngineException;

public enum EngineEnum {
    ELECTRICAL_MOTOR("Electrical Motor"),
    FUEL_MOTOR("Fuel Motor"),
    GAS_MOTOR("Gas Motor");

    private final String value;

    EngineEnum(String val) {
        this.value = val;
    }

    public static EngineEnum findByValue(String name) throws UnknownEngineException {
        for(EngineEnum eng : values()){
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
package main.java.vehicles.components;

import main.java.vehicles.components.carComponents.EngineImpl;

public class Calculator {
    public static Integer doCalculations() {
        Integer temp = EngineImpl.getInteger();
        return temp;
    }
}

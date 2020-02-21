package model.circuit;

import static view.TextConstants.*;

public enum HeatingDeviceName {
    KETTLE(NAME_KETTLE),
    HEATER(NAME_HEATER),
    FAN(NAME_FAN),
    BOILER(NAME_BOILER);

    private final String name;

    private HeatingDeviceName(String name){
        this.name = name;
    }
    public String getName(){ return name; }
}

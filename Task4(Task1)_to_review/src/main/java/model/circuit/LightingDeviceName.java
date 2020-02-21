package model.circuit;

import static view.TextConstants.*;

public enum LightingDeviceName {
    FILAMENT_LAMP(NAME_FILAMENT_LAMP),
    FLOOR_LAMP(NAME_FLOOR_LAMP),
    SEARCHLIGHT(NAME_SEARCHLIGHT),
    TABLE_LAMP(NAME_TABLE_LAMP);

    private final String name;

    private LightingDeviceName(String name){
        this.name = name;
    }
    public String getName(){ return name; }
}

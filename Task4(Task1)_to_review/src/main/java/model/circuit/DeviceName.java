package model.circuit;
import static view.TextConstants.*;

public enum DeviceName {
    MICROWAVE(NAME_MICROWAVE),
    FRIDGE(NAME_FRIDGE),
    PC(NAME_PC),
    TV(NAME_TV);

    private final String name;

    private DeviceName(String name){
        this.name = name;
    }
    public String getName(){ return name; }
}

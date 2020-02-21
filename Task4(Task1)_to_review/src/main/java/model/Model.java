package model;

import model.circuit.Device;
import model.circuit.Circuit;
import model.circuit.Circuit.*;

public class Model {
    private int size;
    private Circuit electricCircuit;

    /**
     *
     * @param count
     */
    public void initEntity(int count){
        size = count;
        electricCircuit = new Circuit(size);
    }

    public Device getDevice(int index) { return electricCircuit.getDeviceByIndex(index); }
    public Circuit getElectricCircuit() { return electricCircuit; }
}

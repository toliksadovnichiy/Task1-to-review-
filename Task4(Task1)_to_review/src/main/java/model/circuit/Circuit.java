package model.circuit;

import java.util.ArrayList;

public class Circuit {
    private int countOfDevices;
    private int powerConsumption;
    private Device [] circuit;

    public Circuit(){
        countOfDevices = 0;
        powerConsumption = 0;
    }
    public Circuit(int count){
        countOfDevices = count;
        circuit = new Device[countOfDevices];
    }
    public void countPowerConsumption(){
        for(int i = 0; i < countOfDevices; i++){
            powerConsumption += circuit[i].getPowerInW();
        }
    }

    public void sortByPower(){
        for(int i = 0; i < countOfDevices-1; i++) {
            for(int j = 0; j < countOfDevices-i-1; j++) {
                if (circuit[j].compareTo(circuit[j+1]) == 1) {
                    Device temp = circuit[j];
                    circuit[j] = circuit[j+1];
                    circuit[j+1] = temp;
                }
            }
        }
    }

    public ArrayList<Integer> findDevicesInRange(double min, double max){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < countOfDevices; i++){
            double curr = circuit[i].getPowerInW();
            if(min < max && curr > min && curr < max){
                arr.add(i);
            }
        }
        return arr;
    }

    public int getCountOfDevices() { return countOfDevices; }
    public Device[] getCircuit() { return circuit; }
    public Device getDeviceByIndex(int index) { return circuit[index]; }
    public double getPowerConsumption() { return powerConsumption; }

    public void setDeviceByIndex(int index, Device device){
        circuit[index] = device;
    }
    public void setSumOfPower(int powerConsumption) { this.powerConsumption = powerConsumption; }
}

package model.circuit;

import view.TextConstants;



public class Device {
    private String name;
    private int powerInW;
    private boolean state;
    private int heightInCm;
    private int weightInG;

    public Device(){
        powerInW = 0;
        state = false;
        heightInCm = 0;
        weightInG = 0;
    }
    public Device(String name, int power, boolean state,
                  int heightInCm, int weightInG){
        this.name = name;
        this.powerInW = power;
        this.state = state;
        this.heightInCm = heightInCm;
        this.weightInG = weightInG;
    }

    public int compareTo(Device device){
        if(this.getPowerInW() > device.getPowerInW()) {
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return TextConstants.MES_DEVICE + getName() + TextConstants.NEW_LINE +
               TextConstants.MES_POWER + getPowerInW() + TextConstants.SPACE +
               TextConstants.MES_STATE + getState() + TextConstants.NEW_LINE +
               TextConstants.MES_HEIGHT + getHeightInCm() + TextConstants.SPACE +
               TextConstants.MES_WEIGHT + getWeightInG() + TextConstants.NEW_LINE;
    }

    public void setName(String name) { this.name = name; }
    public void setPowerInKw(int power) { this.powerInW = power; }
    public void setState(boolean state) { this.state = state; }
    public void setHeightInCm(int heightInCm) { this.heightInCm = heightInCm; }
    public void setWeightInG(int weightInG) { this.weightInG = weightInG; }

    public String getName() { return name; }
    public int getPowerInW() { return powerInW; }
    public boolean getState(){ return state; }
    public double getHeightInCm() { return heightInCm; }
    public double getWeightInG() { return weightInG; }
}

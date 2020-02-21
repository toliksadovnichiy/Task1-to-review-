package model.circuit;

import view.TextConstants;

public class HeatingDevice extends Device{
    private int numberOfHeaters;
    private int maxTemperatureInCelsius;

    public HeatingDevice(){
        numberOfHeaters = 0;
        maxTemperatureInCelsius = 0;
    }

    public HeatingDevice(String name, int pwInW, boolean state, int hInCm,
                         int wInG, int nOfHeaters, int maxTempInC){
        super(name, pwInW, state, hInCm, wInG);
        numberOfHeaters = nOfHeaters;
        maxTemperatureInCelsius = maxTempInC;
    }

    @Override
    public String toString() {
        return TextConstants.MES_DEVICE + getName() + TextConstants.NEW_LINE +
            TextConstants.MES_POWER + getPowerInW() + TextConstants.SPACE +
            TextConstants.MES_STATE + getState() + TextConstants.NEW_LINE +
            TextConstants.MES_HEIGHT + getHeightInCm() + TextConstants.SPACE +
            TextConstants.MES_WEIGHT + getWeightInG() + TextConstants.NEW_LINE +
            TextConstants.MES_NUMBER_OF_HEATERS + getNumberOfHeaters() +
            TextConstants.SPACE + TextConstants.MES_MAX_TEMPERATURE +
            getMaxTemperatureInCelsius() + TextConstants.NEW_LINE;
    }

    public void setNumberOfHeaters(int numberOfHeaters) {
        this.numberOfHeaters = numberOfHeaters;
    }
    public void setMaxTemperatureInCelsius(int maxTemperatureInCelsius) {
        this.maxTemperatureInCelsius = maxTemperatureInCelsius;
    }

    public int getNumberOfHeaters() { return numberOfHeaters; }

    public int getMaxTemperatureInCelsius() { return maxTemperatureInCelsius; }
}

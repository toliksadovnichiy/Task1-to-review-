package model.circuit;

import view.TextConstants;

public class LightingDevice extends Device {
    private int luminousFlux;
    private int lightEfficiency;

    public LightingDevice(){
        luminousFlux = 0;
        lightEfficiency = 0;
    }
    public LightingDevice(String name, int pwInKw, boolean state,
                          int hInCm, int wInKg, int lFlux, int lEff){
        super(name, pwInKw, state, hInCm, wInKg);
        luminousFlux = lFlux;
        lightEfficiency = lEff;
    }

    @Override
    public String toString() {
        return TextConstants.MES_DEVICE + getName() + TextConstants.NEW_LINE +
            TextConstants.MES_POWER + getPowerInW() + TextConstants.SPACE +
            TextConstants.MES_STATE + getState() + TextConstants.NEW_LINE +
            TextConstants.MES_HEIGHT + getHeightInCm() + TextConstants.SPACE +
            TextConstants.MES_WEIGHT + getWeightInG() + TextConstants.NEW_LINE +
            TextConstants.MES_LUMINOUS_FLUX + getLuminousFlux() + TextConstants.SPACE +
            TextConstants.MES_LIGHT_EFFICIENCY + getLightEfficiency() + TextConstants.NEW_LINE;
    }

    public void setLuminousFlux(int luminousFlux) { this.luminousFlux = luminousFlux; }
    public void setLightEfficiency(int lightEfficiency) { this.lightEfficiency = lightEfficiency; }

    public int getLuminousFlux() { return luminousFlux; }
    public int getLightEfficiency() { return lightEfficiency; }
}

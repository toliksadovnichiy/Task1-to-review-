/*package Controller;
import Model.ElectricCircuit.Device;
import Model.Model;
import View.*;

public class OutputController {
    private Model model;
    private View view;

    public OutputController(Model model, View view){
        this.model = model;
        this.view = view;
    }
    public void printDeviceInfo(Device device){
        view.printMessage(TextConstants.MES_DEVICE + device.getName());
        view.printMessage(TextConstants.MES_POWER + device.getPowerInKw() +
                TextConstants.MES_SPACE + TextConstants.MES_STATE + device.getState());
        view.printMessage(TextConstants.MES_HEIGHT + device.getHeightInCm() +
                TextConstants.MES_SPACE + TextConstants.MES_WEIGHT + device.getWeightInKg());

    }
    public void printHeatingDeviceInfo(Device device){
        printDeviceInfo(device);
        view.printMessage(TextConstants.MES_NUMBER_OF_HEATERS + device.get);
    }
}*/

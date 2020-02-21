package controller;

import model.circuit.*;
import model.Model;
import view.*;

import static model.circuit.DeviceName.*;
import static model.circuit.HeatingDeviceName.*;
import static model.circuit.LightingDeviceName.*;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private int chose;
    public static ResourceBundle bundle;
    public final int min = 0;
    public final int max = 1000;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        chose = 0;
    }

    public void runProcess(){
        Scanner sc = new Scanner(System.in);
        Locale locale;
        if(choseLang(sc) == 1){
            locale = new Locale("en", "US");
        } else {
            locale = new Locale("ua", "UA");
        }
        bundle = ResourceBundle.getBundle("message", locale);
        int size = 5;
        fillEntity(size);
        menu(sc);
    }

    public int choseLang(Scanner sc){
        checkInt(sc, StringConstants.MES_CHOSE_LANG);
        if(chose == 1) {
            return 1;
        }else if(chose == 2){
            return 2;
        }
        else {
            view.printMessage(StringConstants.INCORRECT_INPUT);
             return choseLang(sc);
        }
    }

    /**
     *
     * @param size
     */
    public void fillEntity(int size){
        model.initEntity(size);
        model.getElectricCircuit().setDeviceByIndex(0, new Device(MICROWAVE.getName(), 1500, true,
                35, 5200));
        model.getElectricCircuit().setDeviceByIndex(1, new HeatingDevice(KETTLE.getName(), 2700, true,
                25, 1200, 1, 100));
        model.getElectricCircuit().setDeviceByIndex(2, new LightingDevice(FILAMENT_LAMP.getName(), 100, false,
                14, 100, 810, 8100));
        model.getElectricCircuit().setDeviceByIndex(3, new Device(FRIDGE.getName(), 300, true,
                190, 50000));
        model.getElectricCircuit().setDeviceByIndex(4, new HeatingDevice(HEATER.getName(), 1300, true,
                50, 6, 2, 120));
    }

    /**
     *
     * @param sc
     */
    public void menu(Scanner sc){
        checkInt(sc, TextConstants.MES_MENU);
        if(chose == 0){
            System.exit(1);
        } else if(chose == 1){
            showInfo(sc);
            menu(sc);
        }else if(chose == 2){
            ArrayList<Integer> arr = model.getElectricCircuit().findDevicesInRange(min, max);
            view.printMessage(TextConstants.MES_FIND_IN_RANGE + ' ' +
                    TextConstants.MES_POWER + " [" + min + "; " + max + "]\n");
            for(int i = 0; i < arr.size(); i++){
                view.printMessage(model.getDevice(arr.get(i)).toString());
            }
            menu(sc);
        }else if(chose == 3){
            view.printMessage(TextConstants.MES_SORTING_BY_POWER);
            model.getElectricCircuit().sortByPower();
            menu(sc);
        }
        else{
            menu(sc);
        }
    }

    /**
     *
     * @param sc
     */
    public void showInfo(Scanner sc){
        checkInt(sc, TextConstants.MES_SHOW_INFO);
        if (chose == 1) {
            view.printMessage(TextConstants.MES_ELECTRIC_CIRCUIT);
            for (int i = 0; i < model.getElectricCircuit().getCountOfDevices(); i++) {
                view.printMessage(model.getDevice(i).toString());
            }
        } else if (chose == 2) {
            view.printMessage(TextConstants.MES_STATE_ON_DEVICES + ':');
            for (int i = 0; i < model.getElectricCircuit().getCountOfDevices(); i++) {
                if (model.getDevice(i).getState()) {
                    view.printMessage(model.getDevice(i).toString());
                }
            }
        } else{
            showInfo(sc);
        }
    }

    public void showDeviceInfo(){

    }

    /**
     *
     * @param sc
     * @param message
     */
    public void checkInt(Scanner sc, String message){
        String temp;
        view.printMessage(message);
        while(!(sc.hasNext() && (temp = sc.next()).matches(StringConstants.REGEX_INT))){
            view.printMessage(StringConstants.INCORRECT_INPUT + ' ' + message);
        }
        chose = Integer.parseInt(temp);
    }

    public Model getModel() { return model; }
    public View getView() { return view; }
}

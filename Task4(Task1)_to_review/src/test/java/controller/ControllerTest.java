package controller;

import org.junit.*;
import model.Model;
import view.View;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ControllerTest {

    @Test
    public void findDevicesInRange() {
    }

    @Test
    public void sortByPower() {
        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller(new Model(), new View());
        controller.bundle = ResourceBundle.getBundle("message", new Locale("en", "US"));
        controller.fillEntity(5);
        controller.getModel().getElectricCircuit().sortByPower();
        for(int i = 1; i < controller.getModel().getElectricCircuit().getCountOfDevices(); i++) {
            if (controller.getModel().getDevice(i).getPowerInW() < controller.getModel().getDevice(i - 1).getPowerInW()) {
                Assert.fail("Sorting fail");
            }
        }
    }
}
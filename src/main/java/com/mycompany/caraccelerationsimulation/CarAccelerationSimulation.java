/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.caraccelerationsimulation;

import javax.swing.JOptionPane;

/**
 *
 * @author msaad
 */
public class CarAccelerationSimulation {

    public static void main(String[] args) {
        String make = JOptionPane.showInputDialog("Enter the car's make:");
        int yearModel = Integer.parseInt(JOptionPane.showInputDialog("Enter the car's year model:"));

        Car myCar = new Car(yearModel, make);

        String message = "Controls:\n"
                + "A - Accelerate (increase speed by 5)\n"
                + "B - Brake (decrease speed by 5)\n"
                + "E - Exit the program";

        JOptionPane.showMessageDialog(null, message);

        while (true) {
            String input = JOptionPane.showInputDialog("Current speed: " + myCar.getSpeed() + " mph\n"
                    + "Enter A to accelerate, B to brake, E to exit:");

            if (input == null) {
                break;
            }

            input = input.toUpperCase();

            switch (input) {
                case "A":
                    myCar.speed();
                    break;
                case "B":
                    myCar.brake();
                    break;
                case "E":
                    JOptionPane.showMessageDialog(null, "Exiting program. Final speed: " + myCar.getSpeed() + " mph");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter A, B, or E.");
                    break;
            }
        }
    }
}

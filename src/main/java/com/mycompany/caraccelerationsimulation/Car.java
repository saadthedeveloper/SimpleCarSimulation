package com.mycompany.caraccelerationsimulation;

/**
 * Car class simulates a car with year model, make, and speed. It includes
 * methods to accelerate and brake.
 */
public class Car {

    private int yearModel; // The car's year model
    private String make;   // The car's make (brand)
    private int speed;     // The car's speed, starting at 0

    /**
     * Constructor that initializes the car's year model and make, and sets the
     * initial speed to 0.
     *
     * @param yearModel The car's year model
     * @param make The car's make (brand)
     */
    public Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0; // Initial speed is 0
    }

    /**
     * Returns the car's year model.
     *
     * @return The year model of the car
     */
    public int getYearModel() {
        return yearModel;
    }

    /**
     * Returns the car's make (brand).
     *
     * @return The make of the car
     */
    public String getMake() {
        return make;
    }

    /**
     * Returns the current speed of the car.
     *
     * @return The current speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Increases the car's speed by 5.
     *
     * @return The new speed after acceleration
     */
    public int speed() {
        speed += 5;
        return speed;
    }

    /**
     * Decreases the car's speed by 5.
     *
     * @return The new speed after braking
     */
    public int brake() {
        speed -= 5;
        return speed;
    }
}

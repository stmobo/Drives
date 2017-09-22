package org.usfirst.frc.team5002.drive.swerve;

import com.ctre.CANTalon;

/**
 * This tells what angle the Swerve motors should be pointing
 * and what speed the wheels should be going.
 *
 * @author Zack Vega
 */
public class SwerveModule {

    //crreates instance variables for the Talons and pidController
    private CANTalon angleMotor;
    private CANTalon speedMotor;

    private double angle;
    private double speed;


    //says what a SwerveModule is
    public SwerveModule(int angleMotor, int speedMotor) {
        this.angleMotor = new CANTalon(angleMotor);
        this.speedMotor = new CANTalon(speedMotor);
    }

    /**
     * Set the speed of the module.
     */
    public void setSpeed(double speed) {
        this.speed = speed;
        this.drive(this.speed, this.angle);
    }

    /**
     * Set the angle of the module.
     */
    public void setAngle(double angle) {
        this.angle = angle;
        this.drive(this.speed, this.angle);
    }

    // Sets the values relating to where the wheel should point
    public void drive(double speed, double angle) {

        this.speedMotor.set(speed);
        this.angleMotor.set(angle);
    }
}

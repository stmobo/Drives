package org.usfirst.frc.team5002.drive.swerve;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.PIDController;

/**
 * This tells what angle the Swerve motors should be pointing
 * and what speed the wheels should be going.
 *
 * @author Zack Vega
 */
public class SwerveModule {

    //crreates instance variables for the Talons and pidController
    private Talon angleMotor;
    private Talon speedMotor;
    private PIDController pidController;

    private double angle;
    private double speed;

    //Establishes the Max voltage the swerve motors can take
    private final double MAX_VOLTS = 12;

    //says what a SwerveModule is
    public SwerveModule(int angleMotor, int speedMotor, int encoder) {
        this.angleMotor = new Talon(angleMotor);
        this.speedMotor = new Talon(speedMotor);

        //creates the pidController and says what it does

        pidController = new PIDController(1, 0, 0, new AnalogInput(encoder), this.angleMotor);

        pidController.setOutputRange(-1, 1);
        pidController.setContinuous();
        pidController.enable();
    }

    public void setSpeed(double speed) {
        this.speed = speed;
        this.drive(this.speed, this.angle);
    }

    public void setAngle(double angle) {
        this.angle = angle;
        this.drive(this.speed, this.angle);
    }

    // Sets the values relating to where the wheel should point
    public void drive(double speed, double angle) {

        this.speedMotor.set(speed);
        double setpoint = angle * (MAX_VOLTS * 0.5) + (MAX_VOLTS * 0.5);

        if(setpoint < 0) {
            setpoint = MAX_VOLTS + setpoint;
        }
        if(setpoint > MAX_VOLTS) {
            setpoint = setpoint - MAX_VOLTS;
        }
        pidController.setSetpoint(setpoint);
    }
}

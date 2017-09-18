package org.usfirst.frc.team5002.drive.swerve;

import org.usfirst.frc.team5002.drive.Drive;
/**
  This tells what angle the Swerve motors should be pointing
  and what speed the wheels should be going.

@author Zack Vega


*/
public class SwerveModule{

    private Talon angleMotor;
    private Talon speedMotor;
    private PIDController pidController;
    public final double L = 24.69 ;
    public final double W = 22.61 ;

  public WheelDrive(int angleMotor, int speedMotor, int encoder){
    this.angleMotor = new Talon (angleMotor);
    this.speedMotor = new Talon (speedMotor);

    pidController = new PIDController (1, 0, 0, new AnalogInput (encoder), this.angleMotor);

    pidController.setOutputRange (-1, 1);
    pidController.setContinuous ();
    pidController.enable ();

  private final double MAX_VOLTS = 12;
  }
  public void drive (double speed, double angle) {
    speedMotor.set (speed);

    double setpoint = angle * (MAX_VOLTS * 0.5) + (MAX_VOLTS * 0.5);
    if(setpoint < 0){
      setpoint = MAX_VOLTS + setpoint;
    }
    if(setpoint > MAX_VOLTS){
      setpoint = setpoint - MAX_VOLTS;
    }

    pidController.setSetpoint (setpoint);

  }
}

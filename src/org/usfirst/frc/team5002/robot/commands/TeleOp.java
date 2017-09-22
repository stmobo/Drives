package org.usfirst.frc.team5002.robot.commands;

import org.usfirst.frc.team5002.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Joystick;

public class TeleOp extends Command {

    Joystick stick;

    public TeleOp() {
        requires(Robot.swervedrive);
    }

    protected void initialize() {
        Robot.swervedrive.frontLeft.setAngle(0);
        Robot.swervedrive.frontRight.setAngle(0);
        Robot.swervedrive.backLeft.setAngle(0);
        Robot.swervedrive.backRight.setAngle(0);

        stick = new Joystick(0);
    }

    protected void execute() {
        Robot.swervedrive.drive(stick.getRawAxis(1), stick.getRawAxis(2),
        stick.getRawAxis(3));
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }

}

package org.usfirst.frc.team5002.robot.commands;

import org.usfirst.frc.team5002.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;

/**
 * TeleOp - temporary class to handle initialization of swerve base
 * and to pass joystick inputs to the swerve base.
 *
 * This needs to be completely redone later on.  This was only stuck in
 * here so that we have something by the deadline.
 *
 * For example, I am leaving Field-Oriented-Control unimplemented for now.
 * This needs to be done later instead of passing raw inputs directly into
 * the drive method.
 */
public class TeleOp extends Command {

    /**
     * Joystick to receive inputs. (This is how that works, right...?)
     */
    private Joystick stick;

    // make sure we've created an instance of swerve drive already
    public TeleOp() {
        requires((Subsystem) Robot.swervedrive);
    }

    /**
     * initialize the swerve base.  Set all wheels to 0 and get the joystick.
     */
    protected void initialize() {
        Robot.swervedrive.frontLeft.setAngle(0);
        Robot.swervedrive.frontRight.setAngle(0);
        Robot.swervedrive.backLeft.setAngle(0);
        Robot.swervedrive.backRight.setAngle(0);

        stick = new Joystick(0);
    }

    /**
     * Basically cram all of the raw axis into the drive calculations and
     * call it a day.
     */
    protected void execute() {
        Robot.swervedrive.drive(
            this.stick.getRawAxis(1),
            this.stick.getRawAxis(2),
            this.stick.getRawAxis(3)
        );
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }

}

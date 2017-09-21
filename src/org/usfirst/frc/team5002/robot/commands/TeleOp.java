package org.usfirst.frc.team5002.robot.commands;

import org.usfirst.frc.team5002.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class TeleOp extends Command {

    public TeleOp() {
        requires(Robot.swervedrive);
    }

    protected void initialize() {
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }

}

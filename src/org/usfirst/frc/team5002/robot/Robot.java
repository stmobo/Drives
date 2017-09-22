package org.usfirst.frc.team5002.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import org.usfirst.frc.team5002.drive.swerve.SwerveDrive;
import org.usfirst.frc.team5002.drive.swerve.SwerveDrive2018;
import org.usfirst.frc.team5002.drive.swerve.SwerveModule;
import org.usfirst.frc.team5002.robot.RobotMap;
import org.usfirst.frc.team5002.robot.commands.TeleOp;

/**
 * Base class for all robot actions.
 * TODO: Rewrite. This is all temporary to catch deadlines.
 *
 * @author Brandon Gong
 * Date: 9/21/17
 */
public class Robot extends IterativeRobot {

    public static SwerveDrive swervedrive;

    @Override
    public void robotInit() {
        swervedrive = new SwerveDrive2018(
            new SwerveModule(
                RobotMap.bl_drive,
                RobotMap.bl_steer,
                RobotMap.bl_encoder
            ),
            new SwerveModule(
                RobotMap.br_drive,
                RobotMap.br_steer,
                RobotMap.br_encoder
            ),
            new SwerveModule(
                RobotMap.fl_drive,
                RobotMap.fl_steer,
                RobotMap.fl_encoder
            ),
            new SwerveModule(
                RobotMap.fr_drive,
                RobotMap.fr_steer,
                RobotMap.fr_encoder
            )
        );
    }

    @Override
    public void disabledInit() {}

    @Override
    public void disabledPeriodic() {}

    @Override
    public void autonomousInit() {}

    @Override
    public void autonomousPeriodic() {}

    @Override
    public void teleopInit() {
        TeleOp teleop = new TeleOp();
        Scheduler.getInstance().add(teleop);
    }

    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void testPeriodic() {}

}

package org.usfirst.frc.team5002.drive.swerve;

import org.usfirst.frc.team5002.drive.swerve.SwerveDrive;
import org.usfirst.frc.team5002.drive.swerve.SwerveModule;

/**
 * This class manages all four swerve modules and does calculations for wheel
 * angle, wheel speed, etc.
 *
 * TODO: Implement SwerveDrive interface.  Implement wpilib Command class.
 *
 * @author Zack Vega
 * @author Nikitha Sam
 * @author Brandon Gong
 * Date: 9/17/17
 */
public class SwerveDrive2018 {

    private SwerveModule backRight;
    private SwerveModule backLeft;
    private SwerveModule frontRight;
    private SwerveModule frontLeft;

    public final double L = 24.69;
    public final double W = 22.61;

    public SwerveDrive2018(SwerveModule backLeft, SwerveModule backRight, SwerveModule backLeft, SwerveModule backRight) {
            this.backRight = backRight;
            this.frontLeft = frontLeft;
            this.frontRight = frontRight;
    }

    /**
     * This is all the drive calculations for all the swerve modules.
     *
     * @author Nikitha Sam
     * Date: 09/17/2017
     *
     * The X and Y are the forward/backward movements. The Z is the
     * turning/axis.
     * R is the Hypotenuse, L is the length (a), W is the width (b).
     * The values for Y is between 1 & -1.
     */
    public void drive(double x, double y, double z) {
            double r = Math.sqrt((L * L) + (W * W));
            y *= -1;

            // This is the intermediate variables
            double a = x - z * (L / r);
            double b = x + z * (L / r);
            double c = y - z * (W / r);
            double d = y + z * (W / r);

            // This is the speed calculations for each wheel.
            // Obviously, we are using the Pythagorean Theorem again.
            double brSpeed = Math.sqrt((a * a) + (d * d));
            double blSpeed = Math.sqrt((a * a) + (c * c));
            double frSpeed = Math.sqrt((b * b) + (d * d));
            double flSpeed = Math.sqrt((b * b) + (c * c));

            /*
             * This has to do with the Angle calculations for each wheel.
             */
            double brAng= Math.atan2 (a, d) / Math.pi;
            double blAng = Math.atan2 (a, c) / Math.pi;
            double frAng = Math.atan2 (b, d) / Math.pi;
            double flAng = Math.atan2 (b, c) / Math.pi;
    }
}

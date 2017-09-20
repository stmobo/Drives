package org.usfirst.frc.team5002.drive.swerve;

import org.usfirst.frc.team5002.drive.swerve.SwerveDrive;
import org.usfirst.frc.team5002.drive.swerve.SwerveModule;

/**
 * This class manages all four swerve modules and does calculations for wheel
 * angle, wheel speed, etc.
 *
 * TODO: Implement SwerveDrive interface.  Implement wpilib Command class.
 *
 * @author Nikitha Sam
 * @author Brandon Gong
 * Date: 9/17/17
 */
public class SwerveDrive2018 implements SwerveDrive {

    private SwerveModule backRight;
    private SwerveModule backLeft;
    private SwerveModule frontRight;
    private SwerveModule frontLeft;
    private float forward;
    private float strafe;
    private float twist;

    public void setDrive(float forward) {
      this.forward = forward;
      this.drive(this.forward, this.strafe, this.twist);
    }
    public void setTurn(float strafe) {
      this.strafe = strafe;
      this.drive(this.forward, this.strafe, this.twist);
    }
    public void setTwist(float twist) {
      this.twist = twist;
      this.drive(this.forward, this.strafe, this.twist);
    }
    /**
     * The length between the axles (unit does not matter).
     */
    private final double LENGTH = 24.69;

    /**
     * The width between the wheels on each axle.
     */
    private final double WIDTH = 22.61;

    public SwerveDrive2018( SwerveModule backLeft,
                            SwerveModule backRight,
                            SwerveModule frontLeft,
                            SwerveModule frontRight ) {
            this.backRight = backRight;
            this.backLeft = backLeft;
            this.frontLeft = frontLeft;
            this.frontRight = frontRight;
    }

    /**
     * This is all the drive calculations for all the swerve modules.
     *
     * @param x Strafe (left-right movements)
     * @param y Forward-backward movement
     * @param z Twisting motion.
     *
     * @author Nikitha Sam
     * Date: 09/17/2017
     */
    private void drive(double x, double y, double z) {

            // Calculate diagonal length.
            double r = Math.sqrt((this.LENGTH * this.LENGTH) + (this.WIDTH * this.WIDTH));

            // invert y-axis
            y *= -1;

            // intermediate vector components
            double a = x - z * (this.LENGTH / r);
            double b = x + z * (this.LENGTH / r);
            double c = y - z * (this.WIDTH / r);
            double d = y + z * (this.WIDTH / r);

            // This is the speed calculations for each wheel.
            double brSpeed = Math.sqrt((a * a) + (d * d));
            double blSpeed = Math.sqrt((a * a) + (c * c));
            double frSpeed = Math.sqrt((b * b) + (d * d));
            double flSpeed = Math.sqrt((b * b) + (c * c));

            // Angle calculations for each wheel.
            double brAngle = Math.atan2(a, d) / Math.pi;
            double blAngle = Math.atan2(a, c) / Math.pi;
            double frAngle = Math.atan2(b, d) / Math.pi;
            double flAngle = Math.atan2(b, c) / Math.pi;

            // Assign calculated values to swerve modules.
            this.backRight.drive(brSpeed, brAngle);
            this.backLeft.drive(blSpeed, blAngle);
            this.frontRight.drive(frSpeed, frAngle);
            this.frontLeft.drive(flSpeed, flAngle);
    }
}

package org.usfirst.frc.team5002.drive.swerve;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team5002.drive.swerve.SwerveDrive;
import org.usfirst.frc.team5002.drive.swerve.SwerveModule;

/**
 * This class manages all four swerve modules and does calculations for wheel
 * angle, wheel speed, etc. This class also implements SwerveDrive.
 *
 * @author Nikitha Sam
 * @author Brandon Gong
 * Date: 9/17/17
 */
public class SwerveDrive2018 extends Subsystem implements SwerveDrive {

    /*
     * Swerve Submodules.
     */
    public SwerveModule backRight;
    public SwerveModule backLeft;
    public SwerveModule frontRight;
    public SwerveModule frontLeft;

    /*
     * Movement parameters.
     */
    private float forward;
    private float strafe;
    private float twist;

    /*
     * Dimensions of base (axle-to-axle, wheel-to-wheel respectively).
     */
    private final double LENGTH = 24.69;
    private final double WIDTH = 22.61;

    /**
     * Constructs a new SwerveDrive2018 instance with the given SwerveModule
     * submodules.
     *
     * @param backLeft the back-left swerve module.
     * @param backRight the back-right swerve module.
     * @param frontLeft the front-left swerve module.
     * @param frontRight the front-right swerve module.
     */
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
     * Sets the forward-and-backward, or y-axis, movement of the swerve base,
     * and then recalculates wheel speeds and angles.
     * @param forward the forwards and backward motion
     * @author Nikitha Sam
     */
    public void setDrive(float forward) {
      this.forward = forward;
      this.drive(this.forward, this.strafe, this.twist);
    }

    /**
     * Sets the strafe (right-to-left), or x-axis, movement of the swerve base,
     * and then recalculates wheel speeds and angles.
     * @param strafe the side to side motion
     * @author Nikitha Sam
     */
    public void setTurn(float strafe) {
      this.strafe = strafe;
      this.drive(this.forward, this.strafe, this.twist);
    }

    /**
     * Sets the twisting, or z axis, movement of the swerve base, and then
     * recalculates wheel speeds and angles.
     * @param twist turning and twisting
     * @author Nikitha Sam
     */
    public void setTwist(float twist) {
      this.twist = twist;
      this.drive(this.forward, this.strafe, this.twist);
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
    public void drive(double x, double y, double z) {

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
            double brAngle = Math.atan2(a, d) / Math.PI;
            double blAngle = Math.atan2(a, c) / Math.PI;
            double frAngle = Math.atan2(b, d) / Math.PI;
            double flAngle = Math.atan2(b, c) / Math.PI;

            // Assign calculated values to swerve modules.
            this.backRight.drive(brSpeed, brAngle);
            this.backLeft.drive(blSpeed, blAngle);
            this.frontRight.drive(frSpeed, frAngle);
            this.frontLeft.drive(flSpeed, flAngle);
    }

    public void lock() {
        this.frontRight.setAngle(0.785398);
        this.backRight.setAngle(2.35619);
        this.backLeft.setAngle(3.92699);
        this.frontLeft.setAngle(5.49779);
    }

    public void initDefaultCommand() {
    }

}

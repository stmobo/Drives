package org.usfirst.frc.team5002.drive;

/**
 * The base interface for all drivetrains.
 * This file should not be implemented directly.  Instead, implement
 * a specialized interface, such as
 * {@link #org.usfirst.frc.team5002.drive.swerve.SwerveDrive SwerveDrive}.
 *
 * If one does not exist for your drivetrain, create your own interface
 * extending this base interface and implement that one.
 *
 * @author Brandon Gong
 * Date: 9/9/17
 */
public interface Drive {

    /**
     * Begin driving at a specific speed.
     * @param power The speed and direction of the motor: expressed as a
     *              percentage of maximum power between -1 and +1, with 0 being
     *              a complete stop.
     */
    public void setDrive(float power);

    /**
     * Drive a certain distance at a given speed.
     * @param power See {@link #setSpeed above.}
     * @param degrees The number of degrees on the encoder to drive.
     */
    public void driveDistance(float power, int degrees);

     /**
      * Set the turning speed.
      * @param power How fast to turn.  -1 indicates full speed
      *              counter-clockwise rotation, 0 indicates no rotation,
      *              and +1 indicates full speed clockwise rotation.
      */
     public void setTurn(float power);

     /**
      * Turn a certain distance at a given speed.
      * @param power See {@link #setTurn above.}
      * @param degrees The number of degrees on the encoder to turn.
      */
     public void turnDistance(float power, int degrees);

}

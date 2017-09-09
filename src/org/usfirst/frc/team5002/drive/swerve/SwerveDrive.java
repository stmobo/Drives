package org.usfirst.frc.team5002.drive.swerve;

import org.usfirst.frc.team5002.drive.Drive;

/**
 * The base interface for Swerve Drive.
 * All swerve drive classes must implement this interface to be
 * considered "swerve drive".
 *
 * This interface extends the Drive interface and adds on
 * extra methods specific to SwerveDrive.
 *
 * @author Brandon Gong
 * Date: 9/9/17
 */
public interface SwerveDrive extends Drive {

    /**
     * Lock the base.  This turns all wheels into an X-formation.
     */
    public void lock();

     /**
      * Align all wheels at a certain angle relative to the robot.
      * This call can be used right before {@code drive()} to drive at a certain
      * angle.
      *
      * @param degrees Any integer between 0 and 360.  Implementations for this
      * function should do a simple calculation to find the shortest path to
      * reach the desired angle.
      */
     public void align(int degrees);

     /**
      * Set the twisting rate.  This means rotating robot chassis while
      * continuing to drive in a straight line.
      *
      * @param rate The rate of twisting expressed as a percentage of maximum
      *             twisting rate.  Should be between -1 and +1, with 0 being
      *             no twisting at all.
      */
     public void setTwist(float rate);

}

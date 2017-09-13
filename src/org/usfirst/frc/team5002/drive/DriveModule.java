package org.usfirst.frc.team5002.drive;

public interface DriveModule {
    public void setReverse(boolean reverseStatus);
    public void setDrive(float power);
    public void setDriveSpeed(float speed);
    public void setDriveDistance(float distance);
    public boolean isFinished();
}

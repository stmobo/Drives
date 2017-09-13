package org.usfirst.frc.team5002.drive.swerve;

public interface SteerModule {
    public void setSteer(float degrees);
    public float getSteer();
    public void resetHome();
    public boolean isFinished();
}

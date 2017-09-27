package org.usfirst.frc.team5002.drive.swerve;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;
import com.ctre.CANTalon.TalonControlMode;

public class SteerModule2017 implements SteerModule {
    CANTalon srx;
    float steerOffset = 0.0;

    public SteerModule2017(int controllerID) {
        this.srx = new CANTalon(controllerID);

        srx.changeControlMode(TalonControlMode.Position);
    	srx.setFeedbackDevice(FeedbackDevice.AnalogEncoder);
		srx.setProfile(0);
    }

    public void setSteer(float degrees) {
        float nativeUnits = degrees * (1024.0 / 360.0);
        nativeUnits += steerOffset;
        srx.set(nativeUnits);
    }

    public float getSteer() {
        float nativeUnits = srx.getPosition();
        return (nativeUnits - steerOffset) * (360.0 / 1024.0);
    }

    public void resetHome() {
        steerOffset = srx.getPosition();
    }

    public boolean isFinished() {
        return Math.abs(srx.getClosedLoopError()) < 45.0;
    }
}

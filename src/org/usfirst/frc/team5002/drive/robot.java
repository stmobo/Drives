package org.usfirst.frc.team5002.drive.swerve;

import org.usfirst.frc.team5002.drive.Drive;

private WheelDrive backRight = new WheelDrive(0, 1, 0); /* Should be the real ID's of the angle motor, speed motor, and motor encoder for each wheel */
private WheelDrive backLeft = new WheelDrive(2, 3, 1);
private WheelDrive frontRight = new WheelDrive(4, 5, 2);
private WheelDrive frontLeft = new WheelDrive (6, 7, 3);

private swerveDrive swerveDrive = new swerveDrive (backLeft, backRight, frontLeft, frontRight);

private Joystick joystick = new Joystick(0);

public void teleopPeriod (){
  swerveDrive.drive (joystick.getRawAxis (1). joystick.getRawAxis (0), joystick.getRawAxis (4));

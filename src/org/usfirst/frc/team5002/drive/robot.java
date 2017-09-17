package org.usfirst.frc.team5002.drive.swerve;

import org.usfirst.frc.team5002.drive.Drive;

private SwerveModule backRight = new SwerveModule(0, 1, 0); /* Should be the real ID's of the angle motor, speed motor, and motor encoder for each wheel */
private SwerveModule backLeft = new SwerveModule(2, 3, 1);
private SwerveModule frontRight = new SwerveModule(4, 5, 2);
private SwerveModule frontLeft = new SwerveModule (6, 7, 3);

private swerveDrive swerveDrive = new swerveDrive (backLeft, backRight, frontLeft, frontRight);

private Joystick joystick = new Joystick(0);

public void teleopPeriod (){
  swerveDrive.drive (joystick.getRawAxis (1). joystick.getRawAxis (0), joystick.getRawAxis (4));

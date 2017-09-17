+package org.usfirst.frc.team5002.drive.swerve;
+
+import org.usfirst.frc.team5002.drive.Drive;

private SwerveModule backRight;
private SwerveModule backLeft;
private SwerveModule frontRight;
private SwerveModule frontLeft;

public swerveDrive (SwerveModule backLeft, SwerveModule backRight, SwerveModule backLeft, SwerveModule backRight){
    this.backRight = backRight;
    this.frontLeft = frontLeft;
    this.frontRight = frontRight;
}
public void drive( double x, double y, double z){
    double r = Math.sqrt((L * L) + (W * W))
    y *= -1;

    double a = x-z * (L/r);
    double b = x+z * (L/r);
    double c = y-z * (W/r);
    double d = y+z * (W/r);

    double backRightSpeed = Math.sqrt ((a * a) + (d * d));
    double backLeftSpeed = Math.sqrt ((a * a) + (c * c));
    double frontRightSpeed = Math.sqrt ((b * b) + (d * d));
    double frontLeftSpeed = Math.sqrt ((b * b) + (c * c));

    double backRightAngle = Math.atan2 (a, d) / Math.pi;
    double backLeftAngle = Math.atan2 (a, c) / Math.pi;
    double frontRightAngle = Math.atan2 (b, d) / Math.pi;
    double frontLeftAngle = Math.atan2 (b, c) / Math.pi;
  }

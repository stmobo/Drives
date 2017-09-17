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
  /* This is all the drive calculations for all the swerve modules
    The X and Y are the forward/backward movements. The Z is the turning/axis.
    R is the Hypotnuse, L is the length (a), W i sthe width (b).
    The values for Y is between 1 & -1.
  */
public void drive( double x, double y, double z){
    double r = Math.sqrt((L * L) + (W * W))
    y *= -1;

    double a = x-z * (L/r);
    double b = x+z * (L/r);
    double c = y-z * (W/r);
    double d = y+z * (W/r);

    double backRightSd = Math.sqrt ((a * a) + (d * d));
    double backLeftSd = Math.sqrt ((a * a) + (c * c));
    double frontRightSd = Math.sqrt ((b * b) + (d * d));
    double frontLeftSd = Math.sqrt ((b * b) + (c * c));

    double backRightAng= Math.atan2 (a, d) / Math.pi;
    double backLeftAng = Math.atan2 (a, c) / Math.pi;
    double frontRightAng = Math.atan2 (b, d) / Math.pi;
    double frontLeftAng = Math.atan2 (b, c) / Math.pi;
  }

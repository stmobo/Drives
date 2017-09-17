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
  /* This is all the drive calculations for all the swerve modules written by Nikitha Sam.
    The X and Y are the forward/backward movements. The Z is the turning/axis.
    R is the Hypotnuse, L is the length (a), W is the width (b).
    The values for Y is between 1 & -1.
  */
public void drive( double x, double y, double z){
    double r = Math.sqrt((L * L) + (W * W))
    y *= -1;

  // This is the intermediate variables (i think)
    double a = x-z * (L/r);
    double b = x+z * (L/r);
    double c = y-z * (W/r);
    double d = y+z * (W/r);

  // This is the speed calculations for each wheel. 
  // Obviously, we are using the Pythagorean Theorm again.
    double b_rSpeed = Math.sqrt ((a * a) + (d * d));
    double b_lSpeed = Math.sqrt ((a * a) + (c * c));
    double f_rSpeed = Math.sqrt ((b * b) + (d * d));
    double f_lSpeed = Math.sqrt ((b * b) + (c * c));

  /*This has to do with the Angle calculations for each wheel.
    This is the one that uses Vectors.
    This is mostly for turning etc.
  */
    double b_rAng= Math.atan2 (a, d) / Math.pi;
    double b_lAng = Math.atan2 (a, c) / Math.pi;
    double f_rAng = Math.atan2 (b, d) / Math.pi;
    double f_lAng = Math.atan2 (b, c) / Math.pi;
  }

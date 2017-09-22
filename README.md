# Drives
This repo is dedicated to implementing modular and flexible code for
drivetrains under the package name `org.usfirst.frc.team5002.drive`.

## Basic Structure
The base interface, `Drive`, contains methods that *all* bases, including
swerve, tank, Mecanum, and others, must implement.  Then, for each drivetrain
type, there will be a specialized interface.
<br><br>
Currently, the focus will be on swerve; so, under the package
`org.usfirst.frc.team5002.drive.swerve`, a specialized `SwerveDrive` interface
will be created, extending the `Drive` interface and adding on extra methods
specialized to swerve (such as `lock()` and `align()`). Each "flavor" of
swerve will have to implement the `SwerveDrive` interface.


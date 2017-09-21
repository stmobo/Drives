/**
 * Package {@code io} contains abstractions and implementations for input.
 *
 * Instead of hardcoding inputs into the code, it would be a better idea to
 * abstract every joystick, gamepad, and controller into range and boolean
 * inputs.
 *
 * This allows us to be able to easily and quickly assign different control
 * schemes (for personal preference) based on input from XML files or the
 * SmartDashboard.
 *
 * This package also handles outputs, i.e. video streaming, logging, error
 * reporting, etc.  Any interactions with the driver station, SmartDashboard,
 * or NetworkTables should be done through this package.
 *
 * @author Brandon Gong
 */
package org.usfirst.frc.team5002.drive.io;

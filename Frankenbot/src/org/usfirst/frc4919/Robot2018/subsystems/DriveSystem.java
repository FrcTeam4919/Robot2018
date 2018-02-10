// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4919.Robot2018.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc4919.Robot2018.Robot;
import org.usfirst.frc4919.Robot2018.RobotMap;
import org.usfirst.frc4919.Robot2018.commands.*;

import edu.wpi.first.wpilibj.Joystick;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DriveSystem extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController speedController1 = RobotMap.driveSystemSpeedController1;
    private final SpeedController speedController2 = RobotMap.driveSystemSpeedController2;
    private final SpeedController speedController3 = RobotMap.driveSystemSpeedController3;
    private final SpeedController speedController4 = RobotMap.driveSystemSpeedController4;
    private final MecanumDrive mecanumDrive1 = RobotMap.driveSystemMecanumDrive1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop
    	Joystick joystick=Robot.oi.getJoystick1();
    	double y = joystick.getY();
    	double x = joystick.getX();
    	double z = joystick.getZ();
    	y = correctErrors (y);
    	x = correctErrors (x);
    	z = correctErrors (z);
    	mecanumDrive1.driveCartesian(y,x,z);
    	
    }
    
    public double correctErrors(double value) {
    	if (Math.abs(value) <0.2){
    	 value = 0;
    	}
    	return value;
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public void moveforward() {
    	mecanumDrive1.drivePolar(.5, 0, 0);
    }
    
    public void movebackwards() {
    	mecanumDrive1.drivePolar(-.5, 0, 0);
    }
    
    public void stop() {
    	mecanumDrive1.drivePolar(0.0, 0.0, 0.0);
    }
}


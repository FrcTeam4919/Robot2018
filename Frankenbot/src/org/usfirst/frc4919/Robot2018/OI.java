// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4919.Robot2018;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc4919.Robot2018.commands.*;
import org.usfirst.frc4919.Robot2018.subsystems.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //MAKE ARM SLOWER AND FIX INVERSION OF ARM
	

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton liftArmButton;
    public JoystickButton lowerArmButton;
    public JoystickButton clampButton;
    public JoystickButton releaseClampButton;
    public JoystickButton winchLift;
    public JoystickButton winchLower;
    public JoystickButton leanForward;
    public JoystickButton leanBackward;
    public JoystickButton leanAndLower;
    public JoystickButton leanAndLift;
    
    public Joystick joystick1;
    public Joystick joystick2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystick1 = new Joystick(1);
        joystick2 = new Joystick(0);
        
        winchLift = new JoystickButton(joystick2, 1);
        winchLift.whileHeld(new WinchLift());
        winchLift.whenReleased(new WinchStop());
        winchLower = new JoystickButton(joystick2, 2);
        winchLower.whileHeld(new WinchLower());
        winchLower.whenReleased(new WinchStop());
        releaseClampButton = new JoystickButton(joystick2, 7);
        releaseClampButton.whileHeld(new ReleaseClamp());
        releaseClampButton.whenReleased(new ReleaseClamp().stop());
        clampButton = new JoystickButton(joystick2, 6);
        clampButton.whileHeld(new Clamp());
        clampButton.whenReleased(new Clamp().stop());
      //  leanAndLift = new JoystickButton(joystick2, 5);
      //  leanAndLift.whenPressed(new LeanAndLift());
      //  leanAndLower = new JoystickButton(joystick2, 4);
      //  leanAndLower.whenPressed(new LowerAndLean());
        
        
        leanBackward = new JoystickButton(joystick2, 10);
        leanBackward.whileHeld(new LeanBackward());
        leanBackward.whenReleased(new LeanBackward().stop());
        leanForward = new JoystickButton(joystick2, 11);
        leanForward.whileHeld(new LeanForward());
        leanForward.whenReleased(new LeanForward().stop());
        lowerArmButton = new JoystickButton(joystick2, 4);
        lowerArmButton.whileHeld(new LowerArm());
        lowerArmButton.whenReleased(new LowerArm().finish());
        liftArmButton = new JoystickButton(joystick2, 5);
        liftArmButton.whileHeld(new LiftArm());
        liftArmButton.whenReleased(new LiftArm().finish());

        // SmartDashboard Buttons
//        SmartDashboard.putData("Center", new CenterAutonomous());
//        SmartDashboard.putData("Right", new RightAutonomous());
//        SmartDashboard.putData("Left", new LeftAutonomous());
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick1() {
        return joystick1;
    }

    public Joystick getJoystick2() {
    	return joystick2;
    }

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}


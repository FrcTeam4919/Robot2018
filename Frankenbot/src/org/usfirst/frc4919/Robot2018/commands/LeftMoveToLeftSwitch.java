package org.usfirst.frc4919.Robot2018.commands;
import org.usfirst.frc4919.Robot2018.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LeftMoveToLeftSwitch extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public LeftMoveToLeftSwitch() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    	requires(Robot.driveSystem);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	System.out.println("Left Autonomus");
    	setTimeout(2.0);
    }
// ---IMPORTANT------Used with robot sideways facing the right (from drive pit perspective)--IMPORTANT!!!
    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	Robot.driveSystem.moveSideways();
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return this.isTimedOut();
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    	Robot.driveSystem.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
}

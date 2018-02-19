package org.usfirst.frc4919.Robot2018.commands;

import org.usfirst.frc4919.Robot2018.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeanAndLift extends CommandGroup {

	
	public LeanAndLift() {
		requires(Robot.armMotor);
		requires(Robot.pneumaticTower);
		
	
		addSequential(new LeanBackward());
		addSequential(new LiftArm());


    }
	
/*
    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	setTimeout(2.0);
    	Robot.pneumaticTower.leanBackward();
    	Robot.armMotor.liftArm();
    	
    	System.out.println("Initializing...");
    	
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	System.out.println("Lean and lift executing...");
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
    	
    	System.out.println("Time: " + this.timeSinceInitialized());
    	System.out.println("isTimed out: " + this.isTimedOut());
        return this.isTimedOut();
    
    }

    // Called once after isFinished (stopLean) returns true
    @Override
    protected void end() {
    	stopLean();
    }
    
    public void stopLean() {
    	Robot.pneumaticTower.stop();
    	Robot.armMotor.armStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
   
    protected void interrupted() {
    }
   */
}



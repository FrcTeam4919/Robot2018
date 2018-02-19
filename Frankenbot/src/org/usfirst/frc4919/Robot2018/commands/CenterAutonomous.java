package org.usfirst.frc4919.Robot2018.commands;

import org.usfirst.frc4919.Robot2018.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class CenterAutonomous extends CommandGroup {
	
	
	
	public CenterAutonomous() {
		
		
		if (Robot.switchIsLeft) {
		
			System.out.println("Robot moving to left switch");
		
		//addSequential(new Clamp());
		addParallel(new CenterMoveToLeftSwitch());
		addSequential(new LiftCube());
		addSequential(new DropCube());
		//Turn to face scale/switch
		
		//Drop cube
		}
		else {
		
		addParallel(new CenterMoveToRightSwitch());	
		addSequential(new LiftCube());	
		addSequential(new DropCube());
		}
	
	}

	
	//add left/right chooser
}

package org.usfirst.frc4919.Robot2018.commands;

import org.usfirst.frc4919.Robot2018.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class RightAutonomous extends CommandGroup {
	
	
	
	public RightAutonomous() {
				
		if (Robot.switchIsLeft) {
			
		
		//addSequential(new Clamp());
		addParallel(new RightMoveToLeftSwitch());
		addSequential(new LiftCube());
		addSequential(new DropCube());
		//Turn to face scale/switch
		
		//Drop cube
		}
		else {
		
		addParallel(new RightMoveToRightSwitch());	
		addSequential(new LiftCube());	
		addSequential(new DropCube());
		}
	
	}

	
	//add left/right chooser
}

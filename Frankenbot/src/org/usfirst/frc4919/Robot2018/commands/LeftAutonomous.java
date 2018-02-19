package org.usfirst.frc4919.Robot2018.commands;

import org.usfirst.frc4919.Robot2018.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftAutonomous extends CommandGroup {
	
	
	
	public LeftAutonomous() {
				
		if (Robot.switchIsLeft) {	
		
		//addSequential(new Clamp());
		addParallel(new LeftMoveToLeftSwitch());
		addSequential(new LiftCube());
		addSequential(new DropCube());
		//Turn to face scale/switch
		
		//Drop cube
		}
		else {
		
		addParallel(new LeftMoveToRightSwitch());	
		addSequential(new LiftCube());	
		addSequential(new DropCube());
		}
	
	}
}

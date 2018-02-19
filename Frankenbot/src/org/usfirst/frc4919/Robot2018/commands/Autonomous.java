package org.usfirst.frc4919.Robot2018.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Autonomous extends CommandGroup {
	public Autonomous() {
		//addSequential(new Clamp());
		addParallel(new MoveToSwitch());
		addSequential(new LiftCube());
		
		//Turn to face scale/switch
		//Move closer to scale/switch
		//Drop cube
		
	}

	
	//add left/right chooser
}

package org.usfirst.frc4919.Robot2018.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Autonomous extends CommandGroup {
	public Autonomous() {
		//addSequential(new Clamp());
		addParallel(new MoveToSwitch());
		addSequential(new LiftCube());
		
		//Turn to face scale
		//Move closer to scale
		//Drop cube
		
	}

}

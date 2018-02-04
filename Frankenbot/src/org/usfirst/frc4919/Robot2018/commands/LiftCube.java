package org.usfirst.frc4919.Robot2018.commands;

import org.usfirst.frc4919.Robot2018.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LiftCube extends Command {
	public LiftCube() {
		requires(Robot.armMotor);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

protected void initialize() {
	setTimeout(1);
	
}
protected void execute() {
	Robot.armMotor.liftArm();
	
	
	
}
protected void end() {
	Robot.armMotor.armStop();
	
}


}


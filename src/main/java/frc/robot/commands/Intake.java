package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Pneumatics;

public class Intake extends CommandBase{
    
    private Pneumatics pneumatics;
    public Intake(Pneumatics subsystem) {
        pneumatics = subsystem;
        addRequirements(subsystem);
    }
    @Override
    public void initialize() {
        pneumatics.intake();
    }
}

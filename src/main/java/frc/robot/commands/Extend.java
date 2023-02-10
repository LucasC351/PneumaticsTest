package frc.robot.commands;

import frc.robot.subsystems.Pneumatics;
import edu.wpi.first.wpilibj2.command.CommandBase;
public class Extend extends CommandBase {
    private Pneumatics pneumatics;
    public Extend(Pneumatics subsystem) {
        pneumatics = subsystem;
        addRequirements(subsystem);
    }
    @Override
    public void initialize() {
        pneumatics.extend();
    }
}

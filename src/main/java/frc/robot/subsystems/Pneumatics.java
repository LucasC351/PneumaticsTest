package frc.robot.subsystems;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pneumatics extends SubsystemBase{
    private DoubleSolenoid solenoid;
    public Pneumatics(DoubleSolenoid solenoid) {
        this.solenoid = solenoid;
    }


    public void extend() {
        solenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void intake() {
        solenoid.set(DoubleSolenoid.Value.kReverse);
    }
    

}

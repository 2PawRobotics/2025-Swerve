package frc.robot.commands.climber;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ClimberSys;

public class ClimberUpCmd extends Command {

    private ClimberSys climberSys;
    
    public ClimberUpCmd(ClimberSys climberSys) {
        this.climberSys = climberSys;

        addRequirements(climberSys);
    }

    public void initialize() {
        climberSys.setClimberPower(1.0);
    }

    public void execute() {
    
    }

    public void end(boolean isInerrupted) {
    }

    public boolean isFinished() {
        return true;
    }
}
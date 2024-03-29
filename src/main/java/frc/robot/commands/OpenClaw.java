// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.Pneumatics;
//import frc.robot.subsystems.LEDIndicator;

// NOTE: Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class OpenClaw extends InstantCommand {
  private Pneumatics pneumatics = null;

  /** Create a new OpenClaw */
  public OpenClaw(Pneumatics pneumatics) {
    this.pneumatics = pneumatics;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(pneumatics);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    pneumatics.openClaw();
    
  }
}

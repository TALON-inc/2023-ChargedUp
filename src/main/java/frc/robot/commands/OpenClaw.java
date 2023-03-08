// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Pneumatics;
public class OpenClaw extends CommandBase {
  private Pneumatics pneumatics = null;
  /** Creates a new OpenClaw. */
  public OpenClaw(Pneumatics pneumatics) {
    this.pneumatics = pneumatics;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    pneumatics.closeClaw();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    return;
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
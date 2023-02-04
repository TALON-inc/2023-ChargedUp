// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import static frc.robot.Constants.OperatorConstants.*;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Pneumatics;

public class PneumaticsCommand extends CommandBase {
   private final Pneumatics pneumatics;
   private XboxController controller = null;
  /** Creates a new PneumaticsCommand. */
  public PneumaticsCommand(Pneumatics subsystem, XboxController controller) {
    this.pneumatics = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
    this.controller = controller;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    pneumatics.sol1Close();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (controller.getRawButton(BUTTON_A)){
      pneumatics.sol1Open();
    }
    else if (controller.getRawButton(BUTTON_B)){
      pneumatics.sol1Close();
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

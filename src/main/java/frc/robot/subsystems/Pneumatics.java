// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import static frc.robot.Constants.OperatorConstants.CLOSE_CHANNEL;
import static frc.robot.Constants.OperatorConstants.OPEN_CHANNEL;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Pneumatics extends SubsystemBase {
  private PneumaticHub pneumaticHub = null;
  private DoubleSolenoid claw = null;

  /** 
   * Creates a new Pneumatics subsystem.
   * 
   * Uses the REV PneumaticHub
   */
  public Pneumatics() {
    pneumaticHub = new PneumaticHub();
    pneumaticHub.enableCompressorDigital();

    claw = pneumaticHub.makeDoubleSolenoid(CLOSE_CHANNEL, OPEN_CHANNEL);
  }

  // Opens claw by piston extention powered by solenoid
  public void openClaw() {
    claw.set(DoubleSolenoid.Value.kReverse);
  }

  //Closes claw by piston retraction powered by solenoid
  public void closeClaw() {
    claw.set(DoubleSolenoid.Value.kForward);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

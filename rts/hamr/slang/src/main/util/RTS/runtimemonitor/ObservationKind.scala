// #Sireum

package RTS.runtimemonitor

import org.sireum._
import RTS._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

@enum object ObservationKind {
  "RTS_i_Instance_instrumentationMock_instrumentationMockThread_postInit"
  "RTS_i_Instance_instrumentationMock_instrumentationMockThread_preCompute"
  "RTS_i_Instance_instrumentationMock_instrumentationMockThread_postCompute"
  "RTS_i_Instance_eventControlMock_eventControlMockThread_postInit"
  "RTS_i_Instance_eventControlMock_eventControlMockThread_preCompute"
  "RTS_i_Instance_eventControlMock_eventControlMockThread_postCompute"
  "RTS_i_Instance_actuatorsMock_actuatorsMockThread_postInit"
  "RTS_i_Instance_actuatorsMock_actuatorsMockThread_preCompute"
  "RTS_i_Instance_actuatorsMock_actuatorsMockThread_postCompute"
  "RTS_i_Instance_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_postInit"
  "RTS_i_Instance_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_preCompute"
  "RTS_i_Instance_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic_postCompute"
  "RTS_i_Instance_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_postInit"
  "RTS_i_Instance_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_preCompute"
  "RTS_i_Instance_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic_postCompute"
  "RTS_i_Instance_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_postInit"
  "RTS_i_Instance_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_preCompute"
  "RTS_i_Instance_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic_postCompute"
  "RTS_i_Instance_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_postInit"
  "RTS_i_Instance_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_preCompute"
  "RTS_i_Instance_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_postCompute"
  "RTS_i_Instance_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_postInit"
  "RTS_i_Instance_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_preCompute"
  "RTS_i_Instance_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic_postCompute"
  "RTS_i_Instance_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_postInit"
  "RTS_i_Instance_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_preCompute"
  "RTS_i_Instance_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic_postCompute"
  "RTS_i_Instance_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_postInit"
  "RTS_i_Instance_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_preCompute"
  "RTS_i_Instance_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic_postCompute"
  "RTS_i_Instance_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_postInit"
  "RTS_i_Instance_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_preCompute"
  "RTS_i_Instance_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic_postCompute"
  "RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_postInit"
  "RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_preCompute"
  "RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic_postCompute"
  "RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_postInit"
  "RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_preCompute"
  "RTS_i_Instance_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator_postCompute"
  "RTS_i_Instance_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_postInit"
  "RTS_i_Instance_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_preCompute"
  "RTS_i_Instance_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_postCompute"
  "RTS_i_Instance_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_postInit"
  "RTS_i_Instance_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_preCompute"
  "RTS_i_Instance_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator_postCompute"
}

::/*#! 2> /dev/null                                   #
@ 2>/dev/null # 2>nul & echo off & goto BOF           #
if [ -z ${SIREUM_HOME} ]; then                        #
  echo "Please set SIREUM_HOME env var"               #
  exit -1                                             #
fi                                                    #
exec ${SIREUM_HOME}/bin/sireum slang run "$0" "$@"    #
:BOF
setlocal
if not defined SIREUM_HOME (
  echo Please set SIREUM_HOME env var
  exit /B -1
)
%SIREUM_HOME%\\bin\\sireum.bat slang run "%0" %*
exit /B %errorlevel%
::!#*/
// #Sireum

import org.sireum._

val sireum = Os.path(Os.env("SIREUM_HOME").get) / "bin" / (if (Os.isWin) "sireum.bat" else "sireum")

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// create SlangCheck artifacts for the Slang types used in the project

val files: ISZ[String] = ISZ("../src/main/data/RTS/Base_Types.scala",
                             "../src/main/data/RTS/Instrumentation/InstrumentationMockThread_i_instrumentationMock_instrumentationMockThread__Containers.scala",
                             "../src/main/data/RTS/EventControl/EventControlMockThread_i_eventControlMock_eventControlMockThread__Containers.scala",
                             "../src/main/data/RTS/Actuators/ActuatorsMockThread_i_actuatorsMock_actuatorsMockThread__Containers.scala",
                             "../src/main/data/RTS/Actuation/CoincidenceLogic_i_actuationSubsystem_actuationUnit1_temperatureLogic_coincidenceLogic__Containers.scala",
                             "../src/main/data/RTS/Actuation/CoincidenceLogic_i_actuationSubsystem_actuationUnit1_pressureLogic_coincidenceLogic__Containers.scala",
                             "../src/main/data/RTS/Actuation/CoincidenceLogic_i_actuationSubsystem_actuationUnit1_saturationLogic_coincidenceLogic__Containers.scala",
                             "../src/main/data/RTS/Actuation/OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic__Containers.scala",
                             "../src/main/data/RTS/Actuation/CoincidenceLogic_i_actuationSubsystem_actuationUnit2_temperatureLogic_coincidenceLogic__Containers.scala",
                             "../src/main/data/RTS/Actuation/CoincidenceLogic_i_actuationSubsystem_actuationUnit2_pressureLogic_coincidenceLogic__Containers.scala",
                             "../src/main/data/RTS/Actuation/CoincidenceLogic_i_actuationSubsystem_actuationUnit2_saturationLogic_coincidenceLogic__Containers.scala",
                             "../src/main/data/RTS/Actuation/OrLogic_i_actuationSubsystem_actuationUnit2_tempPressureTripOut_orLogic__Containers.scala",
                             "../src/main/data/RTS/Actuation/OrLogic_i_actuationSubsystem_tempPressureActuatorUnit_actuateTempPressureActuator_orLogic__Containers.scala",
                             "../src/main/data/RTS/Actuation/Actuator_i_actuationSubsystem_tempPressureActuatorUnit_tempPressureActuator_actuator__Containers.scala",
                             "../src/main/data/RTS/Actuation/OrLogic_i_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic__Containers.scala",
                             "../src/main/data/RTS/Actuation/Actuator_i_actuationSubsystem_saturationActuatorUnit_saturationActuator_actuator__Containers.scala",
                             "../src/main/util/RTS/runtimemonitor/ObservationKind.scala",
                             "../src/main/art/art/DataContent.scala",
                             "../src/main/data/RTS/Aux_Types.scala")

val toolargs: String = st"${(files, " ")}".render

(Os.slashDir.up / "src" / "main" / "util" / "RTS").mkdirAll()

proc"$sireum proyek slangcheck -p RTS -o ${Os.slashDir.up}/src/main/util/RTS ${Os.slashDir.up} $toolargs".at(Os.slashDir).console.runCheck()

// call to the tools version of SlangCheck which does not invoke Tipe
//proc"$sireum tools slangcheck generator -p RTS -o ${Os.slashDir.up}/src/main/util/RTS $toolargs".at(Os.slashDir).console.runCheck()

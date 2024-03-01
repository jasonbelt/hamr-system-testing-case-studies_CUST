// #Sireum

package RTS.Actuation

import org.sireum._
import art._
import RTS.SystemTestSuiteSlang.runtimeMonitorStream
import RTS._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_SystemTestAPI {
  /** helper method to set the values of all incoming ports
    * @param api_channel1 incoming data port
    * @param api_channel2 incoming data port
    */
  def put_concrete_inputs(api_channel1: Base_Types.Boolean,
                          api_channel2: Base_Types.Boolean): Unit = {
    put_channel1(api_channel1)
    put_channel2(api_channel2)
  }

  // setter for incoming data port
  def put_channel1(value: Base_Types.Boolean): Unit = {
    Art.insertInInfrastructurePort(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic.operational_api.channel1_Id, Base_Types.Boolean_Payload(value))
  }

  // setter for incoming data port
  def put_channel2(value: Base_Types.Boolean): Unit = {
    Art.insertInInfrastructurePort(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic.operational_api.channel2_Id, Base_Types.Boolean_Payload(value))
  }

  def fetchContainer(): RTS.Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS = {
    if (runtimeMonitorStream.contains(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic.id)) {
      val (_, postContainer_) = runtimeMonitorStream.get(Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic.id).get
      return postContainer_.asInstanceOf[RTS.Actuation.OrLogic_i_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic_PostState_Container_PS]
    }
    else {
      assert(F, s"No post state recorded for ${Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic.name}")
      halt(s"No post state recorded for ${Arch.RTS_i_Instance_actuationSubsystem_actuationUnit1_tempPressureTripOut_orLogic.name}")
    }
  }

  def check_concrete_outputs(api_actuate: Base_Types.Boolean): Unit = {
    var failureReasons: ISZ[ST] = ISZ()

    val actual_actuate = get_api_actuate()
    if (api_actuate != actual_actuate) {
      failureReasons = failureReasons :+ st"'actuate' did not match expected.  Expected: $api_actuate, Actual: $actual_actuate"
    }

    assert(failureReasons.isEmpty, st"${(failureReasons, "\n")}".render)
  }

  def get_api_actuate(): Base_Types.Boolean = {
    return fetchContainer().api_actuate
  }
}
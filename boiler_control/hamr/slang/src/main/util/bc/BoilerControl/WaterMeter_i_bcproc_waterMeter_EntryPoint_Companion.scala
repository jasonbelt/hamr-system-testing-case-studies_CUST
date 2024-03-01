// #Sireum

package bc.BoilerControl

import org.sireum._
import art._
import bc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object WaterMeter_i_bcproc_waterMeter_EntryPoint_Companion {

  var preStateContainer_wL: Option[WaterMeter_i_bcproc_waterMeter_PreState_Container_PS] = None()

  def pre_initialise(): Unit = {
    // assume/require contracts cannot refer to incoming ports or
    // state variables so nothing to do here
  }

  def post_initialise(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      WaterMeter_i_bcproc_waterMeter_PostState_Container_PS(
        volume = bc.BoilerControl.WaterMeter_i_bcproc_waterMeter.volume,
        api_ready = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_waterMeter.operational_api.ready_Id).asInstanceOf[Option[art.Empty]],
        api_level = 
          if (Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_waterMeter.operational_api.level_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_waterMeter.operational_api.level_Id).get.asInstanceOf[Base_Types.Float_32_Payload].value)
          else None())

    // the rest can now be performed via a different thread
    bc.runtimemonitor.RuntimeMonitor.observeInitialisePostState(Arch.BoilerControlSystem_i_Instance_bcproc_waterMeter.id, bc.runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_waterMeter_postInit, postStateContainer_wL)
  }

  def pre_compute(): Unit = {
    // block the component while its pre-state values are retrieved
    preStateContainer_wL = Some(
      WaterMeter_i_bcproc_waterMeter_PreState_Container_PS(
        In_volume = bc.BoilerControl.WaterMeter_i_bcproc_waterMeter.volume, 
        api_programReady = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_waterMeter.operational_api.programReady_Id).asInstanceOf[Option[art.Empty]], 
        api_opMode = 
          if (Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_waterMeter.operational_api.opMode_Id).nonEmpty)
            Some(Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_waterMeter.operational_api.opMode_Id).get.asInstanceOf[BoilerControl.OpMode_Payload].value)
          else None()))

    // the rest can now be performed via a different thread
    bc.runtimemonitor.RuntimeMonitor.observeComputePreState(Arch.BoilerControlSystem_i_Instance_bcproc_waterMeter.id, bc.runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_waterMeter_preCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]])
  }

  def post_compute(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      WaterMeter_i_bcproc_waterMeter_PostState_Container_PS(
        volume = bc.BoilerControl.WaterMeter_i_bcproc_waterMeter.volume,
        api_ready = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_waterMeter.operational_api.ready_Id).asInstanceOf[Option[art.Empty]],
        api_level = 
          if (Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_waterMeter.operational_api.level_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_waterMeter.operational_api.level_Id).get.asInstanceOf[Base_Types.Float_32_Payload].value)
          else None())

    // the rest can now be performed via a different thread
    bc.runtimemonitor.RuntimeMonitor.observeComputePrePostState(Arch.BoilerControlSystem_i_Instance_bcproc_waterMeter.id, bc.runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_waterMeter_postCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]], postStateContainer_wL)
  }
}
// #Sireum

package bc.BoilerControl

import org.sireum._
import art._
import bc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object BoilerControl_i_bcproc_control_EntryPoint_Companion {

  var preStateContainer_wL: Option[BoilerControl_i_bcproc_control_PreState_Container_PS] = None()

  def pre_initialise(): Unit = {
    // assume/require contracts cannot refer to incoming ports or
    // state variables so nothing to do here
  }

  def post_initialise(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      BoilerControl_i_bcproc_control_PostState_Container_PS(
        C = bc.BoilerControl.BoilerControl_i_bcproc_control.C,
        M1 = bc.BoilerControl.BoilerControl_i_bcproc_control.M1,
        M2 = bc.BoilerControl.BoilerControl_i_bcproc_control.M2,
        N1 = bc.BoilerControl.BoilerControl_i_bcproc_control.N1,
        N2 = bc.BoilerControl.BoilerControl_i_bcproc_control.N2,
        P = bc.BoilerControl.BoilerControl_i_bcproc_control.P,
        U1 = bc.BoilerControl.BoilerControl_i_bcproc_control.U1,
        U2 = bc.BoilerControl.BoilerControl_i_bcproc_control.U2,
        W = bc.BoilerControl.BoilerControl_i_bcproc_control.W,
        hasBoilerSentWaiting = bc.BoilerControl.BoilerControl_i_bcproc_control.hasBoilerSentWaiting,
        isPump0Failing = bc.BoilerControl.BoilerControl_i_bcproc_control.isPump0Failing,
        isPump1Failing = bc.BoilerControl.BoilerControl_i_bcproc_control.isPump1Failing,
        isPump2Failing = bc.BoilerControl.BoilerControl_i_bcproc_control.isPump2Failing,
        isPump3Failing = bc.BoilerControl.BoilerControl_i_bcproc_control.isPump3Failing,
        isSteamMeterFailing = bc.BoilerControl.BoilerControl_i_bcproc_control.isSteamMeterFailing,
        isWaterMeterFailing = bc.BoilerControl.BoilerControl_i_bcproc_control.isWaterMeterFailing,
        mode = bc.BoilerControl.BoilerControl_i_bcproc_control.mode,
        p0 = bc.BoilerControl.BoilerControl_i_bcproc_control.p0,
        p1 = bc.BoilerControl.BoilerControl_i_bcproc_control.p1,
        p2 = bc.BoilerControl.BoilerControl_i_bcproc_control.p2,
        p3 = bc.BoilerControl.BoilerControl_i_bcproc_control.p3,
        q = bc.BoilerControl.BoilerControl_i_bcproc_control.q,
        qa1 = bc.BoilerControl.BoilerControl_i_bcproc_control.qa1,
        qa2 = bc.BoilerControl.BoilerControl_i_bcproc_control.qa2,
        qc1 = bc.BoilerControl.BoilerControl_i_bcproc_control.qc1,
        qc2 = bc.BoilerControl.BoilerControl_i_bcproc_control.qc2,
        shouldUpdatePumps = bc.BoilerControl.BoilerControl_i_bcproc_control.shouldUpdatePumps,
        transmissionFailure = bc.BoilerControl.BoilerControl_i_bcproc_control.transmissionFailure,
        v_steamRate = bc.BoilerControl.BoilerControl_i_bcproc_control.v_steamRate,
        api_levelFail = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.levelFail_Id).asInstanceOf[Option[art.Empty]],
        api_levelRepairAck = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.levelRepairAck_Id).asInstanceOf[Option[art.Empty]],
        api_pumpControlFail0 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlFail0_Id).asInstanceOf[Option[art.Empty]],
        api_pumpControlFail1 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlFail1_Id).asInstanceOf[Option[art.Empty]],
        api_pumpControlFail2 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlFail2_Id).asInstanceOf[Option[art.Empty]],
        api_pumpControlFail3 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlFail3_Id).asInstanceOf[Option[art.Empty]],
        api_pumpControlRepairAck0 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlRepairAck0_Id).asInstanceOf[Option[art.Empty]],
        api_pumpControlRepairAck1 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlRepairAck1_Id).asInstanceOf[Option[art.Empty]],
        api_pumpControlRepairAck2 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlRepairAck2_Id).asInstanceOf[Option[art.Empty]],
        api_pumpControlRepairAck3 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlRepairAck3_Id).asInstanceOf[Option[art.Empty]],
        api_pumpFail0 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpFail0_Id).asInstanceOf[Option[art.Empty]],
        api_pumpFail1 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpFail1_Id).asInstanceOf[Option[art.Empty]],
        api_pumpFail2 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpFail2_Id).asInstanceOf[Option[art.Empty]],
        api_pumpFail3 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpFail3_Id).asInstanceOf[Option[art.Empty]],
        api_pumpRepairAck0 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpRepairAck0_Id).asInstanceOf[Option[art.Empty]],
        api_pumpRepairAck1 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpRepairAck1_Id).asInstanceOf[Option[art.Empty]],
        api_pumpRepairAck2 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpRepairAck2_Id).asInstanceOf[Option[art.Empty]],
        api_pumpRepairAck3 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpRepairAck3_Id).asInstanceOf[Option[art.Empty]],
        api_ready = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.ready_Id).asInstanceOf[Option[art.Empty]],
        api_steamFail = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.steamFail_Id).asInstanceOf[Option[art.Empty]],
        api_steamRepairAck = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.steamRepairAck_Id).asInstanceOf[Option[art.Empty]],
        api_valve = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.valve_Id).asInstanceOf[Option[art.Empty]],
        api_opMode = 
          if (Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.opMode_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.opMode_Id).get.asInstanceOf[BoilerControl.OpMode_Payload].value)
          else None(),
        api_openPump0 = 
          if (Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.openPump0_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.openPump0_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None(),
        api_openPump1 = 
          if (Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.openPump1_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.openPump1_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None(),
        api_openPump2 = 
          if (Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.openPump2_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.openPump2_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None(),
        api_openPump3 = 
          if (Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.openPump3_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.openPump3_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None())

    // the rest can now be performed via a different thread
    bc.runtimemonitor.RuntimeMonitor.observeInitialisePostState(Arch.BoilerControlSystem_i_Instance_bcproc_control.id, bc.runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_control_postInit, postStateContainer_wL)
  }

  def pre_compute(): Unit = {
    // block the component while its pre-state values are retrieved
    preStateContainer_wL = Some(
      BoilerControl_i_bcproc_control_PreState_Container_PS(
        In_C = bc.BoilerControl.BoilerControl_i_bcproc_control.C, 
        In_M1 = bc.BoilerControl.BoilerControl_i_bcproc_control.M1, 
        In_M2 = bc.BoilerControl.BoilerControl_i_bcproc_control.M2, 
        In_N1 = bc.BoilerControl.BoilerControl_i_bcproc_control.N1, 
        In_N2 = bc.BoilerControl.BoilerControl_i_bcproc_control.N2, 
        In_P = bc.BoilerControl.BoilerControl_i_bcproc_control.P, 
        In_U1 = bc.BoilerControl.BoilerControl_i_bcproc_control.U1, 
        In_U2 = bc.BoilerControl.BoilerControl_i_bcproc_control.U2, 
        In_W = bc.BoilerControl.BoilerControl_i_bcproc_control.W, 
        In_hasBoilerSentWaiting = bc.BoilerControl.BoilerControl_i_bcproc_control.hasBoilerSentWaiting, 
        In_isPump0Failing = bc.BoilerControl.BoilerControl_i_bcproc_control.isPump0Failing, 
        In_isPump1Failing = bc.BoilerControl.BoilerControl_i_bcproc_control.isPump1Failing, 
        In_isPump2Failing = bc.BoilerControl.BoilerControl_i_bcproc_control.isPump2Failing, 
        In_isPump3Failing = bc.BoilerControl.BoilerControl_i_bcproc_control.isPump3Failing, 
        In_isSteamMeterFailing = bc.BoilerControl.BoilerControl_i_bcproc_control.isSteamMeterFailing, 
        In_isWaterMeterFailing = bc.BoilerControl.BoilerControl_i_bcproc_control.isWaterMeterFailing, 
        In_mode = bc.BoilerControl.BoilerControl_i_bcproc_control.mode, 
        In_p0 = bc.BoilerControl.BoilerControl_i_bcproc_control.p0, 
        In_p1 = bc.BoilerControl.BoilerControl_i_bcproc_control.p1, 
        In_p2 = bc.BoilerControl.BoilerControl_i_bcproc_control.p2, 
        In_p3 = bc.BoilerControl.BoilerControl_i_bcproc_control.p3, 
        In_q = bc.BoilerControl.BoilerControl_i_bcproc_control.q, 
        In_qa1 = bc.BoilerControl.BoilerControl_i_bcproc_control.qa1, 
        In_qa2 = bc.BoilerControl.BoilerControl_i_bcproc_control.qa2, 
        In_qc1 = bc.BoilerControl.BoilerControl_i_bcproc_control.qc1, 
        In_qc2 = bc.BoilerControl.BoilerControl_i_bcproc_control.qc2, 
        In_shouldUpdatePumps = bc.BoilerControl.BoilerControl_i_bcproc_control.shouldUpdatePumps, 
        In_transmissionFailure = bc.BoilerControl.BoilerControl_i_bcproc_control.transmissionFailure, 
        In_v_steamRate = bc.BoilerControl.BoilerControl_i_bcproc_control.v_steamRate, 
        api_boilerReady = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.boilerReady_Id).asInstanceOf[Option[art.Empty]], 
        api_boilerWaiting = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.boilerWaiting_Id).asInstanceOf[Option[art.Empty]], 
        api_levelFailAck = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.levelFailAck_Id).asInstanceOf[Option[art.Empty]], 
        api_levelRepair = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.levelRepair_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpControlFailAck0 = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlFailAck0_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpControlFailAck1 = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlFailAck1_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpControlFailAck2 = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlFailAck2_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpControlFailAck3 = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlFailAck3_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpControlReady0 = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlReady0_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpControlReady1 = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlReady1_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpControlReady2 = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlReady2_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpControlReady3 = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlReady3_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpControlRepair0 = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlRepair0_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpControlRepair1 = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlRepair1_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpControlRepair2 = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlRepair2_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpControlRepair3 = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlRepair3_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpFailAck0 = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpFailAck0_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpFailAck1 = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpFailAck1_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpFailAck2 = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpFailAck2_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpFailAck3 = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpFailAck3_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpRepair0 = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpRepair0_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpRepair1 = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpRepair1_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpRepair2 = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpRepair2_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpRepair3 = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpRepair3_Id).asInstanceOf[Option[art.Empty]], 
        api_steamFailAck = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.steamFailAck_Id).asInstanceOf[Option[art.Empty]], 
        api_steamMeterReady = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.steamMeterReady_Id).asInstanceOf[Option[art.Empty]], 
        api_steamRepair = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.steamRepair_Id).asInstanceOf[Option[art.Empty]], 
        api_stop = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.stop_Id).asInstanceOf[Option[art.Empty]], 
        api_waterMeterReady = Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.waterMeterReady_Id).asInstanceOf[Option[art.Empty]], 
        api_pumpFlow0 = 
          if (Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpFlow0_Id).nonEmpty)
            Some(Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpFlow0_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None(), 
        api_pumpFlow1 = 
          if (Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpFlow1_Id).nonEmpty)
            Some(Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpFlow1_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None(), 
        api_pumpFlow2 = 
          if (Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpFlow2_Id).nonEmpty)
            Some(Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpFlow2_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None(), 
        api_pumpFlow3 = 
          if (Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpFlow3_Id).nonEmpty)
            Some(Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpFlow3_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None(), 
        api_pumpOpen0 = 
          if (Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpOpen0_Id).nonEmpty)
            Some(Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpOpen0_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None(), 
        api_pumpOpen1 = 
          if (Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpOpen1_Id).nonEmpty)
            Some(Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpOpen1_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None(), 
        api_pumpOpen2 = 
          if (Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpOpen2_Id).nonEmpty)
            Some(Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpOpen2_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None(), 
        api_pumpOpen3 = 
          if (Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpOpen3_Id).nonEmpty)
            Some(Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpOpen3_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None(), 
        api_steamRate = 
          if (Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.steamRate_Id).nonEmpty)
            Some(Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.steamRate_Id).get.asInstanceOf[Base_Types.Float_32_Payload].value)
          else None(), 
        api_waterLevel = 
          if (Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.waterLevel_Id).nonEmpty)
            Some(Art.observeInPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.waterLevel_Id).get.asInstanceOf[Base_Types.Float_32_Payload].value)
          else None()))

    // the rest can now be performed via a different thread
    bc.runtimemonitor.RuntimeMonitor.observeComputePreState(Arch.BoilerControlSystem_i_Instance_bcproc_control.id, bc.runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_control_preCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]])
  }

  def post_compute(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      BoilerControl_i_bcproc_control_PostState_Container_PS(
        C = bc.BoilerControl.BoilerControl_i_bcproc_control.C,
        M1 = bc.BoilerControl.BoilerControl_i_bcproc_control.M1,
        M2 = bc.BoilerControl.BoilerControl_i_bcproc_control.M2,
        N1 = bc.BoilerControl.BoilerControl_i_bcproc_control.N1,
        N2 = bc.BoilerControl.BoilerControl_i_bcproc_control.N2,
        P = bc.BoilerControl.BoilerControl_i_bcproc_control.P,
        U1 = bc.BoilerControl.BoilerControl_i_bcproc_control.U1,
        U2 = bc.BoilerControl.BoilerControl_i_bcproc_control.U2,
        W = bc.BoilerControl.BoilerControl_i_bcproc_control.W,
        hasBoilerSentWaiting = bc.BoilerControl.BoilerControl_i_bcproc_control.hasBoilerSentWaiting,
        isPump0Failing = bc.BoilerControl.BoilerControl_i_bcproc_control.isPump0Failing,
        isPump1Failing = bc.BoilerControl.BoilerControl_i_bcproc_control.isPump1Failing,
        isPump2Failing = bc.BoilerControl.BoilerControl_i_bcproc_control.isPump2Failing,
        isPump3Failing = bc.BoilerControl.BoilerControl_i_bcproc_control.isPump3Failing,
        isSteamMeterFailing = bc.BoilerControl.BoilerControl_i_bcproc_control.isSteamMeterFailing,
        isWaterMeterFailing = bc.BoilerControl.BoilerControl_i_bcproc_control.isWaterMeterFailing,
        mode = bc.BoilerControl.BoilerControl_i_bcproc_control.mode,
        p0 = bc.BoilerControl.BoilerControl_i_bcproc_control.p0,
        p1 = bc.BoilerControl.BoilerControl_i_bcproc_control.p1,
        p2 = bc.BoilerControl.BoilerControl_i_bcproc_control.p2,
        p3 = bc.BoilerControl.BoilerControl_i_bcproc_control.p3,
        q = bc.BoilerControl.BoilerControl_i_bcproc_control.q,
        qa1 = bc.BoilerControl.BoilerControl_i_bcproc_control.qa1,
        qa2 = bc.BoilerControl.BoilerControl_i_bcproc_control.qa2,
        qc1 = bc.BoilerControl.BoilerControl_i_bcproc_control.qc1,
        qc2 = bc.BoilerControl.BoilerControl_i_bcproc_control.qc2,
        shouldUpdatePumps = bc.BoilerControl.BoilerControl_i_bcproc_control.shouldUpdatePumps,
        transmissionFailure = bc.BoilerControl.BoilerControl_i_bcproc_control.transmissionFailure,
        v_steamRate = bc.BoilerControl.BoilerControl_i_bcproc_control.v_steamRate,
        api_levelFail = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.levelFail_Id).asInstanceOf[Option[art.Empty]],
        api_levelRepairAck = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.levelRepairAck_Id).asInstanceOf[Option[art.Empty]],
        api_pumpControlFail0 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlFail0_Id).asInstanceOf[Option[art.Empty]],
        api_pumpControlFail1 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlFail1_Id).asInstanceOf[Option[art.Empty]],
        api_pumpControlFail2 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlFail2_Id).asInstanceOf[Option[art.Empty]],
        api_pumpControlFail3 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlFail3_Id).asInstanceOf[Option[art.Empty]],
        api_pumpControlRepairAck0 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlRepairAck0_Id).asInstanceOf[Option[art.Empty]],
        api_pumpControlRepairAck1 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlRepairAck1_Id).asInstanceOf[Option[art.Empty]],
        api_pumpControlRepairAck2 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlRepairAck2_Id).asInstanceOf[Option[art.Empty]],
        api_pumpControlRepairAck3 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpControlRepairAck3_Id).asInstanceOf[Option[art.Empty]],
        api_pumpFail0 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpFail0_Id).asInstanceOf[Option[art.Empty]],
        api_pumpFail1 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpFail1_Id).asInstanceOf[Option[art.Empty]],
        api_pumpFail2 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpFail2_Id).asInstanceOf[Option[art.Empty]],
        api_pumpFail3 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpFail3_Id).asInstanceOf[Option[art.Empty]],
        api_pumpRepairAck0 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpRepairAck0_Id).asInstanceOf[Option[art.Empty]],
        api_pumpRepairAck1 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpRepairAck1_Id).asInstanceOf[Option[art.Empty]],
        api_pumpRepairAck2 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpRepairAck2_Id).asInstanceOf[Option[art.Empty]],
        api_pumpRepairAck3 = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.pumpRepairAck3_Id).asInstanceOf[Option[art.Empty]],
        api_ready = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.ready_Id).asInstanceOf[Option[art.Empty]],
        api_steamFail = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.steamFail_Id).asInstanceOf[Option[art.Empty]],
        api_steamRepairAck = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.steamRepairAck_Id).asInstanceOf[Option[art.Empty]],
        api_valve = Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.valve_Id).asInstanceOf[Option[art.Empty]],
        api_opMode = 
          if (Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.opMode_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.opMode_Id).get.asInstanceOf[BoilerControl.OpMode_Payload].value)
          else None(),
        api_openPump0 = 
          if (Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.openPump0_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.openPump0_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None(),
        api_openPump1 = 
          if (Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.openPump1_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.openPump1_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None(),
        api_openPump2 = 
          if (Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.openPump2_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.openPump2_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None(),
        api_openPump3 = 
          if (Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.openPump3_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.BoilerControlSystem_i_Instance_bcproc_control.operational_api.openPump3_Id).get.asInstanceOf[Base_Types.Boolean_Payload].value)
          else None())

    // the rest can now be performed via a different thread
    bc.runtimemonitor.RuntimeMonitor.observeComputePrePostState(Arch.BoilerControlSystem_i_Instance_bcproc_control.id, bc.runtimemonitor.ObservationKind.BoilerControlSystem_i_Instance_bcproc_control_postCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]], postStateContainer_wL)
  }
}
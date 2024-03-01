// #Sireum

package isolette.Regulate

import org.sireum._
import isolette.GumboXUtil.GumboXResult
import isolette.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// Distribute SlangCheck test runners

@record class Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_GumboX_DSC_TestRunner
  extends Random.Gen.TestRunner[Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P]
  with Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_GumboX_TestHarness {

  val verbose: B = F

  var seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibcurrent_tempWstatus: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibinterface_failure: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibinternal_failure: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P = {
    val api_current_tempWstatus = ranLibcurrent_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl()
    val api_interface_failure = ranLibinterface_failure.nextIsolette_Data_ModelFailure_Flag_impl()
    val api_internal_failure = ranLibinternal_failure.nextIsolette_Data_ModelFailure_Flag_impl()
    return Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P(
      api_current_tempWstatus, api_interface_failure, api_internal_failure
    )
  }

  override def toCompactJson(o: Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P): String = {
    return isolette.JSON.fromRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P(o, T)
  }

  override def fromJson(json: String): Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P = {
    isolette.JSON.toRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P): B = {
    BeforeEntrypoint()
    val r: B = testComputeCBV(o) match {
      case GumboXResult.Pre_Condition_Unsat =>
        isolette.DSC_RecordUnsatPre.report(isolette.JSON.fromRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_P(o, T))
        T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}

@record class Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_GumboX_DSC_TestRunnerwL
  extends Random.Gen.TestRunner[Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS]
  with Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_GumboX_TestHarness {

  val verbose: B = F

  var seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLiblastRegulatorMode: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibcurrent_tempWstatus: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibinterface_failure: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibinternal_failure: RandomLib = RandomLib(Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS = {
    val In_lastRegulatorMode = ranLiblastRegulatorMode.nextIsolette_Data_ModelRegulator_ModeType()
    val api_current_tempWstatus = ranLibcurrent_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl()
    val api_interface_failure = ranLibinterface_failure.nextIsolette_Data_ModelFailure_Flag_impl()
    val api_internal_failure = ranLibinternal_failure.nextIsolette_Data_ModelFailure_Flag_impl()
    return Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS(
      In_lastRegulatorMode, api_current_tempWstatus, api_interface_failure, api_internal_failure
    )
  }

  override def toCompactJson(o: Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS): String = {
    return isolette.JSON.fromRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS(o, T)
  }

  override def fromJson(json: String): Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS = {
    isolette.JSON.toRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: Manage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS): B = {
    BeforeEntrypoint()
    val r: B = testComputeCBwLV(o) match {
      case GumboXResult.Pre_Condition_Unsat =>
        isolette.DSC_RecordUnsatPre.report(isolette.JSON.fromRegulateManage_Regulator_Mode_impl_thermostat_regulate_temperature_manage_regulator_mode_PreState_Container_PS(o, T))
        T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}
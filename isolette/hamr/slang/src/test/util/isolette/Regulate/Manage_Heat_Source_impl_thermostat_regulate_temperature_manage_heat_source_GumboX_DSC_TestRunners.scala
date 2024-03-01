// #Sireum

package isolette.Regulate

import org.sireum._
import isolette.GumboXUtil.GumboXResult
import isolette.RandomLib
import org.sireum.Random.Gen64
import org.sireum.Random.Impl.Xoshiro256

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// Distribute SlangCheck test runners

@record class Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_DSC_TestRunner
  extends Random.Gen.TestRunner[Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P]
  with Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_TestHarness {

  val verbose: B = F

  var seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLibcurrent_tempWstatus: RandomLib = RandomLib(100, F, Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLiblower_desired_temp: RandomLib = RandomLib(100, F, Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibregulator_mode: RandomLib = RandomLib(100, F, Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibupper_desired_temp: RandomLib = RandomLib(100, F, Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P = {
    val api_current_tempWstatus = ranLibcurrent_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl()
    val api_lower_desired_temp = ranLiblower_desired_temp.nextIsolette_Data_ModelTemp_impl()
    val api_regulator_mode = ranLibregulator_mode.nextIsolette_Data_ModelRegulator_ModeType()
    val api_upper_desired_temp = ranLibupper_desired_temp.nextIsolette_Data_ModelTemp_impl()
    return Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P(
      api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp
    )
  }

  override def toCompactJson(o: Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P): String = {
    return isolette.JSON.fromRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P(o, T)
  }

  override def fromJson(json: String): Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P = {
    isolette.JSON.toRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P): B = {
    BeforeEntrypoint()
    val r: B = testComputeCBV(o) match {
      case GumboXResult.Pre_Condition_Unsat =>
        isolette.DSC_RecordUnsatPre.report(isolette.JSON.fromRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_P(o, T))
        T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}

@record class Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_DSC_TestRunnerwL
  extends Random.Gen.TestRunner[Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS]
  with Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_TestHarness {

  val verbose: B = F

  var seedGen: Gen64 = Random.Gen64Impl(Xoshiro256.create)
  val ranLiblastCmd: RandomLib = RandomLib(100, F, Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibcurrent_tempWstatus: RandomLib = RandomLib(100, F, Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLiblower_desired_temp: RandomLib = RandomLib(100, F, Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibregulator_mode: RandomLib = RandomLib(100, F, Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))
  val ranLibupper_desired_temp: RandomLib = RandomLib(100, F, Random.Gen64Impl(Xoshiro256.createSeed(seedGen.genU64())))

  override def next(): Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS = {
    val In_lastCmd = ranLiblastCmd.nextIsolette_Data_ModelOn_OffType()
    val api_current_tempWstatus = ranLibcurrent_tempWstatus.nextIsolette_Data_ModelTempWstatus_impl()
    val api_lower_desired_temp = ranLiblower_desired_temp.nextIsolette_Data_ModelTemp_impl()
    val api_regulator_mode = ranLibregulator_mode.nextIsolette_Data_ModelRegulator_ModeType()
    val api_upper_desired_temp = ranLibupper_desired_temp.nextIsolette_Data_ModelTemp_impl()
    return Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS(
      In_lastCmd, api_current_tempWstatus, api_lower_desired_temp, api_regulator_mode, api_upper_desired_temp
    )
  }

  override def toCompactJson(o: Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS): String = {
    return isolette.JSON.fromRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS(o, T)
  }

  override def fromJson(json: String): Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS = {
    isolette.JSON.toRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS(json) match {
      case Either.Left(o) => return o
      case Either.Right(msg) => halt(msg.string)
    }
  }

  override def test(o: Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS): B = {
    BeforeEntrypoint()
    val r: B = testComputeCBwLV(o) match {
      case GumboXResult.Pre_Condition_Unsat =>
        isolette.DSC_RecordUnsatPre.report(isolette.JSON.fromRegulateManage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_PreState_Container_PS(o, T))
        T
      case GumboXResult.Post_Condition_Fail => F
      case GumboXResult.Post_Condition_Pass => T
    }
    AfterEntrypoint()
    return r
  }
}

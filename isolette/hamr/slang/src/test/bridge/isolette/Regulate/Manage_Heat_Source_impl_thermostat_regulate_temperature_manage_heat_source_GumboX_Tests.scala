package isolette.Regulate

import org.sireum._
import isolette.Regulate._
import isolette._
import org.sireum.Random.Impl.Xoshiro256

// This file will not be overwritten so is safe to edit

class Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_Tests extends Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_GumboX_TestHarness_ScalaTest_Generator {

  // set verbose to T to see pre/post state values and generated unit tests
  // that can be copied/pasted to replay a test
  override val verbose: B = F

  // set failOnUnsatPreconditions to T if the unit tests should fail when either
  // SlangCheck is never able to satisfy a datatype's filter or the generated
  // test vectors are never able to satisfy an entry point's assume pre-condition
  override val failOnUnsatPreconditions: B = F

  // profiles that will be used for the initialise tests
  override def getInitialiseProfiles: MSZ[Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Profile] = {
    return MSZ()//MSZ(getDefaultInitialiseProfile)
  }

  // profiles that will be used to generate the incoming port values
  override def getProfiles_P: MSZ[Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Profile_P] = {
    return MSZ()//MSZ(getDefaultProfile_P)
  }

  // profiles that will be used to generate the incoming port values
  // and the pre-state values of the state variables
  override def getProfiles_PS: MSZ[Manage_Heat_Source_impl_thermostat_regulate_temperature_manage_heat_source_Profile_PS] = {
    //return MSZ(getDefaultProfile_PS)
    val p = getDefaultProfile_PS
    var rl: RandomLib = getDefaultProfile_PS.api_lower_desired_temp

    // set the verbosity to true for all configs -- note this form does not cause a
    // copy of rl to be created
    rl.defaultVerbosity = F

    // alternate form that allows for chaining. The first setXX method's 'return this'
    // returns a copy of rl that a subsequent setXX will operate on. So need to update
    // rl with the last copy in the chain
    rl = rl.setVerbosity(T).set_Config_F32(rl.get_Config_F32(low = Some(0f), attempts = Some(-1), filter = v => v == 100.0f))

    // in this form the returned copy is discarded, but rl was side affected. Note it's
    // likely api_lower_desired_temp's nextF32 will run for a very long time as its
    // filter requires 100.0f to be generated and its attempts of -1 set above overrides
    // the 50 below
    rl.setAttempts(50)

    return MSZ(p(api_lower_desired_temp = rl))

  }
}
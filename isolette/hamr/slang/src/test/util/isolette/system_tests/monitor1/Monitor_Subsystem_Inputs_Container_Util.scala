package isolette.system_tests.monitor1

import org.sireum._
import isolette._
import org.sireum.Random.Impl.Xoshiro256

// Do not edit this file as it will be overwritten if SystemTestArtifactGen is rerun

object Monitor_Subsystem_Inputs_Container_Util {

  def getSeed: U64 = {
    val rand = new java.util.Random()
    rand.setSeed(rand.nextLong())
    return U64(rand.nextLong())
  }

  def freshRandomLib: RandomLib = {
    return RandomLib(100, F, Random.Gen64Impl(Xoshiro256.createSeed(getSeed)))
  }
}

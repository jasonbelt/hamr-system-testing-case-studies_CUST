package isolette.system_tests.monitor1

import org.sireum._
import isolette._
import org.scalatest.BeforeAndAfterAll

// Do not edit this file as it will be overwritten if SystemTestArtifactGen is rerun

object Monitor_Subsystem_Inputs_Container_SlangCheck {

  case class NameProvider1(name: String,
                           function: Any => B)

  case class NameProvider2(name: String,
                           function: (Any, Any) => B)

  case class TestConfiguration(schema: NameProvider2,
                               description: String,
                               profile: Monitor_Subsystem_Inputs_Container_Profile,
                               filter: NameProvider1,
                               property: NameProvider2,
                               componentsOfInterest: ISZ[String],
                               numTests: Z
                              )
}

trait Monitor_Subsystem_Inputs_Container_SlangCheck
  extends SystemTestSuite with BeforeAndAfterAll {


  def next(profile: Monitor_Subsystem_Inputs_Container_Profile): Option[Monitor_Subsystem_Inputs_Container] = {
    return Monitor_Subsystem_Inputs_Container_Profile.nextH(profile)
  }

  def freshRandomLib: RandomLib = {
    return Monitor_Subsystem_Inputs_Container_Util.freshRandomLib
  }

  def getProfiles: MSZ[Monitor_Subsystem_Inputs_Container_Profile] = {
    return MSZ(getDefaultProfile)
  }

  //------------------------------------------------
  //  Test Vector Profiles
  //
  //   ..eventually auto-generated from a descriptor
  //     of injection vector
  //------------------------------------------------

  def getDefaultProfile: Monitor_Subsystem_Inputs_Container_Profile = {
    return Monitor_Subsystem_Inputs_Container_Profile.getDefaultProfile
  }

  def disableLogsAndGuis(): Unit = {

    // disable the various guis
    System.setProperty("java.awt.headless", "true")

    // suppress ART's log stream
    art.ArtNative_Ext.logStream = new java.io.PrintStream(new java.io.OutputStream {
      override def write(b: Int): Unit = {}
    })

    // suppress the static scheduler's log stream
    art.scheduling.static.StaticSchedulerIO_Ext.logStream = new java.io.PrintStream(new java.io.OutputStream {
      override def write(b: Int): Unit = {}
    })
  }
}

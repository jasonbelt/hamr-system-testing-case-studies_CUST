// #Sireum

package tc.TempSensor

import org.sireum._
import tc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object GUMBO__Library {
  @strictpure def inRange(temp: TempSensor.Temperature_i): Base_Types.Boolean = temp.degrees >= -50.0f &&
    temp.degrees <= 150.0f
}
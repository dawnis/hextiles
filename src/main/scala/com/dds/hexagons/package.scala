package com.dds

package object hexagons extends hexagon {

  val hex_directions = Array(hexagon(1, 0, -1), hexagon(1, -1, 0), hexagon(0, -1, 1),
    hexagon(-1, 0, 1), hexagon(-1, 1, 0), hexagon(0, 1, -1))

  def getDirection(direction: Int): hexagon = {
    require( 0 <= direction  && direction <= 5) //maybe an enumeration would work better?
    hex_directions(direction)
  }
}

package com.dds

class hexagon {

  // using cube coordinates
  var q, r, s: Int = null

}

object hexagon {

  def apply(q: Int, r: Int, s: Int): hexagon = {
    require(q + r + s == 0)
    val hex = new hexagon
    hex.q = q
    hex.r = r
    hex.s = s
    hex
}

}

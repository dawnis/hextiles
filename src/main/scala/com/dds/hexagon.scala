package com.dds

class hexagon {

  // using cube coordinates
  var q, r, s: Int = null

  //equality
  def ==(hexb: hexagon): Boolean =  {
    (q == hexb.q)  & (r == hexb.r) & (s == hexb.s)
  }

  //addition
  def +(hexb: hexagon): hexagon ={
    hexagon(q+hexb.q, r+hexb.r, s+hexb.s)
  }

  //subtraction
  def -(hexb: hexagon): hexagon  = {
    hexagon(q-hexb.q, r-hexb.r, q-hexb.q)
  }

  //multiplying by a constant
  def *(k: Int): hexagon  = {
    hexagon(q*k, r*k, s*k)
  }

  def len(): Int  = {
    (q.abs + r.abs + s.abs) / 2
  }

  def distance_to(hexb: hexagon): Int  = {
    (this - hexb).len()
  }

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

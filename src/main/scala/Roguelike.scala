import processing.awt.PGraphicsJava2D
import processing.core._
import processing.event.{KeyEvent, MouseEvent}
import processing.opengl.PGraphics3D

import processing.opengl._

import processing.core.PGraphics

import processing.opengl.PGraphics3D

class Roguelike extends PApplet {
  override def setup(): Unit = {}
  override def settings(): Unit = {
    val pg = null
    size(1200, 1200)

  }
  override def draw(): Unit = {

    background(100, 100, 100)
  }

}
object Roguelike extends App {
  PApplet.main(classOf[Roguelike])

}

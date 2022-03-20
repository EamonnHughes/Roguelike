import processing.awt.PGraphicsJava2D
import processing.core._
import processing.event.{KeyEvent, MouseEvent}
import processing.opengl.PGraphicsOpenGL

class Roguelike extends PApplet {
  override def setup(): Unit = {}
  override def settings(): Unit = {

    size(1200, 1200)
  }
  override def draw(): Unit = {

    background(100, 100, 100)
  }

}
object Roguelike extends App {
  PApplet.main(classOf[Roguelike])

}

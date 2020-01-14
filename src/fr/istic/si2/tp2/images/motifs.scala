package fr.istic.si2.tp2.images

import fr.istic.si2.scribble._

import scala.io.StdIn._

object Motifs extends App {

  // Définition des images illustrant la météo
  val sun: Image = FromFile("./img/sun.png")
  val cloud: Image = FromFile("./img/cloud.png")

  /**
   * Une image de soleil cachée par un nuage.
   */
  val cloudy: Image = onBackAt(cloud, sun, -30, -20)
  //  draw(cloudy, "cloudy")


  /**
   * @param i une image
   * @param c une couleur
   * @return image i coloriée et tracée avec la couleur c (si i n'est pas déjà coloriée)
   */
  /* TP2: On vous fournit cette fonction pour factoriser du code dans l'exercice suivant. */
  def allColor(i: Image, c: Color): Image = {
    fillColor(lineColor(i, c), c)
  }


  // Définitions d'images illustrant les contrôles média courants
  /**
   * Une image illustrant l'arrêt de la lecture et la remise à zéro (STOP)
   */
  val stop: Image = allColor(new Rectangle(50, 50), RED)
  //  draw(stop, "stop")
  /**
   * Une image illustrant l'arrêt de la lecture (PAUSE)
   */
  val pause: Image = new Beside(allColor(new Rectangle(15, 50), GREEN),
    new Beside(allColor(new Rectangle(10, 50), TRANSPARENT), allColor(new Rectangle(15, 50), GREEN)))
  //  draw(pause, "pause")
  /**
   * Une image illustrant le démarrage de la lecture (PLAY) 
   */
  val play: Image = Rotate(LineColor(FillColor(new Triangle(50), BLUE), BLUE), -89)
  //  draw(play, "play")
  /**
   * Une image illustrant la sélection de la prochaine piste (NEXT)
   */
  val next: Image = new Beside(new Beside(Rotate(allColor(new Triangle(50), BLACK), -89),
    Rotate(allColor(new Triangle(50), BLACK), -89)), allColor(new Rectangle(10, 50), BLACK))
  //  draw(next, "next")
  /**
   * Une image illustrant la sélection de la piste précédente (PREVIOUS)
   */
  val previous: Image = new Rotate(next, 180)
  //  draw(previous, "previous")

  /**
   * Une image illustrant une flèche
   */
  val arrow: Image = new Beside(allColor(new Rectangle(40, 15), BLUE), new Rotate(allColor(new Triangle(25), BLUE), -90))
  /**
   * Une image illustrant une flèche qui a subi une rotation
   */
  val rotatedArrow = new Rotate(arrow, 45)
  /**
   * Une image illustrant un cercle vert
   */
  val circle: Image = allColor(new Circle(40), GREEN)
  /**
   * Une image illustrant une flèche qui a subi une rotation dans un cercle vert
   */
  val arrowIntoCircle: Image = new On(rotatedArrow, circle)
  //  draw(arrowIntoCircle, "arrowIntoCircle")

  /**
   * Une image illustrant un triangle jaune
   */
  val yellowTriangle = allColor(new Triangle(50), Color(255, 255, 0, 255))
  /**
   * Une image illustrant une étoile jaune à 6 branches
   */
  val star = new OnFrontAt(new Rotate(yellowTriangle, 180), yellowTriangle, 0, 15)

  /**
   * Une image illustrant un cercle noir
   */
  val blackCircle = allColor(new Circle(40), BLACK)
  /**
   * Une image illustrant deux cercles noirs
   */
  val twoCircle = new OnFrontAt(blackCircle, blackCircle, 55, 0)
  /**
   * Une image illustrant trois cercles noirs
   */
  val threeCircle = new OnFrontAt(twoCircle, blackCircle, -55 / 2, 55)
  /**
   * Une image illustrant un triangle noir
   */
  val blackTriangle = new Rotate(allColor(new Triangle(50), BLACK), 0)
  /**
   * Une image illustrant un pic
   */
  val pic = new OnFrontAt(threeCircle, blackTriangle, -43, -55 * 2 - 10)
  draw(pic, "pic")


  /**
   * Une image illustrant un triangle rouge
   */
  val redTriangle = allColor(new Triangle(50), RED)
  /**
   * Une image illustrant un carreau
   */
  val square = new OnFrontAt(new Rotate(redTriangle, 180), redTriangle, 0, 44)

}

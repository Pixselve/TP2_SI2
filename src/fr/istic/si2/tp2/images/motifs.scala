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
  /* TODO TP2: Vous devez utiliser sun et cloud. */
  val cloudy: Image = onBackAt(cloud, sun, -30, -20)


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
  val stop: Image = LineColor(FillColor(new Rectangle(50, 50), RED), TRANSPARENT)

  /**
   * Une image illustrant l'arrêt de la lecture (PAUSE)
   */
  val pause: Image = new Beside(LineColor(FillColor(new Rectangle(15, 50), GREEN), TRANSPARENT), new Beside(LineColor(FillColor(new Rectangle(10, 50), TRANSPARENT), TRANSPARENT), LineColor(FillColor(new Rectangle(15, 50), GREEN), TRANSPARENT)))

  /**
   * Une image illustrant le démarrage de la lecture (PLAY) 
   */
  val play: Image = Rotate(LineColor(FillColor(new Triangle(50), BLUE), BLUE), -89)

  /**
   * Une image illustrant la sélection de la prochaine piste (NEXT)
   */
  val next: Image = new Beside(new Beside(Rotate(LineColor(FillColor(new Triangle(50), BLACK), BLACK), -89), Rotate(LineColor(FillColor(new Triangle(50), BLACK), BLACK), -89)), LineColor(FillColor(new Rectangle(10, 50), BLACK), BLACK))
  draw(next, "next")
  /**
   * Une image illustrant la sélection de la piste précédente (PREVIOUS)
   */
  val previous: Image = new Rotate(next, 180)
  draw(previous, "previous")
}

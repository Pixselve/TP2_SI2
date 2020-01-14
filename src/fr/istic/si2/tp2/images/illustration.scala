package fr.istic.si2.tp2.images

import fr.istic.si2.scribble._
import fr.istic.si2.tp2.images.Motifs.{cloud, sun}

import scala.io.StdIn._

object ImageMeteo extends App {

  // Définition des images illustrant la météo
  val sun: Image = FromFile("./img/sun.png")
  val cloud: Image = FromFile("./img/cloud.png")
  val cloudy: Image = onBackAt(cloud, sun, -30, -20)

  /**
   * @param t une chaine dans {"beau", "couvert", "gris" }
   * @return une Image illustrant le temps décrit par t
   */
  def temps(t: String): Image = {
    t match {
      case "beau" => sun
      case "couvert" => cloud
      case "gris" => cloudy
    }
  }

  /**
   * @param t une chaine quelconque
   * @return t est une chaine parmi "beau", "couvert", et "gris"
   */
  def tempsPossible(t: String): Boolean = {
    t match {
      case "beau" => true
      case "couvert" => true
      case "gris" => true
      case _ => false
    }
  }


  // Boucle d'interaction simple avec l'utilisateur
  do {
    println("Quel temps fait-il (beau, couvert, ou gris) ?")
    val in_temps: String = readLine()
    if (tempsPossible(in_temps)) {
      draw(temps(in_temps))
    } else {
      println("Cette description du temps n'existe pas. Veuillez choisir parmi beau, couvert ou gris")
    }
    println("Continuer? (oui/non)")
  } while (readLine() == "oui")
  println("Goodbye")

}

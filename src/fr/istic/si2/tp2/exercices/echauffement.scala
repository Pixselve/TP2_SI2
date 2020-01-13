package fr.istic.si2.tp2.exercices

import scala.util.Random

object ExosBasiques extends App {

  /**
   * @param x un entier
   * @return le double de x
   */
  def double(x: Int): Int = {
    x + x
  }

  /**
   * @param x un entier
   * @return le quadruple de x
   */
  def quadruple(x: Int): Int = double(double(x))

  System.out.println(quadruple(2))
  System.out.println(quadruple(8))
  System.out.println(quadruple(1))

  /**
   * @param x un entier
   * @return le chiffre des unités de x
   */
  def unite(x: Int): Int = {
    scala.math.abs(x % 10)
  }

  /**
   * @param x un entier
   * @return le chiffre des dizaines de x
   */
  def dizaine(x: Int): Int = {
    unite(x / 10)
  }

  /**
   * @param x un entier
   * @return x est positif ou nul
   */
  def signe(x: Int): Boolean = x >= 0

  System.out.println(signe(1))
  System.out.println(signe(-1))
  System.out.println(signe(0))


  /**
   * @param x entier à deux chiffres maximum (appartient à [-99;99])
   * @return l'entier x "renversé": son chiffre des dizaines est celui
   *         des unités de x, et réciproquement. Son signe est conservé
   */
  def renverser(x: Int): Int = unite(x) * 10 + dizaine(x)


  System.out.println(renverser(0))
  System.out.println(renverser(15))
  System.out.println(renverser(74))

}

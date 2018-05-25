package sample.tell

import akka.actor.Actor

class FoodActor extends Actor {

    println("\n\n======================================================================")
    println("                   A K K A  T U T O R I A L : tell                        ")
    println("======================================================================\n\n")



  def receive = {

    case Pizza => printDetails("Pizza")
    case Pasta => printDetails("Pasta")
    case Dimsums => printDetails("Dimsums")
    case _ => println(" \n\n Oops! Item is not in the menu!")

  }

  def printDetails(foodItem: String): Unit= {
    println("\n Food Item:  "+foodItem)
    println("\n ====== Enjoy your meal =====")
  }

}

case object Pizza
case object Pasta
case object Dimsums

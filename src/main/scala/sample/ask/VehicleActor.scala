package sample.ask

import akka.actor.Actor

class VehicleActor extends Actor {

    println("\n\n======================================================================")
    println("                   A K K A  T U T O R I A L : Ask                         ")
    println("=========================================================================\n\n\n")

   def receive = {

     case Audi(hours,price) => sender() ! calculateTariff("Audi",hours,price)
     case Mercedes(hours,price) => sender() ! calculateTariff("Mercedes",hours,price)
     case Lamborghini(hours,price) => sender() ! calculateTariff("Lamborghini",hours,price)
     case _ => sender() ! "No records found !! Please try again later."
}
  
  def calculateTariff(vehicleName: String, hours: Float, price: Double): Double = {

    vehicleName.toLowerCase match {
      case "audi" => price * hours + 1000
      case "mercedes" => price * hours + 2000
      case "lamborghini" => price * hours + 3000
      case _ => throw new IllegalArgumentException
    }
  }

}

case class Audi(hours: Long, price: Double)
case class Mercedes(hours: Long, price: Double)
case class Lamborghini(hours: Long, price: Double)


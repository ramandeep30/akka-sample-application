package sample.ask

import akka.actor.{ActorSystem, Props}
import akka.pattern.ask
import akka.util.Timeout
import scala.concurrent.duration.DurationInt

object Main extends App {

  val system = ActorSystem("VehicleSystem")
  val vehicleActor = system.actorOf(Props[VehicleActor])

  implicit val timeout = Timeout(1000.seconds)
  import scala.concurrent.ExecutionContext.Implicits.global

  val result = vehicleActor ? Audi(18,90.8)
  println("===== Vehicle Details ====== ")
  println(" Vehicle name: Audi \n Amount: Rs.")
  result.foreach(print)
}

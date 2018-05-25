package sample.tell

import akka.actor.{ActorSystem, Props}

object Main extends App{

  val system = ActorSystem("FoodSystem")
  val foodActor = system.actorOf(Props[FoodActor], name = "foodactor")

  foodActor !  Pizza
  foodActor !  Dimsums
  foodActor !  "Chinese"
}

package sample.hello

import akka.actor.{Actor, ActorSystem, Props}

class HelloActor extends Actor {

    println("\n\n======================================================================")
    println("                   A K K A  T U T O R I A L                               ")
    println("======================================================================\n\n")


  def receive = {
    case "hello" => println("Hello back to you!")
    case _ => println("huh?")
  }
}

object Main extends App {
  val system = ActorSystem("HelloSystem")
  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  helloActor ! "hello"
  helloActor ! "knoldus"
}

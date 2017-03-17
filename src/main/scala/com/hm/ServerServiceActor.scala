package com.hm

import akka.actor.Actor
import com.hm.routes.Routes

import scala.concurrent.ExecutionContext


/**
  * Created by pooja on 17/2/17.
  */
class ServerServiceActor  extends Actor with Routes {

  def actorRefFactory = context

  def receive = runRoute(route)

  implicit def dispatcher: ExecutionContext = ServerActorSystem.ec
}

package com.avsystem.commons
package redis

import org.scalatest.{BeforeAndAfterAll, Suite}

import scala.concurrent.duration._
import scala.concurrent.{Await, Promise}

/**
  * Author: ghik
  * Created: 14/04/16.
  */
trait UsesRedisServer extends BeforeAndAfterAll with RedisProcessUtils { this: Suite =>
  def port = 7000
  def address = NodeAddress(port = port)

  var redisProcess: RedisProcess = _

  override protected def beforeAll() = {
    super.beforeAll()

    redisProcess = Await.result(
      launchRedis(
        "--daemonize", "no",
        "--port", port.toString
      ),
      10.seconds
    )
  }

  override protected def afterAll() = {
    Await.result(shutdownRedis(port, redisProcess), 10.seconds)
    super.afterAll()
  }
}

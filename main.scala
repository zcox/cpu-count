package com.banno.cpucount

object Main extends App {
  while (true) {
    println(s"${Runtime.getRuntime.availableProcessors} available processors")
    Thread.sleep(1000)
  }
}

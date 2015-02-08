package com.github.mogproject

import org.openjdk.jmh.annotations.{Benchmark, Scope, State}
 
@State(Scope.Thread)
class ContinuallyBench {
  val xs = List(1, 2, 3, 4)

  @Benchmark
  def streamContinually(): List[Int] = Stream.continually(xs).flatten.take(10).toList
 
  @Benchmark
  def iteratorContinually(): List[Int] = Iterator.continually(xs).flatten.take(10).toList
}


package com.github.mogproject

import org.openjdk.jmh.annotations.Benchmark
 
class ContainsBench {
  @Benchmark
  def setContains(): Unit = (1 to 100000).toSet.contains(100001)
 
  @Benchmark
  def listContains(): Unit = (1 to 100000).toList.contains(100001)
}

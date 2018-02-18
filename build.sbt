name := "ConcurrentKafkaTests"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "net.manub" %% "scalatest-embedded-kafka-streams" % "0.14.0" % "test"
)
name := """Http-Crypto"""

version := "1.0"

scalaVersion := "2.11.4"

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-Ywarn-dead-code",
  "-language:_",
  "-target:jvm-1.7",
  "-encoding", "UTF-8"
)

libraryDependencies += "org.apache.shiro" % "shiro-all" % "1.2.3"

//libraryDependencies +="io.spray" %% "spray-can" % "1.3.2"

//libraryDependencies +="io.spray" %% "spray-routing" % "1.3.2"

//libraryDependencies +="io.spray" %% "spray-client" % "1.3.2"

//libraryDependencies +="io.spray" %% "spray-http" % "1.3.2"

//libraryDependencies +="io.spray" %% "spray-httpx" % "1.3.2"

//libraryDependencies +="io.spray" %% "spray-util" % "1.3.2"

//libraryDependencies +="io.spray" %% "spray-io" % "1.3.2"

libraryDependencies +="io.spray" %% "spray-json" % "1.3.1"

libraryDependencies +="com.typesafe.akka" %% "akka-actor" % "2.3.7"

libraryDependencies +="com.typesafe.akka" %% "akka-slf4j" % "2.3.7"

libraryDependencies += "com.typesafe.akka" %% "akka-http-core-experimental" % "1.0-M1"

libraryDependencies += "com.typesafe.akka" %% "akka-stream-experimental" % "1.0-M1"

libraryDependencies += "com.typesafe.akka" %% "akka-http-experimental" % "1.0-M1"

libraryDependencies += "com.typesafe.akka" %% "akka-http-spray-json-experimental" % "1.0-M1"

unmanagedSourceDirectories in Compile <++= baseDirectory { base =>
  Seq(
    base / "src/main/resources"
  )
}


name := "play-spring-data-jpa"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
    javaJdbc,
    "org.springframework" % "spring-context" % "	4.2.4.RELEASE ",
    "javax.inject" % "javax.inject" % "1",
    "org.springframework.data" % "spring-data-jpa" % "1.9.2.RELEASE",
    "org.springframework" % "spring-expression" % "4.2.4.RELEASE",
    "org.hibernate" % "hibernate-entitymanager" % "5.0.7.Final",
    "org.springframework.guice" % "spring-guice" % "1.0.0.BUILD-SNAPSHOT",
    "org.mockito" % "mockito-core" % "1.10.19" % "test"
)

resolvers += "Spring Snapshots" at "http://maven.springframework.org/snapshot"


// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

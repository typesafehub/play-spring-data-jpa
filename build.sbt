name := "play-spring-data-jpa"

version := "1.0-SNAPSHOT"

playJavaSettings

ebeanEnabled := false

libraryDependencies ++= Seq(
    javaCore,
    javaJpa,
    "org.springframework" % "spring-context" % "4.2.0.RELEASE",
    "javax.inject" % "javax.inject" % "1",
    "org.springframework.data" % "spring-data-jpa" % "1.8.2.RELEASE",
    "org.springframework" % "spring-expression" % "4.2.0.RELEASE",
    "org.hibernate" % "hibernate-entitymanager" % "4.3.11.Final",
    "org.mockito" % "mockito-core" % "1.9.5" % "test"
)
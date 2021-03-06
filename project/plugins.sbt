logLevel := Level.Warn

resolvers += Resolver.url("jetbrains-bintray",
  url("http://dl.bintray.com/jetbrains/sbt-plugins/"))(Resolver.ivyStylePatterns)

addSbtPlugin("org.jetbrains" % "sbt-ide-settings" % "0.1.2")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.16")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.2.16")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "1.1")
addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.3.3")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.1.13")
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-RC2")

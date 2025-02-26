package example
import scala.concurrent.ExecutionContext

import cats.effect.{IO, Resource}
import doobie.hikari.HikariTransactor
import doobie.util.log.LogHandler

object DatabaseConfig {
  lazy val transactor = HikariTransactor
    .newHikariTransactor[IO](
      "org.postgresql.Driver",
      "jdbc:postgresql://127.0.0.1:5433/vinotheque_test",
      "postgres",
      "postgres",
      ExecutionContext.global,
      Some(LogHandler.jdkLogHandler)
    )
}

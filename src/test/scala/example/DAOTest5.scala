package example

import cats.effect.IO
import cats.effect.testing.scalatest.AsyncIOSpec
import doobie._
import doobie.implicits._
import doobie.scalatest.IOChecker
import org.scalatest.flatspec.AsyncFlatSpec

class DAOTest5 extends AsyncFlatSpec with AsyncIOSpec with IOChecker {

  def transactor = DatabaseConfig.transactor.allocated.unsafeRunSync()._1
  val dao        = new DAO

  "DAO" should "generate a valid SQL query 1" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 2" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 3" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 4" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 5" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 6" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 7" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 8" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 9" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 10" in {
    IO(check(dao.query))
  }

}

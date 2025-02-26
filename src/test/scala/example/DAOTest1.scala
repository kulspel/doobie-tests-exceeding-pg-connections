package example

import cats.effect.IO
import cats.effect.testing.scalatest.AsyncIOSpec
import doobie._
import doobie.implicits._
import doobie.scalatest.IOChecker
import org.scalatest.flatspec.AsyncFlatSpec

class DAOTest1 extends AsyncFlatSpec with AsyncIOSpec with IOChecker {

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

  it should "generate a valid SQL query 11" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 12" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 13" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 14" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 15" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 16" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 17" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 18" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 19" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 20" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 21" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 22" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 23" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 24" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 25" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 26" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 27" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 28" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 29" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 30" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 31" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 32" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 33" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 34" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 35" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 36" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 37" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 38" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 39" in {
    IO(check(dao.query))
  }

  it should "generate a valid SQL query 40" in {
    IO(check(dao.query))
  }
}

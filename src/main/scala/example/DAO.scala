package example

import doobie._
import doobie.implicits._

class DAO {
  def query =
    sql"""SELECT id, name FROM test_table"""
      .query[(Int, Option[String])]
}

Example project to showcase doobie tests exceeding postgres max connections with a static transactor with default settings

## Prerequisites
Install sbt, docker, docker-compose

## Steps to reproduce
1. `sbt docker:stage docker:publishLocal`
1. `docker-compose up -d`
1. `sbt test`

### Expected outcome
Tests passing

### Actual outcome
Tests failing because of `org.postgresql.util.PSQLException: FATAL: sorry, too many clients already`

## Notes
I saw connections on the db container exceed 100 connections with fewer tests (around 6 or 7) and the container logging `FATAL:  sorry, too many clients already` without the tests actually failing.
It wasn't until I pushed the number of tests up high enough to keep the connections over 100 for a longer period of time that the tests started failing.

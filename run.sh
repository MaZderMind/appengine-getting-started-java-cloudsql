#!/bin/sh
docker run --publish=5432:5432 --env PAGER="" --env POSTGRES_USER=appengine --env POSTGRES_PASSWORD=appengine --name appengine-postgres --detach smteamrocket/postgres-de:latest
mvn appengine:run
docker rm -f appengine-postgres

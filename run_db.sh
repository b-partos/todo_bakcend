
source script_parameters/parameters.sh

docker run \
 --detach \
 --name=todo_database \
 --env="MYSQL_ROOT_PASSWORD=${MYSQL_ROOT_PASSWORD}" \
 --env="MYSQL_USER=${MYSQL_USER}" \
 --env="MYSQL_PASSWORD=${MYSQL_PASSWORD}" \
 --env="MYSQL_DATABASE=${MYSQL_DATABASE}" \
 --publish ${CONTAINER_PORT}:3306 \
 --volume=${MYSQL_CONFIG_VOLUME}:/etc/mysql/conf.d \
 --volume=${MYSQL_DATA_VOLUME}:/var/lib/mysql \
 mysql
 
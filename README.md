### Topic create
kafka-topics --create \
--bootstrap-server {url} \
--replication-factor 1 \
--partitions 1 \
--topic {topic}

### produce
kafka-console-producer \
--bootstrap-server {url} \
--topic {topic}

### consume
kafka-console-consumer \
--bootstrap-server {url} \
--topic {topic}

### describe
kafka-topics --describe \
--zookeeper {url} \
--topic {topic}

package org.ghy.redis.queue;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class PubSubDemo {
    public static void main(String[] args) {
        String ip = "127.0.0.1";
        int port = 6379;
        JedisPool jedisPool = new JedisPool(new JedisPoolConfig(), ip, port);
        System.out.println(String.format("redis pool is starting, redis ip %s, redis port %d", ip, port));

        SubThread subThread = new SubThread(jedisPool);
        subThread.start();

        Publisher publisher = new Publisher(jedisPool);
        publisher.start();
    }
}

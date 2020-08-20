package org.ghy.redis;

import redis.clients.jedis.Jedis;

public class RedisStringJava {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.set("aaa", "aaa");
    }
}

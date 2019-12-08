package org.jlfang.concurrent.jdk;

import redis.clients.jedis.Jedis;

/**
 * @author Cris
 * @description
 * @date 2019/11/19
 */
public class Demo {
    private static final String SERVER_URL = "129.28.206.204";
    private static final int SERVER_PORT = 6379;
    private static final String PASSWORD = "fjl1990";
    public static void main(String[] args) {
        Jedis jedis = new Jedis(SERVER_URL,SERVER_PORT);
        jedis.auth(PASSWORD);
        System.out.println(jedis.ping());
        jedis.close();

    }
}

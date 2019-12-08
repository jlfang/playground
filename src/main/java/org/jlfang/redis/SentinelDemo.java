package org.jlfang.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisSentinelPool;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * @author Cris
 * @description
 * @date 2019/11/28
 */
public class SentinelDemo {
    private static final String URL1 = "129.28.206.204:28000";
    private static final String URL2 = "129.28.206.204:28001";
    private static final String URL3 = "129.28.206.204:28002";
    private static final String PASSWORD = "******";

    public static void main(String[] args)  {
        Set<String> set=new HashSet<>();
        set.add(URL1);
        set.add(URL2);
        set.add(URL3);
        JedisSentinelPool jedisSentinelPool=new JedisSentinelPool("mymaster",set,PASSWORD);
        while (true) {
            Jedis jedis=null;
            try {
                jedis = jedisSentinelPool.getResource();
                String s = UUID.randomUUID().toString();
                jedis.set("k" + s, "v" + s);
                System.out.println(jedis.get("k" + s));
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                if(jedis!=null){
                    jedis.close();
                }
            }
        }
    }

}


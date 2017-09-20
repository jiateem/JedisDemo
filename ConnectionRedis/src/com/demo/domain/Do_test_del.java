package com.demo.domain;

import redis.clients.jedis.Jedis;

public class Do_test_del {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jedis jedis = new Jedis("127.0.0.1",6379);
		jedis.del("entitytest".getBytes());//del
        System.out.println("已删除");
	}

}

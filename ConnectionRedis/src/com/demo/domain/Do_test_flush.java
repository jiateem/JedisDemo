package com.demo.domain;

import redis.clients.jedis.Jedis;

public class Do_test_flush {
	public static void main(String[] args){
	Jedis jedis = new Jedis("127.0.0.1",6379);
//	jedis.flushAll();
	jedis.flushDB();//flush
	System.out.println("已清空");
	}
}

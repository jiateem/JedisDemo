package com.demo.domain;

import com.demo.SerializeUtil.SerializeUtil;
import com.demo.entity.Test;

import redis.clients.jedis.Jedis;

public class Do_test_get {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jedis jedis = new Jedis("127.0.0.1",6379);
		byte[] test = jedis.get(("entitytest").getBytes());//get
		 
		Test entitytest= (Test) SerializeUtil.unserialize(test);
		System.out.println(entitytest.getId());
		 
		System.out.println(entitytest.getName());


	}

}

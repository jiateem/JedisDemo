package com.demo.domain;

import com.demo.SerializeUtil.SerializeUtil;
import com.demo.entity.Test;

import redis.clients.jedis.Jedis;

public class Do_test {
	public static void main(String[] args){
	
	Jedis jedis = new Jedis("127.0.0.1",6379);//连接redis服务器
	Test entitytest=new Test();
	entitytest.setId("1111");
	entitytest.setName("aaaa");
	
	jedis.set("entitytest".getBytes(), SerializeUtil.serialize(entitytest));//set
	System.out.println("已存放");
	
	}


}

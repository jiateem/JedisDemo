import redis.clients.jedis.Jedis;


public class Demo_set {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Jedis jedis = new Jedis("127.0.0.1",6379);  //连接redis服务 
		/*sadd(String key, String... members) 
          Add the specified member to the set value stored at key
        */
		jedis.sadd("sname", "wobby");  
        jedis.sadd("sname", "kings");  
        jedis.sadd("sname", "demon");
        System.out.println(String.format("set num: %d", jedis.scard("sname")));  //总数
        System.out.println(String.format("all members: %s", jedis.smembers("sname")));  //所有的值
        System.out.println(String.format("is member: %B", jedis.sismember("sname", "wobby")));  //判断是否存在
        System.out.println(String.format("rand member: %s", jedis.srandmember("sname"))); //随机获取数据 
        
        jedis.srem("sname", "demon");  //删除一个对象  
        System.out.println(String.format("all members: %s", jedis.smembers("sname")));

	}

}

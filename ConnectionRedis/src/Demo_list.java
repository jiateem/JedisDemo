
import redis.clients.jedis.Jedis;


public class Demo_list {

	/**
	 * @param args
	 * lpush(String key, String... strings) 
       Add the string value to the head (LPUSH) or tail (RPUSH) of the list stored at key.
	 */
	public static void main(String[] args) {
		
        Jedis jedis = new Jedis("127.0.0.1",6379);  //连接redis服务  
        
        jedis.rpush("listDemo", "A");  
        jedis.rpush("listDemo", "B");  
        jedis.rpush("listDemo", "C");  
        
        /*lrange(String key, long start, long end) 
          Return the specified elements of the list stored at the specified key.
        */
        System.out.println(jedis.lrange("listDemo", 0, -1));  
        System.out.println(jedis.lrange("listDemo", 0, 2)); 
        System.out.println(jedis.lrange("listDemo", 0, -3));  
        jedis.del("listDemo");  
	}

}

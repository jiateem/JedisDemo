
import redis.clients.jedis.Jedis; 

/**
 * �򵥸�ֵ
 */
public class Demo_string {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        Jedis jedis = new Jedis("127.0.0.1",6379);  //����redis���� 
          
        //������֤-�����û������redis����ɲ���֤����ʹ���������  
        //jedis.auth("abcdefg");  
        
        //�򵥵�key-value �洢  
        jedis.set("redis", "myredis");  
        System.out.println(jedis.get("redis"));
	}
}

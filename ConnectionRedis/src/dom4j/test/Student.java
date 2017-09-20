package dom4j.test;


/**
 * @author SUN
 *
 */
public class Student {

	
	
	
	public Student() {
		super();
	}
	
	public Student(String name,String age,String sex,String pet) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.pet = pet;
	}

	private String name;
	private String age;
	private String sex;
	private String pet;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPet() {
		return pet;
	}
	public void setPet(String pet) {
		this.pet = pet;
	}
	
	@Override
	public String toString() {
		return "Name=" + this.name + "; Age=" + age + "; Sex=" + sex + "; Pet=" + pet + ";";
	}
	
	
	
}

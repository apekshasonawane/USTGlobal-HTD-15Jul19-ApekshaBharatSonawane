package div.com.encapsulation;

public class Cat implements Comparable<Cat>{
//	Cat c=new Cat();
	final static String myname="Aps";			//final variable value cannot be changed
	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

	private String name;
	private String color;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
//		System.out.println(myname);
		//myname="aklaasdj";
	}
	
	final static void print() {
		System.out.println("final method");
	}
	@Override
	public int compareTo(Cat o) {
	return (this.age-o.age);			//gives output in sorted manner of age
	}

	

}

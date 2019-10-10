package div.com.encapsulation;

public class CatData{

	public static void main(String[] args) {
		Cat c1=new Cat();
		Cat c2=new Cat();
		Cat c3=new Cat();
		
		Cat[] cat= {c1,c2,c3};
		
		c1.setName("Rani");
		c1.setAge(2);
		c1.setColor("black");
		
		c2.setName("sweetie");
		c2.setAge(1);
		c2.setColor("white");
		
		c3.setName("sonu");
		c3.setAge(2);
		c3.setColor("black and white");
		
		for(int i=0;i<cat.length;i++) {
			System.out.println("Name=  "+cat[i].getName());
			System.out.println("Age=  "+cat[i].getAge());
			System.out.println("Color=  "+cat[i].getColor());
			System.out.println("****************************************");
		}
		
	}
}

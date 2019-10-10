import com.dev.abstractclass.functionalInterface;

@functionalInterface
public interface FunctionalInt {
	abstract public void print();
	
	public default void display() {
		System.out.println("Display");
	}
	public static void dis() {
		System.out.println("This is dis");
	}
	
}

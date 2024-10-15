package Step_definitions;
import io.cucumber.java.After;

public class hooks {
/*
	public static void Before_all() {
		
	}

public  static void after_all() {

}
*/
public void setUp() {
	System.out.println("Before hook-launching browser");
}
@After
public void teardown() {
	System.out.println("@After hook-quit browser");
}
}

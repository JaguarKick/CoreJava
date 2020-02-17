import static com.abc.Class1.*;
import static com.abc.Class2.*;

import com.abc.Class1;
import com.abc.Class2;

public class StaticImportsDemo {
	public static void main(String args[]) {
		System.out.println(class1_info);
		System.out.println(class1_info2);
		class1_displayInfo();
		new Class1().aboutThisClass();
		
		System.out.println(class2_info);
		System.out.println(class2_info2);
		class2_displayInfo();
		new Class2().aboutThisClass();
	}
}

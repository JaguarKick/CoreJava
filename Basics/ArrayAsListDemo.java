import java.util.*;

public class ArrayAsListDemo {
	public static void main(String args[]) {
		String[] mugiwara = {"Luffy","Zoro","Nami","Usoup","Sanji","Franky","Chopper","Vivi","Robin","Brookes"};
		List<String> myList = Arrays.asList(mugiwara);
		System.out.println(myList);
		System.out.println("===================================================");
		for(int i=0;i<myList.size();i++) {
			System.out.println(myList.get(i));
		}
	}
}

public class StringBuilderDemo2{
	public static void main(String arg[]){
		StringBuilder sb = new StringBuilder();
		sb.append("Hello World");
		sb.insert(1,"New String");
		System.out.println(sb);
		System.out.println(sb.reverse());
	}
}

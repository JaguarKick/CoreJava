public class StringBufferDemo2{
	public static void main(String args[]){
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Hello World, I've been waiting for the chance to see your face.");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}

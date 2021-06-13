public class ShortDemo{
	public static void main(String[] args){
		short a =10;
		short b = 12;
		Short c = 51;
		String d = "12";

		System.out.println(c.byteValue());
		
		System.out.println(Short.compare(a, b));
		
		System.out.println(Short.decode(d));
		
		System.out.println(c.doubleValue());
		
		System.out.println(Short.valueOf(a));
		
		System.out.println(c.shortValue());
		
		System.out.println(Short.hashCode(a));
	}
}

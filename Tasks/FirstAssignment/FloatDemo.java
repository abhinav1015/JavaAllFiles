public class FloatDemo{
	public static void main(String[] args){
		float a = 1;
		float b = 2;
		Float c =(float)  5.1;

		System.out.println(c.byteValue());
		
		System.out.println(Float.compare(a, b));
		
		System.out.println(c.doubleValue());
		
		System.out.println(c.floatValue());
		
		System.out.println(c.isInfinite());
		
		System.out.println(Float.isInfinite(a));
		
		System.out.println(Float.sum(a, b));
	}
}

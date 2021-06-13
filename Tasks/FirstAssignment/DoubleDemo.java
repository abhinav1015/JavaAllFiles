public class DoubleDemo{
	public static void main(String[] args){
		double a = 123;
		double b = 5165;
		Double c = (double) 152;

		System.out.println(c.byteValue());
		
		System.out.println(Double.compare(a, b));
		
		System.out.println(c.doubleValue());
		
		System.out.println(c.floatValue());
		
		System.out.println(Double.hashCode(b));
		
		System.out.println(Double.isInfinite(a));
		
		System.out.println(Double.max(a,b));
	}
}

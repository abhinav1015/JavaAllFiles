public class LongDemo{
	public static void main(String[] args){
		long a = 123;
		long b = 1234;
		Long c =(long) 78098;

		System.out.println(Long.bitCount(a));
		
		System.out.println(c.byteValue());
		
		System.out.println(Long.compare(a, b));
		
		System.out.println(c.doubleValue());
		
		System.out.println(Long.hashCode(b));
		
		System.out.println(Long.sum(a, b));
		
		System.out.println(Long.valueOf(a));
	}
}

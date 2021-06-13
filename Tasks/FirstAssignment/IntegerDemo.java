public class IntegerDemo{
	public static void main(String[] args){
		int a = 10;
		int b = 30;
		Integer d = 20;
		byte c = 100;
		String e ="123";
		System.out.println(Integer.bitCount(a));

		System.out.println(d.byteValue());

		System.out.println(Integer.decode(e));

		System.out.println(Integer.divideUnsigned(b,a));

		System.out.println(d.hashCode());

		System.out.println(d.intValue());

		System.out.println(Integer.max(a, b));
	}
}


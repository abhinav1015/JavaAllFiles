public class ByteDemo{
	public static void main(String[] args){
		Byte a = 10;
		Byte b = 20;
		byte e = 124;
		byte f = 2;
		int c = 30;
		String g = "f";
		// Returns Byte
		System.out.println(a.byteValue());
		
		System.out.println(Byte.hashCode(e));
		
		System.out.println(Byte.compareUnsigned(e, f));

		System.out.println(b.floatValue());

		System.out.println(a.longValue());
		
		System.out.println(Byte.toString(e));

		System.out.println(Byte.valueOf(e));
	}
}


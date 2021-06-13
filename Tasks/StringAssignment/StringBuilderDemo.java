public class StringBuilderDemo{
	public static void main(String[] args){
		StringBuilder s1 = new StringBuilder("abhinav ");
		StringBuilder s2 = new StringBuilder("maharjan ");
		char c1 = 'a';
		StringBuilder c1Obj = new StringBuilder(c1);
		char[] ca1 = {'a', 'b', 'c', 'd'};

		System.out.println(s1.append(false));
		System.out.println(s2.append('a'));
		System.out.println(s2.append(ca1));;
		System.out.println(s1.append(112.234));
		System.out.println(s2.append(900.1));
		System.out.println(s1.append(12));
		System.out.println(s2.append(234151));
		System.out.println(s1.append(" Str"));
		System.out.println(s2.capacity());
		System.out.println(s1.charAt(4));


	}
}

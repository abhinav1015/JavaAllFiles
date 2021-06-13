public class StringDemo{
	public static void main(String[] args){
		String first = "Abhinav";
		String second = "Maharjan";
		char[] third = {'a', 'b', 'c', 'd'};
		System.out.println(first.charAt(3));
		System.out.println(first.codePointAt(1));
		System.out.println(first.codePointBefore(5));
		System.out.println(first.concat(second));
		System.out.println(String.copyValueOf(third));
		System.out.println(first.equalsIgnoreCase(second));
		System.out.println(first.endsWith(second));
		System.out.println(first.indexOf(second));
		System.out.println(first.indexOf(first, 3));
		System.out.println(first.lastIndexOf(2));
	}
}

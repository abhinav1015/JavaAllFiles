public class CharacterDemo{
	public static void main(String[] args){
		char a = 'y';
		char b = 'z';
		Character d = 'x';
		int c = 234;
		String name = "Abhinav";

		System.out.println(Character.charCount(c));

		System.out.println(d.charValue());

		System.out.println(Character.compare(a, b));

		System.out.println(Character.getDirectionality(d));

		System.out.println(Character.getDirectionality(c));

		System.out.println(Character.getNumericValue(a));

		System.out.println(Character.getType(b));
	}
}

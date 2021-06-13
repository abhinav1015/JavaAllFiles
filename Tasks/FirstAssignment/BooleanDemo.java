public class BooleanDemo{
	public static void main(String[] args){
		boolean a = true;
		boolean b = false;
		Boolean c = true;

		System.out.println(c.booleanValue());
		
		System.out.println(Boolean.compare(a, b));
		
		System.out.println(c.hashCode());
		
		System.out.println(Boolean.toString(a));
		
		System.out.println(Boolean.valueOf(a));
		
		System.out.println(Boolean.hashCode(b));
		
		System.out.println(Boolean.logicalAnd(a, b));
	}
}

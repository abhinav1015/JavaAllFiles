public class StringBufferDemo{
	public static void main(String[] args){
		String first = "Hello ";
		String second = "World ";
		StringBuffer sbObjF = new StringBuffer(first);
		StringBuffer sbObjS = new StringBuffer(second);
		boolean b = true;
		char[] ca1 = {'a', 'b', 'c', 'd'};
		System.out.println(sbObjF.append(b));
		System.out.println(sbObjS.append('a'));
		System.out.println(sbObjF.append(ca1));
		System.out.println(sbObjF.insert(5, 'f'));
		System.out.println(sbObjS.reverse());
		System.out.println(sbObjS.append(12));
		System.out.println(sbObjF.append(2415));
		System.out.println(sbObjS.capacity());
		System.out.println(sbObjF.charAt(3));
		System.out.println(sbObjS.delete(2, 5));
	}
}


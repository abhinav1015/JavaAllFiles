public class GenericsDemo{
	<F>void showArray(F[] s){
		for( int i=0; i < s.length; i++){
			System.out.println(s[i]);
		}
	}

	public static void main(String[] args){
		GenericsDemo genericObj = new GenericsDemo();
		String[] names = {"Abhinav", "Maharjan", "sadklf"};
		Float[] number = {1.2f, 2f, 5.2f, 2.5f};
		Double[] nums = {23d, 234d, 51d, 2312d};
		Integer[] num = {2,51,12,12};
		genericObj.showArray(names);
		genericObj.showArray(number);
		genericObj.showArray(nums);
		genericObj.showArray(num);
	}
}

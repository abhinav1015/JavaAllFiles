public class beer{
	public static void main(String[] args){
		int BeerNum = 99;
		String word  = "bottles";

		while (BeerNum > 0){
			if ( BeerNum == 1){
				word = "bottle";
			}

			System.out.println(BeerNum + " " + word + " " + "on the stock");
			System.out.println(BeerNum + " " + word + " " + "of beer");

			System.out.println("Take one out");
			System.out.println("Pass it");

			BeerNum = BeerNum - 1;

			if ( BeerNum == 0){
				System.out.println("There is no more beer");
			}

		}
	}
}


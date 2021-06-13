class Movie{
	String title;
	String genre;
	int rating;

	void playIt(){
		System.out.println("Playing the movie");
	}
}

public class MovieTestDrive{
	public static void main(String[] args){
		Movie one = new Movie();
		one.title = "Cha Maya Chpaka";
		one.genre = "Emotional";
		one.rating = 5;

		Movie two = new Movie();
		two.title = "Don";
		two.genre = "Thrill";
		two.rating = 9;
		two.playIt();		

		Movie three = new Movie();
		three.title = "Conjuring 2";
		three.genre = "Horror";
		three.rating = 10;
	}
}

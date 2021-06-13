class KbcGameLogic{
	public void Logic(){
		Scanner in = new Scanner();

		System.out.println("Are you ready for this game(y/n)");
		String choice = in.nextStr();

		if ( choice == "y"){
			System.out.println("Question 1");
			System.out.println("What is the capital of Nepal \n a.Kathmandu \t b.Delhi \n c.Islambad \t d.Tokyo");
			String answer1 = in.nextStr();
			

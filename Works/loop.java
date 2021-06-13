public class loop{
	public static void main(String[] args){
		for(int i = 1; i < 101; i++){
			System.out.println("\r");
			System.out.println(i+"%");
			System.out.println("85%\f95%\f100%");
			try{
				Thread.sleep(2000);
			}catch(Exception e){

			}
		}
	}

}

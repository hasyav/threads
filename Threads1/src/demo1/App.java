package demo1;

public class App {

	class Runner extends Thread{
		public void run() {
			for(i=0;i<10;i++) {
				System.out.print("Hello"+i);
				
			}
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package LinearStructures;

public class TestFibonacci {
	
	public static void main(String[] args) {
		//斐波那契数列：1 1 2 3 5 8 13
		int i = Fibonacci (7);
		System.out.println(i);
	}
	
	//打印第n项斐波那契数列
	public static int Fibonacci(int i) {
		if(i==1 || i==2) {
			return 1;
		}else {
			return Fibonacci(i-1)+Fibonacci(i-2);
		}
	}
}

package tij.generics;

public class Fibnocci implements Generator<Integer>{
	
	private int count =0;
	
	
	@Override
	public Integer next() {
		return fib(count++);
	}
	
	private int fib(int n){
		if(n<2) return 1;
		else return fib(n-2)+fib(n-1);
	}
	
	public static void main(String[] args) {
		Fibnocci f = new Fibnocci();
		for (int i = 0; i < 18; i++) {
			System.out.println(f.next());
		}
	}
	
}

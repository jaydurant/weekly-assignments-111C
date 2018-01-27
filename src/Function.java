import java.util.*;
public class Function {
	public static long Fact(long n){
		long i,f =1;
				for(i=1;i<=n;i++) {
					f*=i;
				}
				return f;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long num;
		System.out.println("Enter a number");
		num = input.nextInt();
		System.out.println(num + "!=" + Fact(num));
	}

}

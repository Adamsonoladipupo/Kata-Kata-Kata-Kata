import java.util.*;

public class Multiplication{
	public static void main(String[] args){
		System.out.println("a		b		a**b");
		for (int count = 1; count <= 5; count++){
			System.out.printf("%d		%d		%d\n",count,(count+1), Math.round(Math.pow(count, count+1)));
		}
	}
}
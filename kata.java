public class kata{
	public static void main(String[] args){
		double tempVar = 0;
		double numberOfYears = 0;
		int price = 100000;
		int priceAndNumberOfItems = NumberOfItems * 50000;
		while (price > 1){
			tempVar = price * 0.08;
			price -= tempVar;
			numberOfYears ++;
			tempVar = 0;
		}
		System.out.print(numberOfYears);
	}
}

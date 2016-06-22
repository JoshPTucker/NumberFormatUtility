import java.text.NumberFormat;

public class NumberFormatUtility {

		

		public static String toPercentage(double in){
			
			double majority =in;
			
			NumberFormat percent = NumberFormat.getPercentInstance();
			
			String percentString = percent.format(majority); //returns 50%
			
			return percentString;
		}
		public static String toDecimal(double in, int places){
			double numb1 = in;
			int deci=places;
			NumberFormat number = NumberFormat.getNumberInstance();

			number.setMaximumFractionDigits(2);

			String numb1String = number.format(numb1);
			return numb1String;
		}
		public static String toCurrency(double in){
			
			double price = in;

			NumberFormat currency = NumberFormat.getCurrencyInstance();
			
			String priceString = currency.format(price); //returns $11.58
			
			return priceString;
		}
		public static  randNum(){
			
		}
		public static int maxNum(int numb1, int numb2){
		int n1=numb1;
		int n2=numb2;
		if(n1>n2){
			return n1;
		}
		else return 0;
				
		}
		public static int minNum(int numb1, int numb2){
			int n1=numb1;
			int n2=numb2;
			if(n2>n1){
				return n1;
			}
			else return 0;
			
			
		}
}

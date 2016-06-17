
public class PricesDb {
private static String sku=" ";
	
	public  String getSKU(){
		return sku;
	}
	public static void setSKU(String s){
		sku = s;
	}
	
	public static InvoiceCalc getProduct(String s){
		
			String sku=s;
			InvoiceCalc b = new InvoiceCalc();
			
			b.setTitle(sku);
				if (sku.equals("Java1001")){
					b.setAuthor("Kathy Sierra and Bert Bates");
					b.setDescription("Easy to read Java workbook");
					b.setPrice(47.50);
					b.setTitle("Head First Java");
					
				}
				else if (sku.equals("Java1002")){
					b.setAuthor("Bruce Eckel");
					b.setDescription("Details about Java under the hood");
					b.setPrice(20.00);
					b.setTitle("Thinking in Java");
					
				}
				else if (sku.equals("Orcl1003")){
					b.setAuthor("Jeanne Boyarsky");
					b.setDescription("Everything you need to know in one place");
					b.setPrice(45.00);
					b.setTitle("OCP: Oracle Certified Professional Java SE");
					
				}
				else if (sku.equals("Python1004")){
					b.setAuthor("Al Sweigart");
					b.setDescription("Fun with Python");
					b.setPrice(10.50);
					b.setTitle("Automate the Boring Stuff with Python");
					
				}
				else if (sku.equals("Zombie1005")){
					b.setAuthor("Simon Monk");
					b.setDescription(" 	Defend Your Base with Simple Circuits, "
							+ "Arduino, and Raspberry Pi");
					b.setPrice(16.50);
					b.setTitle("The Maker's Guide to the Zombie Apocalypse");
					
				}
				else if (sku.equals("Rasp1006")){
					b.setAuthor("Donald Norris");
					b.setDescription("A dozen fiendishly fun projects "
							+ "for the Raspberry Pi!");
					b.setPrice(14.75);
					b.setTitle("Raspberry Pi Projects for the Evil Genius");
					
				}				
				return b;
	}
}



public class InvoiceCalc {
	
	private String title;
	private String author;
	private String description;
	private double price;
	//gets the author from user
		public String getAuthor(){
		
			return author;
		
		}
		//sets author
		public  void setAuthor(String author){
			this.author=author;
		}
		
		//gets title of book from user input
		public String getTitle(){
			
			return title;
			
		}
		
		public void setTitle(String title){
			this.title=title;
		}
		//gets description of book from user input
		public String getDescription(){
			return description;
			
		}
		
		public void setDescription(String description ){
			this.description=description;
		}
		//gets price from user input
		public double getPrice(){
			return price;
			
		}
		
		public void setPrice(double price){
			this.price=price;
	
 }
}

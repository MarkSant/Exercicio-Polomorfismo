public class Product
{
	
	private String name;
	private Double price;
	
	public Product(){
		
	}
	
	public Product(String cName, Double cPrice) {
		this.name= cName;
		this.price = cPrice;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String cName){
		this.name = cName;
	}
	
	public Double getPrice() {
		return price;
		
	}
	
	public void setPrice(Double cPrice){
		this.price = cPrice;
	}
	
	public String priceTag(){
		return name + " $ " + String.format("%.2f", price);
	}
	
}



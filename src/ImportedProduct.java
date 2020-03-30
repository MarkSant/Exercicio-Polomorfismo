public class ImportedProduct extends Product
{
	private Double customsFee;
	
	public ImportedProduct(){
		super();
	}
	
	public ImportedProduct(String name, Double price, Double cCustomsFees) {
		super(name, price);
		this.customsFee = cCustomsFees;
	}
	
	public Double getCustomsFees() {
		return customsFee;
		
	}
	
	public void setCustomsFees(Double cCustomsFees) {
		this.customsFee = cCustomsFees;
	}
	
	public Double totalPrice() {
		return getPrice() + getCustomsFees();
	}
	
	@Override
	public String priceTag(){
		return getName() 
			+ " $ " 
			+ String.format("%.2f", totalPrice()) 
			+ "(Customs fees: $ " 
			+ String.format("%.2f", getCustomsFees())
			+ ")";
	}
	
}


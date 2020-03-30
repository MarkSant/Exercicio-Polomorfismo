import java.util.*;
import java.text.*;

public class UsedProduct extends Product
{
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;
	

	
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, Date cManufactureDate) {
		super(name, price);
		this.manufactureDate = cManufactureDate;
	}
	
	public Date getManufactureDate() {
		return manufactureDate;
	}
	
	public void setManufactureDate(Date cManufatureDate){
		this.manufactureDate = cManufatureDate;
	}

	@Override
	public String priceTag()
	{
		
		return getName()
		+ " (used) $ "
		+ String.format("%.2f", getPrice())
		+ " (Manufacture date: "
		+ sdf.format(manufactureDate)
		+ ")";
	}
	

	
	}
	
	

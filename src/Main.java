import java.util.*;
import java.text.*;
import java.util.List;

public class Main
{
	public static void main(String[] args) throws ParseException
	{
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int numberProducts = sc.nextInt();
		
		List <Product>  productList= new ArrayList <>(); 
		
		for (int i =1; i <= numberProducts; i++){
			System.out.println("Product #" + i + " data:");
			System.out.print("Commom,used or imported (c/u/i)? ");
			char typeProduct = sc.next().charAt(0);
			
				switch (typeProduct) {
					case 'c':
						System.out.print("Name: ");
						sc.next();
						String name = sc.nextLine();
						System.out.print("Price: ");
						Double price = sc.nextDouble();
						
						Product produc = new Product(name, price);
						productList.add(produc);
						break;
					
					case 'u':
						System.out.print("Name: ");
						sc.next();
						String uname = sc.nextLine();
						System.out.print("Price: ");
						Double uprice = sc.nextDouble();
						
						System.out.print("Manufature date (dd/MM/yyyy): ");
						Date mDate = sdf.parse(sc.next());
						
						UsedProduct usedP = new UsedProduct(uname, uprice, mDate);
						productList.add(usedP);
						
						break;
						
					case 'i':
						
						System.out.print("Name: ");
						sc.next();
						String iName = sc.nextLine();
						System.out.print("Price: ");
						Double iPrice = sc.nextDouble();
						
						System.out.print("Customs fees: ");
						Double customsFees = sc.nextDouble();
						
						ImportedProduct iProduct = new ImportedProduct(iName, iPrice, customsFees);
						productList.add(iProduct);
						break;
						
					default:
						System.out.println("Opçao invalida. Proximo produto!");
						sc.next();
						break;
				}
				
				}
				
				
			System.out.println("Price Tags");
			for (Product a : productList) {
				System.out.println(a.priceTag());
			}
			
			sc.close();
				
				
					
					
							
		}
		
	
}

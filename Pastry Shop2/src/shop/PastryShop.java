package shop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class PastryShop{
	private String name;
	public String city;
	public Product[] products;
	
	
	public int numOfCakes;
	public int numOfBuns;
	public int numOfBiscuits;
	
	public PastryShop(String name, String city) {
		this.name = name;
		this.city = city;
		
		this.products = new Product[0];
		
		this.numOfCakes = 0;
		this.numOfBiscuits = 0;
		this.numOfBuns=0;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addCake(double price, double weight, Date manufacturingDate,boolean isChocolate) {
		Cake newCake = new Cake(price, weight, manufacturingDate,isChocolate);
		Product[] temp = new Product[products.length+1];
		
		for(int i=0; i<products.length; i++){
			temp[i] = products[i];
		}
		
	
		temp[products.length] = newCake;
		products = new Product[temp.length];
		
		for(int i=0; i<temp.length; i++){
			products[i]=temp[i];
		}
		numOfCakes++;
	}
	public void addBiscuit(double price, double weight, Date manufacturingDate,boolean isWaffle) {
		Biscuit newBiscuit = new Biscuit(price, weight, manufacturingDate,isWaffle);
		Product[] temp = new Product[products.length+1];
		
		for(int i=0; i<products.length; i++){
			temp[i] = products[i];
		}
		
		temp[products.length] = newBiscuit;
		products = new Product[temp.length];
		
		for(int i=0; i<temp.length; i++){
			products[i]=temp[i];
		}
		numOfBiscuits++;
	}
	public void addBun(double price, double weight, Date manufacturingDate,boolean isBreadRoll) {
		Bun newBun = new Bun(price, weight, manufacturingDate,isBreadRoll);
		Product[] temp = new Product[products.length+1];
		
		for(int i=0; i<products.length; i++){
			temp[i] = products[i];
		}
		
		temp[products.length] = newBun;
		products = new Product[temp.length];
		
		for(int i=0; i<temp.length; i++){
			products[i]=temp[i];
		}
		numOfBuns++;
	}
	
    public Product[] getCakes() {
    	
    	Product[] temp=new Product[numOfCakes];
    	int k=0;
    	for(int i=0;i<products.length;i++) {
    		if(products[i].getType().compareTo("Cake")==0) {
    			temp[k]=products[i];
    			k++;
    		}
    	}
    	return temp;
    }
    public Product[] getBiscuits() {
    	Product[] temp=new Product[numOfBiscuits];
    	int k=0;
    	for(int i=0;i<products.length;i++) {
    		if(products[i].getType().compareTo("Biscuit")==0) {
    			temp[k]=products[i];
    			k++;
    		}
    	}
    	return temp;
    }
    public Product[] getBuns() {
    
    	Product[] temp=new Product[numOfBuns];
    	int k=0;
    	for(int i=0;i<products.length;i++) {
    		if(products[i].getType().compareTo("Bun")==0) {
    			temp[k]=products[i];
    			k++;
    		}
    	}
    	return temp;
    }
	public void readProductsFromFile(String fileName) throws ParseException{
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			DateFormat format=new SimpleDateFormat("dd.MM.yyyy");
		
			String currenLine;
			
			while((currenLine = br.readLine()) != null) {
				String[] parts = currenLine.split(" ");
				
				String type=parts[0];
				double price=Double.parseDouble(parts[1]);
				double weight=Double.parseDouble(parts[2]);
				Date manufacturingDate=format.parse(parts[3].trim());
				
				if(type.compareTo("Cake")==0) {
					boolean isChocolate=Boolean.parseBoolean(parts[4]);
					addCake(price,weight,manufacturingDate,isChocolate);
				}
				else if(type.compareTo("Bun")==0) {
					boolean isBreadRoll=Boolean.parseBoolean(parts[4]);
					addBun(price,weight,manufacturingDate,isBreadRoll);
				}
				else if(type.compareTo("Biscuit")==0) {
					boolean isWaffle=Boolean.parseBoolean(parts[4]);
					addBun(price,weight,manufacturingDate,isWaffle);
			    }
			}
			br.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File " + fileName + " was not found or could not be opened");
		} catch (IOException e) {
			System.out.println("Error reading from file " + fileName);
		}
	}
	
	public void findLatestBun(){
		Product[] temp = getBuns();
		Product latest = temp[0];
		
		for(int i = 0;i< temp.length; ++i) {
			if(temp[i].isNewerThan(latest)) {
				latest = temp[i];
			}
		}
		System.out.println(latest);
		
	}
	
	public void findSpecificProduct(Product p){
		boolean flag = false;
		
		if(p.getType().compareTo("Cake")==0){
			for(int i=0; i<numOfCakes; i++){
				if(p.equals(getCakes()[i])){
					flag = true;
					break;
				}
			}
		}
		else if(p.getType().compareTo("Bun")==0){
			for(int i=0; i<numOfBuns; i++){
				if(p.equals(getBuns()[i])){
					flag = true;
					break;
				}
			}
		}
		else if(p.getType().compareTo("Biscuit")==0){
			for(int i=0; i<numOfBiscuits; i++){
				if(p.equals(getBiscuits()[i])){
					flag = true;
					break;
				}
			}
		}
		
		if(flag == true)
			System.out.println(p.toString());
		else
			System.out.println("The product does not exist in the list");
	}
}
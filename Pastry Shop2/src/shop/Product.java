package shop;

import java.util.Date;

abstract class Product{
	public double price;
	public double weight;
	public Date manufacturingDate;
	
	public Product(double price, double weight,Date manufacturingDate) {
		super();
		this.price = price;
		this.weight=weight;
		this.manufacturingDate=manufacturingDate;
	}
    public boolean isNewerThan(Product p){
    	if(this.manufacturingDate.after(p.manufacturingDate)) {
    		return true;
    	}
    	return false;
    }
	public abstract String getType();
}
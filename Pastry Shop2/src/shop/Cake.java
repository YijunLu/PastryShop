package shop;

import java.util.Date;

public class Cake extends Product{
	public boolean isChocolate;
	private int sizeOfCake;	
	public Cake(double price, double weight, Date manufacturingDate,boolean isChocolate) {
		super(price, weight,manufacturingDate);
		this.isChocolate = isChocolate;
	}

	@Override
	public String getType() {
		return "Cake";
	}
	@Override
	public String toString() {
		return "Cake [isChocolate="+isChocolate+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
	
	public int getSize() {
		return sizeOfCake;
	}
	
	public void setSize(int value) {
		this.sizeOfCake = value;
	}
	
}
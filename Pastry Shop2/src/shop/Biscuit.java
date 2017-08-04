package shop;

import java.util.Date;

public class Biscuit extends Product{
	public boolean isWaffle;
	
	public Biscuit(double price, double weight, Date manufacturingDate,boolean isWaffle) {
		super(price, weight,manufacturingDate);
		this.isWaffle = isWaffle;
	} 
	
	@Override
	public String getType(){
		return "Biscuits";
	}
	@Override
	public String toString() {
		return "Biscuit [isWaffle="+isWaffle+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}
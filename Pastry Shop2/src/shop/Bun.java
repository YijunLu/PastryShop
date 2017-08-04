package shop;

import java.util.Date;

public class Bun extends Product{
	public boolean isBreadRoll;
	
	public Bun(double price, double weight, Date manufacturingDate,boolean isBreadRoll) {
		super(price, weight,manufacturingDate);
		this.isBreadRoll=isBreadRoll;
	}
	@Override
	public String getType(){
		return "Bun";
	}
	
	@Override
	public String toString() {
		return "Bun[isBreadRoll="+isBreadRoll+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

package shop;
import java.util.Date;
public class Dount extends Bun{
	private boolean topping;
	public Dount(double price, double weight, Date manufacturingDate, boolean isBreadRoll) {
		super(price, weight, manufacturingDate, isBreadRoll);
	}
	public Dount(double price, double weight, Date manufacturingDate,boolean isBreadRoll,boolean topping) {
		super(price, weight,manufacturingDate,isBreadRoll);
		this.topping=topping;
	}
	@Override
	public String getType() {
		return "Dount";
	}
	public boolean isTopping() {
		return topping;
	}
	public void setTopping(boolean topping) {
		this.topping = topping;
	}
	@Override
	public String toString() {
		return "Dount [topping="+topping+",isBreadRoll="+isBreadRoll+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}
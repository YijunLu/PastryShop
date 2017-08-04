package shop;
import java.util.Date;
public class Gelatinfruitdessert extends Cake{
	private boolean topping;
	private boolean creamtype;
	public Gelatinfruitdessert(double price, double weight, Date manufacturingDate, boolean isChocolate) {
		super(price, weight, manufacturingDate, isChocolate);
	}
	public Gelatinfruitdessert(double price, double weight, Date manufacturingDate,boolean isChocolate,boolean topping,boolean creamtype) {
		super(price, weight,manufacturingDate,isChocolate);
		this.topping=topping;
		this.creamtype=creamtype;
	}
	@Override
	public String getType() {
		return "Gelatinfruitdessert";
	}
	public boolean isTopping() {
		return topping;
	}
	public boolean isCreamtype() {
		return creamtype;
	}
	public void setTopping(boolean topping) {
		this.topping = topping;
	}
	public void setCreamtype(boolean creamtype) {
		this.creamtype = creamtype;
	}
	@Override
	public String toString() {
		return "Gelatinfruitdessert [topping="+topping+",creamtype="+creamtype+",isChocolate="+isChocolate+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

package shop;
import java.util.Date;
public class Cheesecake extends Cake{
	private boolean topping;
	private boolean flavor;
	private boolean cheesetype;
	public Cheesecake(double price, double weight, Date manufacturingDate, boolean isChocolate) {
		super(price, weight, manufacturingDate, isChocolate);
	}
	public Cheesecake(double price, double weight, Date manufacturingDate,boolean isChocolate,boolean topping,boolean flavor,boolean cheesetype) {
		super(price, weight,manufacturingDate,isChocolate);
		this.topping=topping;
		this.flavor=flavor;
		this.cheesetype=cheesetype;
	}
	@Override
	public String getType() {
		return "Cheesecake";
	}
	public boolean isTopping() {
		return topping;
	}
	public boolean isFlavor() {
		return flavor;
	}
	public boolean isCheesetype() {
		return cheesetype;
	}
	public void setTopping(boolean topping) {
		this.topping = topping;
	}
	public void setFlavor(boolean flavor) {
		this.flavor = flavor;
	}
	public void setCheesetype(boolean cheesetype) {
		this.cheesetype = cheesetype;
	}
	@Override
	public String toString() {
		return "Cheesecake [topping="+topping+",flavor="+flavor+",cheesetype="+cheesetype+",isChocolate="+isChocolate+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

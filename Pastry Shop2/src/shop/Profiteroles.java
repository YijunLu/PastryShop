package shop;
import java.util.Date;
public class Profiteroles extends Bun{
	private boolean topping;
	private boolean creamtype;
	public Profiteroles(double price, double weight, Date manufacturingDate, boolean isBreadRoll) {
		super(price, weight, manufacturingDate, isBreadRoll);
	}
	public Profiteroles(double price, double weight, Date manufacturingDate,boolean isBreadRoll,boolean topping,boolean creamtype) {
		super(price, weight,manufacturingDate,isBreadRoll);
		this.topping=topping;
		this.creamtype=creamtype;
	}
	@Override
	public String getType() {
		return "Profiteroles";
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
		return "Profiteroles [topping="+topping+",creamtype="+creamtype+",isBreadRoll="+isBreadRoll+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}
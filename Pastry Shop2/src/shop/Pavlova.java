package shop;
import java.util.Date;
public class Pavlova extends Cake{
	private boolean topping;
	private double amountofsugar;
	public Pavlova(double price, double weight, Date manufacturingDate, boolean isChocolate) {
		super(price, weight, manufacturingDate, isChocolate);
	}
	public Pavlova(double price, double weight, Date manufacturingDate,boolean isChocolate,boolean topping,double amountofsugar) {
		super(price, weight,manufacturingDate,isChocolate);
		this.topping=topping;
		this.amountofsugar=amountofsugar;
	}
	@Override
	public String getType() {
		return "Strudel";
	}
	public boolean isTopping() {
		return topping;
	}
	public double getAmountofsugar() {
		return amountofsugar;
	}
	public void setTopping(boolean topping) {
		this.topping = topping;
	}
	public void setAmountofsugar(double amountofsugar) {
		this.amountofsugar = amountofsugar;
	}
	@Override
	public String toString() {
		return "Strudel [topping="+topping+",amountofsugar="+amountofsugar+",isChocolate="+isChocolate+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

package shop;
import java.util.Date;
public class Meringues extends Bun{
	private double flavor;
	private char color;
	private double amountofsugar;
	private boolean topping;
	public Meringues(double price, double weight, Date manufacturingDate, boolean isBreadRoll) {
		super(price, weight, manufacturingDate, isBreadRoll);
	}
	public Meringues(double price, double weight, Date manufacturingDate, boolean isBreadRoll, double flavor,
			char color, double amountofsugar, boolean topping) {
		super(price, weight, manufacturingDate, isBreadRoll);
		this.flavor = flavor;
		this.color = color;
		this.amountofsugar = amountofsugar;
		this.topping = topping;
	}
	@Override
	public String getType() {
		return "Meringues";
	}
	public double getFlavor() {
		return flavor;
	}
	public char getColor() {
		return color;
	}
	public double getAmountofsugar() {
		return amountofsugar;
	}
	public boolean isTopping() {
		return topping;
	}
	public void setFlavor(double flavor) {
		this.flavor = flavor;
	}
	public void setColor(char color) {
		this.color = color;
	}
	public void setAmountofsugar(double amountofsugar) {
		this.amountofsugar = amountofsugar;
	}
	public void setTopping(boolean topping) {
		this.topping = topping;
	}
	public double priceperlong(double price,double weight) {
		double t;
		t=price/100;
		return price=t*weight;
	}
	@Override
	public String toString() {
		return "Meringues [flavor="+flavor+",color="+color+",amountofsugar="+amountofsugar+",topping="+topping+",isBreadRoll="+isBreadRoll+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

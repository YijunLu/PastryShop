package shop;
import java.util.Date;
public class Cupcake extends Cake{
	private double amountofsugar;
	private boolean fruitfilling;
	
	public Cupcake(double price, double weight, Date manufacturingDate, boolean isChocolate) {
		super(price, weight, manufacturingDate, isChocolate);
	}
	public Cupcake(double price, double weight, Date manufacturingDate,boolean isChocolate,double amountofsugar,boolean fruitfilling) {
		super(price, weight,manufacturingDate,isChocolate);
		this.amountofsugar = amountofsugar;
		this.fruitfilling=fruitfilling;
	}
	@Override
	public String getType() {
		return "Cupcake";
	}
	
	public double getAmountofsugar() {
		return amountofsugar;
	}
	public boolean isFruitfilling() {
		return fruitfilling;
	}
	public void setAmountofsugar(double amountofsugar) {
		this.amountofsugar = amountofsugar;
	}
	public void setFruitfilling(boolean fruitfilling) {
		this.fruitfilling = fruitfilling;
	}
	@Override
	public String toString() {
		return "Cupcake [amountofsugar="+amountofsugar+",fruitfilling="+fruitfilling+",isChocolate="+isChocolate+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

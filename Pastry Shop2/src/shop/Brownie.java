package shop;
import java.util.Date;
public class Brownie extends Cake{
	private boolean chocolatetype;
	private double extraingredients;
	private boolean garnish;
	public Brownie(double price, double weight, Date manufacturingDate, boolean isChocolate) {
		super(price, weight, manufacturingDate, isChocolate);
	}
	public Brownie(double price, double weight, Date manufacturingDate,boolean isChocolate,boolean chocolatetype,double extraingredients,boolean garnish) {
		super(price, weight,manufacturingDate,isChocolate);
		this.chocolatetype=chocolatetype;
		this.extraingredients=extraingredients;
		this.garnish=garnish;
	}
	@Override
	public String getType() {
		return "Brownie";
	}
	public boolean isChocolatetype() {
		return chocolatetype;
	}
	public double getExtraingredients() {
		return extraingredients;
	}
	public boolean isGarnish() {
		return garnish;
	}
	public void setChocolatetype(boolean chocolatetype) {
		this.chocolatetype = chocolatetype;
	}
	public void setExtraingredients(double extraingredients) {
		this.extraingredients = extraingredients;
	}
	public void setGarnish(boolean garnish) {
		this.garnish = garnish;
	}
	@Override
	public String toString() {
		return "Brownie [chocolatetype="+chocolatetype+",extraingredients="+extraingredients+",garnish="+garnish+",isChocolate="+isChocolate+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

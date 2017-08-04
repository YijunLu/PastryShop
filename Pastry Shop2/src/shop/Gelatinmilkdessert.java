package shop;
import java.util.Date;
public class Gelatinmilkdessert extends Cake{
	private double amountofsugar;
	private double fatcontent;
	private char extraingredients;
	public Gelatinmilkdessert(double price, double weight, Date manufacturingDate, boolean isChocolate) {
		super(price, weight, manufacturingDate, isChocolate);
	}
	public Gelatinmilkdessert(double price, double weight, Date manufacturingDate,boolean isChocolate,double fatcontent,double amountofsugar,char extraingredients) {
		super(price, weight,manufacturingDate,isChocolate);
		this.extraingredients=extraingredients;
		this.amountofsugar=amountofsugar;
		this.fatcontent=fatcontent;
	}
	@Override
	public String getType() {
		return "Gelatinmilkdessert";
	}
	public double getAmountofsugar() {
		return amountofsugar;
	}
	public double getFatcontent() {
		return fatcontent;
	}
	public char getExtraingredients() {
		return extraingredients;
	}
	public void setAmountofsugar(double amountofsugar) {
		this.amountofsugar = amountofsugar;
	}
	public void setFatcontent(double fatcontent) {
		this.fatcontent = fatcontent;
	}
	public void setExtraingredients(char extraingredients) {
		this.extraingredients = extraingredients;
	}
	@Override
	public String toString() {
		return "Gelatinmilkdessert [fatcontent="+fatcontent+",amountofsugar="+amountofsugar+",extraingredients="+extraingredients+",isChocolate="+isChocolate+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

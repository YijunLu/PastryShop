package shop;
import java.util.Date;
public class Gelatinchocolatedessert extends Cake{
	private double amountofsugar;
	private double fatcontent;
	private boolean chocolatetype;
	public Gelatinchocolatedessert(double price, double weight, Date manufacturingDate, boolean isChocolate) {
		super(price, weight, manufacturingDate, isChocolate);
	}
	public Gelatinchocolatedessert(double price, double weight, Date manufacturingDate,boolean isChocolate,double fatcontent,double amountofsugar,boolean chocolatetype) {
		super(price, weight,manufacturingDate,isChocolate);
		this.chocolatetype=chocolatetype;
		this.amountofsugar=amountofsugar;
		this.fatcontent=fatcontent;
	}
	@Override
	public String getType() {
		return "Gelatinchocolatedessert";
	}
	public double getAmountofsugar() {
		return amountofsugar;
	}
	public double getFatcontent() {
		return fatcontent;
	}
	public boolean isChocolatetype() {
		return chocolatetype;
	}
	public void setAmountofsugar(double amountofsugar) {
		this.amountofsugar = amountofsugar;
	}
	public void setFatcontent(double fatcontent) {
		this.fatcontent = fatcontent;
	}
	public void setChocolatetype(boolean chocolatetype) {
		this.chocolatetype = chocolatetype;
	}
	@Override
	public String toString() {
		return "Gelatinchocolatedessert [fatcontent="+fatcontent+",amountofsugar="+amountofsugar+",chocolatetype="+chocolatetype+",isChocolate="+isChocolate+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

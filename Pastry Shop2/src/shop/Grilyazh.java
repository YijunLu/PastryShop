package shop;
import java.util.Date;
public class Grilyazh extends Biscuit {
	private boolean nutstype;
	private boolean withfruit;
	private boolean sugarbasetype;
	private double amountofsugar;
	private boolean softness;
	public Grilyazh(double price, double weight, Date manufacturingDate, boolean isWaffle) {
		super(price, weight, manufacturingDate, isWaffle);
	}
	public Grilyazh(double price, double weight, Date manufacturingDate, boolean isWaffle, boolean nutstype,
			boolean withfruit, boolean sugarbasetype, double amountofsugar, boolean softness) {
		super(price, weight, manufacturingDate, isWaffle);
		this.nutstype = nutstype;
		this.withfruit = withfruit;
		this.sugarbasetype = sugarbasetype;
		this.amountofsugar = amountofsugar;
		this.softness = softness;
	}
	@Override
	public String getType() {
		return "Grilyazh";
	}
	public boolean isNutstype() {
		return nutstype;
	}
	public boolean isWithfruit() {
		return withfruit;
	}
	public boolean isSugarbasetype() {
		return sugarbasetype;
	}
	public double getAmountofsugar() {
		return amountofsugar;
	}
	public boolean isSoftness() {
		return softness;
	}
	public void setNutstype(boolean nutstype) {
		this.nutstype = nutstype;
	}
	public void setWithfruit(boolean withfruit) {
		this.withfruit = withfruit;
	}
	public void setSugarbasetype(boolean sugarbasetype) {
		this.sugarbasetype = sugarbasetype;
	}
	public void setAmountofsugar(double amountofsugar) {
		this.amountofsugar = amountofsugar;
	}
	public void setSoftness(boolean softness) {
		this.softness = softness;
	}
	public double priceperlong(double price,double weight) {
		double t;
		t=price/100;
		return price=t*weight;
	}
	@Override
	public String toString() {
		return "Grilyazh [nutstype="+nutstype+",withfruit="+withfruit+",amountofsugar="+amountofsugar+",sugarbasetype="+sugarbasetype+",softness="+softness+",isWaffle="+isWaffle+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

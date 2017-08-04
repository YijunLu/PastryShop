package shop;
import java.util.Date;
public class Candiedfruit extends Bun{
	private boolean fruit;
	private boolean ispeel;
	private double amountofsugar;
	public Candiedfruit(double price, double weight, Date manufacturingDate, boolean isBreadRoll) {
		super(price, weight, manufacturingDate, isBreadRoll);
	}
	public Candiedfruit(double price, double weight, Date manufacturingDate, boolean isBreadRoll, boolean fruit,
			boolean ispeel, double amountofsugar) {
		super(price, weight, manufacturingDate, isBreadRoll);
		this.fruit = fruit;
		this.ispeel = ispeel;
		this.amountofsugar = amountofsugar;
	}
	@Override
	public String getType() {
		return "Candiedfruit";
	}
	public boolean isFruit() {
		return fruit;
	}
	public boolean isIspeel() {
		return ispeel;
	}
	public double getAmountofsugar() {
		return amountofsugar;
	}
	public void setFruit(boolean fruit) {
		this.fruit = fruit;
	}
	public void setIspeel(boolean ispeel) {
		this.ispeel = ispeel;
	}
	public void setAmountofsugar(double amountofsugar) {
		this.amountofsugar = amountofsugar;
	}
	public double priceperlong(double price,double weight) {
		double t;
		t=price/100;
		return price=t*weight;
	}
	@Override
	public String toString() {
		return "Candiedfruit [fruit="+fruit+",ispeel="+ispeel+",amountofsugar="+amountofsugar+",isBreadRoll="+isBreadRoll+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

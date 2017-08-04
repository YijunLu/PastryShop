package shop;
import java.util.Date;
public class Belgianwaffles extends Biscuit{
	private boolean fillingtype;
	private double energyvalue;
	private boolean topping;
	public Belgianwaffles(double price, double weight, Date manufacturingDate, boolean isWaffle) {
		super(price, weight, manufacturingDate, isWaffle);
	}
	public Belgianwaffles(double price, double weight, Date manufacturingDate,boolean isWaffle,boolean fillingtype,double energyvalue,boolean topping) {
		super(price, weight,manufacturingDate,isWaffle);
		this.fillingtype=fillingtype;
		this.energyvalue=energyvalue;
		this.topping=topping;
	}
	@Override
	public String getType() {
		return "Belgianwaffles";
	}
	public boolean isFillingtype() {
		return fillingtype;
	}
	public double getEnergyvalue() {
		return energyvalue;
	}
	public boolean isTopping() {
		return topping;
	}
	public void setFillingtype(boolean fillingtype) {
		this.fillingtype = fillingtype;
	}
	public void setEnergyvalue(double energyvalue) {
		this.energyvalue = energyvalue;
	}
	public void setTopping(boolean topping) {
		this.topping = topping;
	}
	@Override
	public String toString() {
		return "Belgianwaffles [fillingtype="+fillingtype+",energyvalue="+energyvalue+",topping="+topping+",isWaffle="+isWaffle+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}
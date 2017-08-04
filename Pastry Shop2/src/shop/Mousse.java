package shop;
import java.util.Date;
public class Mousse extends Cake{
	private boolean flavorbase;
	private boolean sweetnessbase;
	private double amountofsugar;
	public Mousse(double price, double weight, Date manufacturingDate, boolean isChocolate) {
		super(price, weight, manufacturingDate, isChocolate);
	}
	public Mousse(boolean flavoebase,boolean sweetnessbase,double amountofsugar,double price,double weight,Date manufacturingDate,boolean isChocolate) {
		super(price,weight,manufacturingDate,isChocolate);
		this.amountofsugar=amountofsugar;
		this.flavorbase=flavorbase;
		this.sweetnessbase=sweetnessbase;
	}
@Override
public String getType() {
	return"Mousse";
}
public boolean isFlavorbase() {
	return flavorbase;
}
public boolean isSweetnessbase() {
	return sweetnessbase;
}
public double getAmountofsugar() {
	return amountofsugar;
}
public void setFlavorbase(boolean flavorbase) {
	this.flavorbase = flavorbase;
}
public void setSweetnessbase(boolean sweetnessbase) {
	this.sweetnessbase = sweetnessbase;
}
public void setAmountofsugar(double amountofsugar) {
	this.amountofsugar = amountofsugar;
}
@Override
public String toString() {
	return"Mousse[flavorbase="+flavorbase+",sweetnessbase="+sweetnessbase+",amountofsugar="+amountofsugar+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+",isChocolate="+isChocolate+"]";
}
}

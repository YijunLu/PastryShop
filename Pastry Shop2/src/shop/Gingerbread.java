package shop;
import java.util.Date;
public class Gingerbread extends Biscuit{
	private boolean sweetnessbase;
	private boolean fillingtype;
	private boolean glaze;
	private boolean softness;
	public Gingerbread(double price, double weight, Date manufacturingDate, boolean isWaffle) {
		super(price, weight, manufacturingDate, isWaffle);
	}
	public Gingerbread(double price, double weight, Date manufacturingDate, boolean isWaffle, boolean sweetnessbase,
			boolean fillingtype, boolean glaze, boolean softness) {
		super(price, weight, manufacturingDate, isWaffle);
		this.sweetnessbase = sweetnessbase;
		this.fillingtype = fillingtype;
		this.glaze = glaze;
		this.softness = softness;
	}
	@Override
	public String getType() {
		return "Gingerbread";
	}
	public boolean isSweetnessbase() {
		return sweetnessbase;
	}
	public boolean isFillingtype() {
		return fillingtype;
	}
	public boolean isGlaze() {
		return glaze;
	}
	public boolean isSoftness() {
		return softness;
	}
	public void setSweetnessbase(boolean sweetnessbase) {
		this.sweetnessbase = sweetnessbase;
	}
	public void setFillingtype(boolean fillingtype) {
		this.fillingtype = fillingtype;
	}
	public void setGlaze(boolean glaze) {
		this.glaze = glaze;
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
		return "Gingerbread [sweetnessbase="+sweetnessbase+",fillingtype="+fillingtype+",glaze="+glaze+",softness="+softness+",isWaffle="+isWaffle+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

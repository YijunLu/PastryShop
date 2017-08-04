package shop;
import java.util.Date;
public class Berliner extends Biscuit{
	private boolean fillingtype;
	private boolean glaze;

	public Berliner(double price, double weight, Date manufacturingDate, boolean isWaffle) {
		super(price, weight, manufacturingDate, isWaffle);
	}
	public Berliner(double price, double weight, Date manufacturingDate, boolean isWaffle, boolean fillingtype,
			boolean glaze) {
		super(price, weight, manufacturingDate, isWaffle);
		this.fillingtype = fillingtype;
		this.glaze = glaze;
	}
	@Override
	public String getType() {
		return "Berliner";
	}
	public boolean isFillingtype() {
		return fillingtype;
	}
	public boolean isGlaze() {
		return glaze;
	}
	public void setFillingtype(boolean fillingtype) {
		this.fillingtype = fillingtype;
	}
	public void setGlaze(boolean glaze) {
		this.glaze = glaze;
	}
	@Override
	public String toString() {
		return "Berliner [fillingtype="+fillingtype+",glaze="+glaze+",isWaffle="+isWaffle+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

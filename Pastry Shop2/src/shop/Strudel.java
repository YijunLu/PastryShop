package shop;
import java.util.Date;
public class Strudel extends Biscuit{
	private boolean fillingtype;
	private boolean doughtype;
	public Strudel(double price, double weight, Date manufacturingDate, boolean isWaffle) {
		super(price, weight, manufacturingDate, isWaffle);
	}
	public Strudel(double price, double weight, Date manufacturingDate,boolean isWaffle,boolean fillingtype,boolean doughtype) {
		super(price, weight,manufacturingDate,isWaffle);
		this.fillingtype =fillingtype;
		this.doughtype=doughtype;
	}
	@Override
	public String getType() {
		return "Strudel";
	}
	public boolean isFillingtype() {
		return fillingtype;
	}
	public boolean isDoughtype() {
		return doughtype;
	}
	public void setFillingtype(boolean fillingtype) {
		this.fillingtype = fillingtype;
	}
	public void setDoughtype(boolean doughtype) {
		this.doughtype = doughtype;
	}
	@Override
	public String toString() {
		return "Strudel [fillingtype="+fillingtype+",doughtype="+doughtype+",isWaffle="+isWaffle+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

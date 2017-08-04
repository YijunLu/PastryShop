package shop;
import java.util.Date;
public class Bunwithfilling extends Bun{
	private boolean fillingtype;
	private double doughtype;
	public Bunwithfilling(double price, double weight, Date manufacturingDate, boolean isBreadRoll) {
		super(price, weight, manufacturingDate, isBreadRoll);
	}
	public Bunwithfilling(double price, double weight, Date manufacturingDate,boolean isBreadRoll,boolean fillingtype,double doughtype) {
		super(price, weight,manufacturingDate,isBreadRoll);
		this.fillingtype=fillingtype;
		this.doughtype=doughtype;
	}
	@Override
	public String getType() {
		return "Bunwithfilling";
	}
	public boolean isFillingtype() {
		return fillingtype;
	}
	public double getDoughtype() {
		return doughtype;
	}
	public void setFillingtype(boolean fillingtype) {
		this.fillingtype = fillingtype;
	}
	public void setDoughtype(double doughtype) {
		this.doughtype = doughtype;
	}
	@Override
	public String toString() {
		return "Bunwithfilling [fillingtype="+fillingtype+",doughtype="+doughtype+",isBreadRoll="+isBreadRoll+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}
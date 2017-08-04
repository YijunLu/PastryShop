package shop;
import java.util.Date;
public class Rugelach extends Bun{
	private boolean fillingtype;
	private boolean doughtype;
	private boolean isoriginalfilling;
	public Rugelach(double price, double weight, Date manufacturingDate, boolean isBreadRoll) {
		super(price, weight, manufacturingDate, isBreadRoll);
	}
	public Rugelach(double price, double weight, Date manufacturingDate,boolean isBreadRoll,boolean fillingtype,boolean doughtype,boolean isoriginalfilling) {
		super(price, weight,manufacturingDate,isBreadRoll);
		this.fillingtype=fillingtype;
		this.doughtype=doughtype;
		this.isoriginalfilling=isoriginalfilling;
	}
	@Override
	public String getType() {
		return "Rugelach";
	}
	public boolean isFillingtype() {
		return fillingtype;
	}
	public boolean isDoughtype() {
		return doughtype;
	}
	public boolean isIsoriginalfilling() {
		return isoriginalfilling;
	}
	public void setFillingtype(boolean fillingtype) {
		this.fillingtype = fillingtype;
	}
	public void setDoughtype(boolean doughtype) {
		this.doughtype = doughtype;
	}
	public void setIsoriginalfilling(boolean isoriginalfilling) {
		this.isoriginalfilling = isoriginalfilling;
	}
	@Override
	public String toString() {
		return "Rugelach [fillingtype="+fillingtype+",doughtype="+doughtype+",isoriginalfilling="+isoriginalfilling+",isBreadRoll="+isBreadRoll+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}
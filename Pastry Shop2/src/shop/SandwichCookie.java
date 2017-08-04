package shop;
import java.util.Date;
public class SandwichCookie extends Biscuit{
	private boolean fillingtype;
	private boolean doughtype;
	private char shape;
	public SandwichCookie(double price, double weight, Date manufacturingDate, boolean isWaffle) {
		super(price, weight, manufacturingDate, isWaffle);
	}
	public SandwichCookie(double price, double weight, Date manufacturingDate,boolean isWaffle,boolean fillingtype,boolean doughtype,char shape) {
		super(price, weight,manufacturingDate,isWaffle);
		this.fillingtype =fillingtype;
		this.doughtype=doughtype;
		this.shape=shape;
	}
	@Override
	public String getType() {
		return "SandwichCookie";
	}
	public boolean isFillingtype() {
		return fillingtype;
	}
	public boolean isDoughtype() {
		return doughtype;
	}
	public char getShape() {
		return shape;
	}
	public void setFillingtype(boolean fillingtype) {
		this.fillingtype = fillingtype;
	}
	public void setDoughtype(boolean doughtype) {
		this.doughtype = doughtype;
	}
	public void setShape(char shape) {
		this.shape = shape;
	}
	@Override
	public String toString() {
		return "SandwichCookie [fillingtype="+fillingtype+",doughtype="+doughtype+",shape="+shape+",isWaffle="+isWaffle+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

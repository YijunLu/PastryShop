package shop;
import java.util.Date;
public class Piewithberries extends Biscuit{
	private boolean typeofberry;
	private boolean doughtype;
	private char shape;
	public Piewithberries(double price, double weight, Date manufacturingDate, boolean isWaffle) {
		super(price, weight, manufacturingDate, isWaffle);
	}
	public Piewithberries(double price, double weight, Date manufacturingDate,boolean isWaffle,boolean typeofberry,boolean doughtype,char shape) {
		super(price, weight,manufacturingDate,isWaffle);
		this.typeofberry=typeofberry;
		this.doughtype=doughtype;
		this.shape=shape;
	}
	@Override
	public String getType() {
		return "Piewithberries";
	}
	public boolean isTypeofberry() {
		return typeofberry;
	}
	public boolean isDoughtype() {
		return doughtype;
	}
	public char getShape() {
		return shape;
	}
	public void setTypeofberry(boolean typeofberry) {
		this.typeofberry = typeofberry;
	}
	public void setDoughtype(boolean doughtype) {
		this.doughtype = doughtype;
	}
	public void setShape(char shape) {
		this.shape = shape;
	}
	@Override
	public String toString() {
		return "Piewithberries [typeofberry="+typeofberry+",doughtype="+doughtype+",shape="+shape+",isWaffle="+isWaffle+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

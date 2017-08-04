package shop;
import java.util.Date;
public class Croissant extends Bun{
	private boolean fillingtype;
	private double size;
	public Croissant(double price, double weight, Date manufacturingDate, boolean isBreadRoll) {
		super(price, weight, manufacturingDate, isBreadRoll);
	}
	public Croissant(double price, double weight, Date manufacturingDate,boolean isBreadRoll,boolean fillingtype,double size) {
		super(price, weight,manufacturingDate,isBreadRoll);
		this.fillingtype=fillingtype;
		this.size=size;
	}
	@Override
	public String getType() {
		return "Croissant";
	}
	public boolean isFillingtype() {
		return fillingtype;
	}
	public double getSize() {
		return size;
	}
	public void setFillingtype(boolean fillingtype) {
		this.fillingtype = fillingtype;
	}
	public void setSize(double size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Croissant [fillingtype="+fillingtype+",size="+size+",isBreadRoll="+isBreadRoll+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}
package shop;
import java.util.Date;
public class Chiffonpie extends Biscuit{
	private boolean fillingtype;
	private boolean biscuittype;
	private boolean iswithfreshberries;
	private boolean iswithjam;
	public Chiffonpie(double price, double weight, Date manufacturingDate, boolean isWaffle) {
		super(price, weight, manufacturingDate, isWaffle);
	}
	public Chiffonpie(double price, double weight, Date manufacturingDate,boolean isWaffle,boolean fillingtype,boolean biscuittype,boolean iswithfreshberries,boolean iswithjam) {
		super(price, weight,manufacturingDate,isWaffle);
		this.fillingtype =fillingtype;
		this.biscuittype=biscuittype;
		this.iswithfreshberries=iswithfreshberries;
		this.iswithjam=iswithjam;
	}
	@Override
	public String getType() {
		return "Chiffonpie";
	}
	public boolean isFillingtype() {
		return fillingtype;
	}
	public boolean isBiscuittype() {
		return biscuittype;
	}
	public boolean isIswithfreshberries() {
		return iswithfreshberries;
	}
	public boolean isIswithjam() {
		return iswithjam;
	}
	public void setFillingtype(boolean fillingtype) {
		this.fillingtype = fillingtype;
	}
	public void setBiscuittype(boolean biscuittype) {
		this.biscuittype = biscuittype;
	}
	public void setIswithfreshberries(boolean iswithfreshberries) {
		this.iswithfreshberries = iswithfreshberries;
	}
	public void setIswithjam(boolean iswithjam) {
		this.iswithjam = iswithjam;
	}
	@Override
	public String toString() {
		return " Chiffonpie[fillingtype="+fillingtype+",biscuittype="+biscuittype+",iswithfreshberries="+iswithfreshberries+",iswithjam="+iswithjam+",isWaffle="+isWaffle+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

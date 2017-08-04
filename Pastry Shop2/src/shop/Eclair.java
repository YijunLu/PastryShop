package shop;
import java.util.Date;
public class Eclair extends Biscuit{
	private boolean fillingtype;
	private boolean typeofthetopcover;
	public Eclair(double price, double weight, Date manufacturingDate, boolean isWaffle) {
		super(price, weight, manufacturingDate, isWaffle);
	}
	public Eclair(double price, double weight, Date manufacturingDate,boolean isWaffle,boolean fillingtype,boolean typeofthetopcover) {
		super(price, weight,manufacturingDate,isWaffle);
		this.fillingtype =fillingtype;
		this.typeofthetopcover=typeofthetopcover;
	}
	@Override
	public String getType() {
		return "Eclair";
	}
	public boolean isFillingtype() {
		return fillingtype;
	}
	public boolean isTypeofthetopcover() {
		return typeofthetopcover;
	}
	public void setFillingtype(boolean fillingtype) {
		this.fillingtype = fillingtype;
	}
	public void setTypeofthetopcover(boolean typeofthetopcover) {
		this.typeofthetopcover = typeofthetopcover;
	}
	@Override
	public String toString() {
		return "Eclair [fillingtype="+fillingtype+",typeofthetopcover="+typeofthetopcover+",isWaffle="+isWaffle+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

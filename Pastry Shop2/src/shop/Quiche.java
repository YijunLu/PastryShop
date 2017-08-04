package shop;
import java.util.Date;
public class Quiche extends Biscuit{
	private boolean fillingtype;
	private boolean cheesetype;
	private boolean iscrusted;
	public Quiche(double price, double weight, Date manufacturingDate, boolean isWaffle) {
		super(price, weight, manufacturingDate, isWaffle);
	}
	public Quiche(double price, double weight, Date manufacturingDate,boolean isWaffle,boolean fillingtype,boolean cheesetype,boolean iscrusted) {
		super(price, weight,manufacturingDate,isWaffle);
		this.fillingtype =fillingtype;
		this.cheesetype=cheesetype;
		this.iscrusted=iscrusted;
	}
	@Override
	public String getType() {
		return "Quiche";
	}
	public boolean isFillingtype() {
		return fillingtype;
	}
	public boolean isCheesetype() {
		return cheesetype;
	}
	public boolean isIscrusted() {
		return iscrusted;
	}
	public void setFillingtype(boolean fillingtype) {
		this.fillingtype = fillingtype;
	}
	public void setCheesetype(boolean cheesetype) {
		this.cheesetype = cheesetype;
	}
	public void setIscrusted(boolean iscrusted) {
		this.iscrusted = iscrusted;
	}
	@Override
	public String toString() {
		return "Quiche [fillingtype="+fillingtype+",cheesetype="+cheesetype+",iscrusted="+iscrusted+",isWaffle="+isWaffle+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

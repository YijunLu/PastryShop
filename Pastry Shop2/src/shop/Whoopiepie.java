package shop;
import java.util.Date;
public class Whoopiepie extends Biscuit {
	private boolean cookietype;
	private boolean creamfillingtype;
	private char cookiecolor;
	private char fillingcolor;
	public Whoopiepie(double price, double weight, Date manufacturingDate, boolean isWaffle) {
		super(price, weight, manufacturingDate, isWaffle);
	}
	public Whoopiepie(double price, double weight, Date manufacturingDate, boolean isWaffle, boolean cookietype,
			boolean creamfillingtype, char cookiecolor, char fillingcolor) {
		super(price, weight, manufacturingDate, isWaffle);
		this.cookietype = cookietype;
		this.creamfillingtype = creamfillingtype;
		this.cookiecolor = cookiecolor;
		this.fillingcolor = fillingcolor;
	}
	@Override
	public String getType() {
		return "Whoopiepie";
	}
	public boolean isCookietype() {
		return cookietype;
	}
	public boolean isCreamfillingtype() {
		return creamfillingtype;
	}
	public char getCookiecolor() {
		return cookiecolor;
	}
	public char getFillingcolor() {
		return fillingcolor;
	}
	public void setCookietype(boolean cookietype) {
		this.cookietype = cookietype;
	}
	public void setCreamfillingtype(boolean creamfillingtype) {
		this.creamfillingtype = creamfillingtype;
	}
	public void setCookiecolor(char cookiecolor) {
		this.cookiecolor = cookiecolor;
	}
	public void setFillingcolor(char fillingcolor) {
		this.fillingcolor = fillingcolor;
	}
	@Override
	public String toString() {
		return "Whoopiepie [cookietype="+cookietype+",creamfillingtype="+creamfillingtype+",cookiecolor="+cookiecolor+",fillingcolor="+fillingcolor+",isWaffle="+isWaffle+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}
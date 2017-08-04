package shop;
import java.util.Date;
public class Macaron extends Biscuit {
	private double flavour;
	private char color;
	public Macaron(double price, double weight, Date manufacturingDate, boolean isWaffle) {
		super(price, weight, manufacturingDate, isWaffle);
	}
	public Macaron(double price, double weight, Date manufacturingDate, boolean isWaffle, double flavour, char color) {
		super(price, weight, manufacturingDate, isWaffle);
		this.flavour = flavour;
		this.color = color;
	}
	@Override
	public String getType() {
		return "Macaron";
	}
	public double getFlavour() {
		return flavour;
	}
	public char getColor() {
		return color;
	}
	public void setFlavour(double flavour) {
		this.flavour = flavour;
	}
	public void setColor(char color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Macaron [flavour="+flavour+",color="+color+",isWaffle="+isWaffle+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}


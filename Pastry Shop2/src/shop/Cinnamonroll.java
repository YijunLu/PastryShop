package shop;
import java.util.Date;
public class Cinnamonroll extends Bun{
	private boolean doughtype;
	private double cinnamonamount;
	private boolean garnish;
	public Cinnamonroll(double price, double weight, Date manufacturingDate, boolean isBreadRoll) {
		super(price, weight, manufacturingDate, isBreadRoll);
	}
	public Cinnamonroll(double price, double weight, Date manufacturingDate,boolean isBreadRoll,boolean doughtype,double cinnamonamount,boolean garnish) {
		super(price, weight,manufacturingDate,isBreadRoll);
		this.doughtype=doughtype;
		this.cinnamonamount=cinnamonamount;
		this.garnish=garnish;
	}
	@Override
	public String getType() {
		return "Cinnamonroll";
	}
	public boolean isDoughtype() {
		return doughtype;
	}
	public double getCinnamonamount() {
		return cinnamonamount;
	}
	public boolean isGarnish() {
		return garnish;
	}
	public void setDoughtype(boolean doughtype) {
		this.doughtype = doughtype;
	}
	public void setCinnamonamount(double cinnamonamount) {
		this.cinnamonamount = cinnamonamount;
	}
	public void setGarnish(boolean garnish) {
		this.garnish = garnish;
	}
	@Override
	public String toString() {
		return "Cinnamonroll [doughtype="+doughtype+",cinnamonamount="+cinnamonamount+",garnish="+garnish+",isBreadRoll="+isBreadRoll+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

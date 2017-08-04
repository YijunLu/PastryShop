package shop;
import java.util.Date;
public class Dountwithfilling extends Bun{
	private boolean fillingtype;
	private double energyvalue;
	private boolean typeofthetopcover;
	public Dountwithfilling(double price, double weight, Date manufacturingDate, boolean isBreadRoll) {
		super(price, weight, manufacturingDate, isBreadRoll);
	}
	public Dountwithfilling(double price, double weight, Date manufacturingDate,boolean isBreadRoll,boolean fillingtype,double energyvalue,boolean typeofthetopcover) {
		super(price, weight,manufacturingDate,isBreadRoll);
		this.fillingtype=fillingtype;
		this.energyvalue=energyvalue;
		this.typeofthetopcover=typeofthetopcover;
	}
	@Override
	public String getType() {
		return "Dountwithfilling";
	}
	public boolean isFillingtype() {
		return fillingtype;
	}
	public double getEnergyvalue() {
		return energyvalue;
	}
	public boolean isTypeofthetopcover() {
		return typeofthetopcover;
	}
	public void setFillingtype(boolean fillingtype) {
		this.fillingtype = fillingtype;
	}
	public void setEnergyvalue(double energyvalue) {
		this.energyvalue = energyvalue;
	}
	public void setTypeofthetopcover(boolean typeofthetopcover) {
		this.typeofthetopcover = typeofthetopcover;
	}
	@Override
	public String toString() {
		return "Dountwithfilling [fillingtype="+fillingtype+",energyvalue="+energyvalue+",typeofthetopcover="+typeofthetopcover+",isBreadRoll="+isBreadRoll+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}
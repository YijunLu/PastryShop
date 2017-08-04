package shop;
import java.util.Date;
public class Tiramisu extends Cake{
	private boolean isalcoholflavored;
	private char extraingredients;
	public Tiramisu(double price, double weight, Date manufacturingDate, boolean isChocolate) {
		super(price, weight, manufacturingDate, isChocolate);
	}
	public Tiramisu(double price, double weight, Date manufacturingDate,boolean isChocolate,boolean isalcoholflavored,char extraingredients) {
		super(price, weight,manufacturingDate,isChocolate);
		this.extraingredients=extraingredients;
		this.isalcoholflavored=isalcoholflavored;
	}
	@Override
	public String getType() {
		return "Tiramisu";
	}
	public boolean isIsalcoholflavored() {
		return isalcoholflavored;
	}
	public char getExtraingredients() {
		return extraingredients;
	}
	public void setIsalcoholflavored(boolean isalcoholflavored) {
		this.isalcoholflavored = isalcoholflavored;
	}
	public void setExtraingredients(char extraingredients) {
		this.extraingredients = extraingredients;
	}
	@Override
	public String toString() {
		return "Tiramisu [extraingredients="+extraingredients+",isalcoholflavored="+isalcoholflavored+",isChocolate="+isChocolate+",price="+price+",weight="+weight+",manufacturingDate="+manufacturingDate+"]";
	}
}

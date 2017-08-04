package shop;
import java.text.ParseException;
import java.util.*;


public class PastryShopTest{
	public static void main(String[] args) throws ParseException{
		String fileName="C:\\Users\\Yijun_Lu\\Desktop\\workspace\\Pastry Shop2\\src\\shop\\PastryShop.txt";
		PastryShop shop = new PastryShop("Almi", "Minsk");
		shop.readProductsFromFile(fileName);

		for(int i=0;i<shop.products.length;i++) {
			System.out.println(shop.products[i].toString());
		}
		for(int i=0;i<shop.numOfBiscuits;i++) {
			System.out.println(shop.getBiscuits()[i].toString());
		}
		for(int i=0;i<shop.numOfCakes;i++) {
			System.out.println(shop.getCakes()[i].toString());
		}
	
		for(int i=0;i<shop.numOfBuns;i++) {
			System.out.println(shop.getBuns()[i].toString());
		}
		
		
		System.out.println(shop.getName());
		System.out.println("check");
		
		shop.findLatestBun();
		shop.findSpecificProduct(new Cake(30, 1, new Date(123), true));
	}
}

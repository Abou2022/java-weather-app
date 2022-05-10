package assignment;//this program it is for my own country. I wrote for each city with different menu
					//the local price. I used exchangeRate
import java.text.DecimalFormat;//I don't have image I don't if it is my eclipse I follows all steps regarding the image
//Bakary Sylla SID:956110117 Date:10/22/2021
public class COTEdIVOIRE extends Burger211 {
	
	private double discountRate = 0;
	private String [] burgerNamePrice = new String[getHowManyBurgers()];
	String pro = "";
	static double exchangeRate = 545; //this is my exchange rate $1=545F //I try with Big Data but unfortunately I did not get Data
	
	
	@Override
	public void Promotion(Double discount, String promote) {
		discountRate = discount;
		pro = promote;
	}
	
	@Override
	public void Menu(String franchise) {//I use this part for my exchange rate
		DecimalFormat df = new DecimalFormat();
		
		for (int i = 0; i < getHowManyBurgers(); i++) {
			burgerNamePrice[i] = getBurgerName(i)+ " : " + df.format(getBurgerPrice(i)  * (1.0 - discountRate) * exchangeRate) + "" + "F CFA";
			if (discountRate > 0.0) {
				burgerNamePrice[i] += "(regular:" + df.format(getBurgerPrice(i) *exchangeRate)   + ")";
	
			}
		}
		new MenuGUI(franchise, pro, burgerNamePrice[0], getBurgerTopping(0), burgerNamePrice[1], getBurgerTopping(1), burgerNamePrice[2], getBurgerTopping(2));
		
	}
	//@Override
	
	public String getBurgerTopping(int i) { //I update my menu here. for each Burger
		if (i==0) {
			return  ("rice, gallo, onion, ranch sauce");//this burger 1
		} else if(i==1) {
			return ("chiken africain, gallon, onion, ranch sauce");//burger 2
		} else {
			return ("chiken africain, gallon, onion, special sauce");//burger 3
		}
}

}

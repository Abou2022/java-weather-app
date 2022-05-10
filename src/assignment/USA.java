package assignment;

import java.text.DecimalFormat;

public class USA extends Burger211{
	
	private double discountRate = 0;
	private String [] burgerNamePrice = new String[getHowManyBurgers()];
	String pro = "";
	
	@Override
	
	public void Promotion(Double discount, String promote) {
		discountRate = discount;
		pro = promote;
	}
	
	@Override
	public void Menu(String franchise) {
		DecimalFormat df = new DecimalFormat();
		
		for (int i = 0; i < getHowManyBurgers(); i++) {
			burgerNamePrice[i] = getBurgerName(i) + " / " + "$" + df.format(getBurgerPrice(i) * (1.0 - discountRate));
			if (discountRate > 0.0) {
				burgerNamePrice[i] += "(regular:" + df.format(getBurgerPrice(i)) + ")";
			}
		}
		new MenuGUI(franchise, pro, burgerNamePrice[0], getBurgerTopping(0), burgerNamePrice[1], getBurgerTopping(1), burgerNamePrice[2], getBurgerTopping(2));
		
	}
	

}

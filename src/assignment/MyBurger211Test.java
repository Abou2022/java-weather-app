package assignment;


public class MyBurger211Test {
	
public static void main(String[] args) {
		
		Burger211 Bellevue = new USA();
		Bellevue.Promotion(0.1, "10% Off - BTS Bellevue College Concert Special");
		Bellevue.Menu("Bellevue");
//		
		Burger211 Seattle = new USA();
		Seattle.Promotion(0.5, "50% Off - If you're vaccinated");
		Seattle.Menu("Seattle");
		
		Burger211 Abidjan = new COTEdIVOIRE();//this Abidjan form COTEdIVOIRE abstract class
		Abidjan.Promotion(0.4, "40% Off if you follows us on Facebook and instagram ");//this is my promotion
		Abidjan.Menu("Abidjannais");

		
		
		Burger211 Odienne = new COTEdIVOIRE();
		Odienne.Promotion(0.5, "Today's Special: 50% off if you download our APP and order");
		Odienne.Menu("Odienne");//this the second city with another promotion

	}

}

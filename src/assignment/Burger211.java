package assignment;

import java.util.ArrayList;


class BurgerInfo {
	String name;
	double price;
	String tooping;
}

public abstract class Burger211 {

 ArrayList<BurgerInfo> Burger = new ArrayList<>();
	
	Burger211(){
		BurgerInfo b1 = new BurgerInfo();
		b1.name = "Inheritance Burger";
		b1.price = 3.0;
		b1.tooping = "beef patty, tomato, onion, ranch sauce";
		Burger.add(b1);
		
		BurgerInfo b2 = new BurgerInfo();
		b2.name = "Overriding Burger";
		b2.price = 2.0;
		b2.tooping = "beef patty, lime, onion, lettuce, toato sauce";
		Burger.add(b2);
		
		BurgerInfo b3 = new BurgerInfo();
		b3.name = "Polymorphism Burger";
		b3.price = 3.5;
		b3.tooping = "Chiken breast, gallo, onion, ranch sauce";
		Burger.add(b3);
	}
	
	public String getBurgerName(int i) {
		return Burger.get(i).name;
	}
	
	public double getBurgerPrice(int i) {
		return Burger.get(i).price;
	}
	
	public String getBurgerTopping(int i) {
		return Burger.get(i).tooping;
	}
	
	public int getHowManyBurgers() {
		return Burger.size();
	}
	
	abstract void Menu(String franchise);
	abstract void Promotion(Double discountRate, String promote);
	
		
	}

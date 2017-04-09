package lje.myapplication.factory;



public class CheesePizza extends Pizza {

	public CheesePizza(PizzaIngredientFactory factory) {
		this.factory = factory;
	}

	private  PizzaIngredientFactory  factory;
	public CheesePizza() {
		name = "Cheese Pizza";
		dough = "Regular Crust";
		sauce = "Marinara Pizza Sauce";
		toppings.add("Fresh Mozzarella");
		toppings.add("Parmesan");
	}
	@Override
	void prepare() {

	}
}

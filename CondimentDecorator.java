package headfirst.designpatterns.decorator.starbuzzmod;

public abstract class CondimentDecorator extends Beverage {
	private Beverage beverage;	
	public CondimentDecorator(Beverage beverageIn) {
		beverage = beverageIn;
	}
	
	public abstract String getThisDescription();
	public abstract double getThisCost();
	
	public String getDescription() {
		return beverage.getDescription() + ", " + getThisDescription();
	}

	public double cost() {
		return getThisCost() + beverage.cost();
	}
}

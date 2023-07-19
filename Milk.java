package headfirst.designpatterns.decorator.starbuzzmod;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		super(beverage);
	}

	public String getThisDescription() {
		return "Milk";
	}

	public double getThisCost() {
		return .10;
	}
}

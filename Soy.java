package headfirst.designpatterns.decorator.starbuzzmod;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		super(beverage);
	}

	public String getThisDescription() {
		return "Soy";
	}

	public double getThisCost() {
		return .15;
	}
}

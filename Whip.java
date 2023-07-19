package headfirst.designpatterns.decorator.starbuzzmod;
 
public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		super(beverage);
	}
 
	public String getThisDescription() {
		return "Whip";
	}

	public double getThisCost() {
		return .10;
	}
}

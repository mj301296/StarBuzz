package headfirst.designpatterns.decorator.starbuzzmod;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		super(beverage);
		System.out.println("Hello inside "+beverage.getDescription()+ " $" + beverage.cost());
	}


	public String getThisDescription() {
		return "Mocha";
	}

	public double getThisCost() {
		return .20;
	} 
}

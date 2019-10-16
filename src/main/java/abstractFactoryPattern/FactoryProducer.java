package abstractFactoryPattern;

public class FactoryProducer {
	public static AbstractFactory getFactory() {
		return new ShapeFactory();
	}
}
package abstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		return null;
	}

}

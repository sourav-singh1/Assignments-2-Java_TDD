package abstractFactoryPatterntTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import abstractFactoryPattern.AbstractFactory;
import abstractFactoryPattern.Circle;
import abstractFactoryPattern.FactoryProducer;
import abstractFactoryPattern.Rectangle;
import abstractFactoryPattern.Shape;

public class AbstractFactoryPatternTest {
	
	@Test
	public void shouldReturnShapeFromFactoryProducer() {
		AbstractFactory shapeFactory = FactoryProducer.getFactory();
	      Shape shape1 = shapeFactory.getShape("RECTANGLE");
	      shape1.draw();
	      Shape shape2 = shapeFactory.getShape("CIRCLE");
	      shape2.draw();
	      Shape shape3= shapeFactory.getShape("NULL");
	      assertEquals(Rectangle.class, shape1.getClass());
	      assertEquals(Circle.class, shape2.getClass());
	      
	}

}

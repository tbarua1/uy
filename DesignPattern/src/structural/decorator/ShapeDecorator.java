package structural.decorator;

public class ShapeDecorator implements Shape1 {
	 protected Shape1 decoratedShape;

	   public ShapeDecorator(Shape1 decoratedShape){
	      this.decoratedShape = decoratedShape;
	   }
	@Override
	public void draw() {
		// TODO Auto-generated method stub
decoratedShape.draw();
	}

}

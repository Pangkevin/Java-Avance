package Exo4;

public class Circle {

	private Point p;
	private int rayon;

	public Circle(Point p, int rayon) {
		this.p = p;
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Circle [p=" + p + ", rayon=" + rayon + "]";
	}

	public void translate(int dx, int dy) {

		this.p.setX(p.getX() + dx);
		this.p.setY(p.getY() + dy);

	}

	public static void main(String[] args) {

		Point p=new Point(1,2);
		Circle c=new Circle(p,1);
		Circle c2=new Circle(p,2);
		c2.translate(1,1);
		System.out.println(c+" "+c2);
	}

}

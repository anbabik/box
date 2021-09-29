package point;


public class MyFirstProgram{

public static void main(String[] args) {
	System.out.println("Hello, kek!");

	Point pointA = new Point(0, 5);
	Point pointB = new Point(0,-6);

	System.out.printf("Функция возвращает %.2f как расстояние между pointA( %.2f, %.2f) и pointB (%.2f, %.2f )  \n",
			distance(pointA, pointB), pointA.x, pointA.y, pointB.x, pointB.y);

	System.out.printf("Метод класса Point возвращает %.2f как расстояние между pointA( %.2f, %.2f) и pointB (%.2f, %.2f ) \n",
			pointA.distance(pointB), pointA.x, pointA.y, pointB.x, pointB.y);

}

	public static double distance(Point a, Point b) {
		double d;

		d = Math.pow((b.x-a.x), 2)+Math.pow((b.y-a.y), 2);
		//System.out.println(d);
		return Math.sqrt(d);

	}

}


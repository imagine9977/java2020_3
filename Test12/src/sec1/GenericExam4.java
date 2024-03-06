package sec1;
class Point<T,V>{
	T x;
	V y;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public V getY() {
		return y;
	}
	public void setY(V y) {
		this.y = y;
	}
	public Point(T x, V y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point() {}
	
}
public class GenericExam4 {
	
	//제너릭 메소드
	public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) {
		double left = ((Number) p1.getX()).doubleValue();
		double right = ((Number) p2.getX()).doubleValue();
		double top = ((Number) p1.getY()).doubleValue();
		double bottom = ((Number) p2.getY()).doubleValue();
		
		double width = right -left;
		double height = top - bottom;
		return height*width;
	}

	public static void main(String[] args) {
		Point<Integer, Double > p1 = new Point<>(30,4.0);
		Point<Integer, Double > p2 = new Point<>(20,8.0);
		System.out.println(makeRectangle(p1,p2));
	}
}

package sec1;

public class Generic1<T> {
	private T field1;
	public Generic1() {
		
	}
	public Generic1(T field1) {
		super();
		this.field1 = field1;
	}
	public T getField1() {
		return field1;
	}
	public void setField1(T field1) {
		this.field1 = field1;
	}
	
}

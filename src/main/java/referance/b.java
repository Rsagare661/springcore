package referance;

public class b {
	private int x;
	private a obj;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public a getObj() {
		return obj;
	}
	public void setObj(a obj) {
		this.obj = obj;
	}
	public b() {
		super();
		// TODO Auto-generated constructor stub
	}
	public b(int x, a obj) {
		super();
		this.x = x;
		this.obj = obj;
	}
	@Override
	public String toString() {
		return "b [x=" + x + ", obj=" + obj + "]";
	}
	
}

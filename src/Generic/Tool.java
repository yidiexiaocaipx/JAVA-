package Generic;

public class Tool<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	public <W> void show(W str)
	{
		System.out.println(str);
	}
	public void print(T str)
	{
		System.out.println(str);
	}
	

}

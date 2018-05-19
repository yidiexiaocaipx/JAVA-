package Generic;

public class A<T> {
	private T info;
	A(T info)
	{
		this.info=info;
	}
    public void set(T info)
    {
    	this.info=info;
    }
    public T get()
    {
    	return info;
    }
}


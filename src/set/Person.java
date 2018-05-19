package set;

public class Person implements Comparable<Object>{
	private String name;
	private int age;

	 public Person(String name, int age) {
		 this.name=name;
		 this.age=age;
	}

	public String getName() {
		return name;
	}
	
@Override
	public int hashCode() {
//	   System.out.println("....hashcode");
		return name.hashCode()+age;
	}
//
//	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(!(obj instanceof Person) )
			throw new ClassCastException("¿‡–Õ¥ÌŒÛ");
		Person p=(Person) obj;
//		System.out.println("....equals");
		return this.name.equals(p.name) && this.age==p.age;
//		return false;
	}
	public String toString()
	{
		return name+":"+age;
	}

	//	public void setName(String name) {
//		this.name = name;
//	}
	public int getAge() {
		return age;
	}
	public int compareTo(Object o)
	{
		Person p=(Person) o;
		int temp=this.age-p.age;
		return temp==0? this.name.compareTo(p.name): temp;
//		int temp=this.name.compareTo(p.name);
//		return temp==0? this.age-p.age:temp;
//		if (p.age<this.age)
//			return -1;
//		else if (p.age>this.age)
//			return 1;
//		else 
//		{
//			return this.name.compareTo(p.name);
//		}
//			return 0;
	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	

}

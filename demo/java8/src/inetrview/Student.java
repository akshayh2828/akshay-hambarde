package inetrview;

public class Student {
	private int id;
	private String name;
	private Addresss addresss;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, Addresss addresss) {
		super();
		this.id = id;
		this.name = name;
		this.addresss = addresss;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Addresss getAddresss() {
		return addresss;
	}
	public void setAddresss(Addresss addresss) {
		this.addresss = addresss;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addresss=" + addresss + "]";
	}
	
}

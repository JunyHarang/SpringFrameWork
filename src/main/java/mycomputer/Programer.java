package mycomputer;

public class Programer {
	private String name;
	private String address;
	private Computer computer;
	
	
	public Programer(String name, String address, Computer computer) {
		super();
		this.name = name;
		this.address = address;
		this.computer = computer;
	}

	@Override
	public String toString() {
		return "Programer [name=" + name + ", address=" + address + ", computer=" + computer + "]";
	}
	
	
	
}

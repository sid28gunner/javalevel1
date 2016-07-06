package Interface;

public class powerpoint implements office{

	@Override
	public void save() {
		System.out.println("Save ppt file");
		
	}

	@Override
	public void open() {
		System.out.println("Open ppt file");
	}

	@Override
	public void saveas() {
		System.out.println("Saveas ppt file");
		
	}

	@Override
	public void print() {
		System.out.println("Print ppt file");
		
	}

}

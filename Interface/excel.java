package Interface;

public class excel implements office {

	@Override
	public void save() {
		System.out.println("Save excel file");
		
	}

	@Override
	public void open() {
		System.out.println("Open excel file");
		
	}

	@Override
	public void saveas() {
		System.out.println("Saveas excel file");
		
	}

	@Override
	public void print() {
		System.out.println("Print excel file");
		
	}
	

}

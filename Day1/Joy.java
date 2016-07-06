package Day1;

public class Joy {

	public static void main(String[] args) {
		Dog jack=new Dog();
		jack.setBreed("Labrador");
		System.out.println(jack.getBreed());
		
		jack.setAge(6);
		jack.setHeight(50);
		jack.setColor("Brown");
		
		jack.bark();
		jack.run();
		jack.bite();
		
		int future_age=jack.future_age();
		System.out.println(future_age);
	}

}

package Day2;

public class StaticvarDriver {

	public static void main(String[] args) {
		staticvar a=new staticvar();
		staticvar b=new staticvar();
		staticvar c=new staticvar();
		
		a.staticincrement();
		b.normalincrement();
		System.out.println(c.getstaticincrement());
		System.out.println(c.getnormalincrement());
		
		a.staticincrement();
		b.normalincrement();
		System.out.println(c.getstaticincrement());
		System.out.println(c.getnormalincrement());
		
		a.staticincrement();
		b.normalincrement();
		System.out.println(c.getstaticincrement());
		System.out.println(c.getnormalincrement());
		
		System.out.println(c.getstaticincrement());
		System.out.println(c.getnormalincrement());
		

	}

}

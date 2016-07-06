package Day2;
/*
 * Static methods are one per class and not one per object.
 * Static methods are always executed once.
 */
public class staticvar {
 static int a;
 int b;
 
 public void staticincrement()
 {
	 a++;
 }
  
 public void normalincrement()
 {
	  ++b;
 }
 
 /*
  * Static methods are always executed one time only whether you call them or not.
  */
 static
 {
	 System.out.println("This method will execute one time only");
 }
 
 
 public int getstaticincrement()
 {
	 return a;
 }
 public int getnormalincrement()
 {
	 return b;
 }
}


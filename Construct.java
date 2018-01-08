package classes;

//public class Construct {
	
//	void Construct(){
//		System.out.println("bike is created");
//	}
//
//	public static void main(String[] args) {
//		Construct a = new Construct();
//	
//
//	}
//
//}
//
// default constructor

// public class Construct{
//	 
//	 int id;
//	 String name;
//	 
//	 void display (){
//		 System.out.println(id+""+name);
//	 }
//	 public static void main(String[] args){
//		 Construct a = new Construct();
//		 a.display();
//			 }
// }
 
 //parameterized constructer
 
//  public class Construct{
//	 int id ;
//	 String name;
// 
//	  Construct(int i,String n){
//		  id=i;
//		  name=n;
//	  }
//	  void display(){
//		  System.out.println(id+" "+name);
//	  }
//	  public static void main(String[] args){
//		 Construct a = new Construct(001,"abc");
//		 Construct a1 = new Construct(002,"def");
//         a.display();
//         a1.display();
//	  }
// }




public class Construct{
	 int id ;
	 String name;
     int age; 
	  Construct(int i,String n){
		  id=i;
		  name=n;
	  }
	  Construct(int i,String n,int a){
		  id=i;
		  name=n;
		  age =a;
	  }
	  void display(){
		  System.out.println(id+" "+name+" "+age);
	  }
	  public static void main(String[] args){
		 Construct a = new Construct(001,"abc");
		 Construct a1 = new Construct(002,"def",25);
       a.display();
       a1.display();
	  }
}
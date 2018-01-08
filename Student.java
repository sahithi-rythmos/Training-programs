package classes;

public class Student {
	int id ;
	String name;
 
	void insert(int i,String s)
	{
		id=i;
		name =s;
	}
  void display()
  {
	  System.out.println(id+" "+name);
  }
    public static void main(String[] args){
		Student s = new Student();
		Student s1=new Student();
		s.insert(101,"abc");
		s1.insert(102,"qwerty");
		s1.display();
		s.display();
		
	}
}

	


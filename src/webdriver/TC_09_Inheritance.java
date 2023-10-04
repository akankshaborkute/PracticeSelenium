package webdriver;

class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}
	int a=10;
	void m1() {
		System.out.println("scooter");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child Constructor");
	}
	int a=20;
	void m1() {
		System.out.println("Cycle");
		System.out.println("child a="+a);
		System.out.println("super a="+super.a);
		super.m1();
	}
}
public class TC_09_Inheritance {
public static void main(String[] args){
	System.out.println("main class");
	Child obj=new Child();
	obj.m1();
//	obj.m2();
//	System.out.println(a);
//	System.out.println(b);

}
}


package cn.crxy.reflect;

public class Student {

	
		private String name;
		
		public void setName(String name){
			this.name=name;
			//System.out.println(name);
		}
		
		public String getName(){
			return name;
	}
		public int id;
		
		public void test(){
			System.out.println("ce   shi ");
		}
		public void test2(String s){
			System.out.println("ce   shi "+s);
		}
		
		public Student(){}
		public Student(String name){
			System.out.println("带参构造  "+name);
		}
		
		public Student(String name,int id){
			System.out.println("带两个构造执行"+name+"-----"+id);
		}
		

}

package cn.crxy.reflect;

import java.lang.reflect.Constructor;

public class ClassDemo2 {

	public static void main(String[] args) throws Exception {
		//获取class对象。开始反射
		
		//操作一：根据对象动态进行实例的创建
		Class c1 = Class.forName("cn.crxy.reflect.Student");
		
		//class类中提供了函数：可以帮助使用student类中默认构造
//		Object o1 = c1.newInstance();
//		Student s1=(Student)o1;
//		System.out.println();

		//带参构造.1.获取带参构造并传递参数的class对象.把构造获取到co2
		Constructor co2 = c1.getConstructor(String.class,int.class);
		
		//co2动态执行创建
		Object o1 = co2.newInstance("zhangsan",10);
		System.out.println(o1);
	}

}

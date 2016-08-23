package cn.crxy.reflect;

public class ClassDemo1 {

	public static void main(String[] args) throws Exception {
		// 反射：   动态的操作class类对象
		
		//1.先获取内存中的Student对象
		
		//方式一：c1对象就是student类
		Class c1=Student.class;
		
		//方式二
		
		//方式三：知道类名-----》得到类	不依赖文件，常用于获取class对象方法
		//在程序加载类文件的时候，从项目根目录下寻找
		Class c3 = Class.forName("cn.crxy.reflect.Student");
		
		System.out.println(c3);

	}

}

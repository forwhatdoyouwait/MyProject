package cn.crxy.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassDemo3 {

	public static void main(String[] args) throws Exception {
		// 使用反射对student类中其他属性 与其他函数进行操作
		
		//1.获取Student.class对象
		Class c1 = Class.forName("cn.crxy.reflect.Student");
		//使用默认构造
		Object o1 = c1.newInstance();
		//2.根据c1去获取其中所有属性
		Field f = c1.getField("id");
//		Field[] fs = c1.getFields();
		//获取私有属性
		Field  df= c1.getDeclaredField("name");
//		Field[] dfs = c1.getDeclaredFields();
		
		//属性Field	取值、赋值
		f.setInt(o1, 2);	//obj:指对象。i：指属性值
		
		int value = f.getInt(o1);
		System.out.println(value);
		
		//3、根据c1去获取其中所有函数
		Method m1 = c1.getMethod("test",String.class);
//		Method[] methods = c1.getMethods();
		
		System.out.println(m1);
		
		//动态操作函数：返回值=invoke（对象，实参）	如果牵扯静态函数，则不需要指定实例
		Object invoke = m1.invoke(o1, "zhangsan");
		System.out.println("返回："+invoke);
		
		
		
		
		
		
	}

}

package cn.crxy.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassDemo3 {

	public static void main(String[] args) throws Exception {
		// ʹ�÷����student������������ �������������в���
		
		//1.��ȡStudent.class����
		Class c1 = Class.forName("cn.crxy.reflect.Student");
		//ʹ��Ĭ�Ϲ���
		Object o1 = c1.newInstance();
		//2.����c1ȥ��ȡ������������
		Field f = c1.getField("id");
//		Field[] fs = c1.getFields();
		//��ȡ˽������
		Field  df= c1.getDeclaredField("name");
//		Field[] dfs = c1.getDeclaredFields();
		
		//����Field	ȡֵ����ֵ
		f.setInt(o1, 2);	//obj:ָ����i��ָ����ֵ
		
		int value = f.getInt(o1);
		System.out.println(value);
		
		//3������c1ȥ��ȡ�������к���
		Method m1 = c1.getMethod("test",String.class);
//		Method[] methods = c1.getMethods();
		
		System.out.println(m1);
		
		//��̬��������������ֵ=invoke������ʵ�Σ�	���ǣ����̬����������Ҫָ��ʵ��
		Object invoke = m1.invoke(o1, "zhangsan");
		System.out.println("���أ�"+invoke);
		
		
		
		
		
		
	}

}

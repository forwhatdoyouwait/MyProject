package cn.crxy.reflect;

public class ClassDemo1 {

	public static void main(String[] args) throws Exception {
		// ���䣺   ��̬�Ĳ���class�����
		
		//1.�Ȼ�ȡ�ڴ��е�Student����
		
		//��ʽһ��c1�������student��
		Class c1=Student.class;
		
		//��ʽ��
		
		//��ʽ����֪������-----���õ���	�������ļ��������ڻ�ȡclass���󷽷�
		//�ڳ���������ļ���ʱ�򣬴���Ŀ��Ŀ¼��Ѱ��
		Class c3 = Class.forName("cn.crxy.reflect.Student");
		
		System.out.println(c3);

	}

}

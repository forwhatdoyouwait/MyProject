package cn.crxy.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo3 {


	public static void main(String[] args) {
		// Pattern:正则实例		Matcher：正则操作引擎
		
		//编写正则并编译成Pattern实例
		Pattern pt = Pattern.compile("[0-9]{5,10}");
		
		//根据正则实例获取操作引擎
		Matcher m = pt.matcher("23QQ1123QQ:46984056QQ:46984yy056QQ:46984056");
		
		
		//根据引擎进行相关使用操作
		
		//1.对整个字符序列进行匹配
		//boolean r = m.matches();
		
		//2.对字符串从头开始匹配，没有完全匹配序列，但只从开始位置匹配
//		boolean r = m.lookingAt();
		
		//3.find() 按照正则开始从头开始匹配，可重复find匹配，下一次的匹配是从上一次结尾开始
//		boolean r = m.find();
		
		while (m.find()){
			//进行信息获取
			int start = m.start();
			int end = m.end();
			String group = m.group();
			
			
			System.out.println(start+"-------"+end+"-----"+group);
		}
		
		

		
	}

}

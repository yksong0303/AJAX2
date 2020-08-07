package test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		String url = "/html/test.html";
		
		int idx = url.lastIndexOf(".");
		
		String ext = url.substring(idx+1,url.length());
		System.out.println(ext);
		List<String> excludePatterns = new ArrayList<>();
		excludePatterns.add("html");
		excludePatterns.add("css");
		excludePatterns.add("js");
		if(excludePatterns.indexOf(ext)!=-1) {
			System.out.println("필터 로직 처리 안함!");
		}else {
			System.out.println("필터 로직 처리함!");
		}
	}
}

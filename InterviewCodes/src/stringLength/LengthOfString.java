package stringLength;

import java.util.List;

public class LengthOfString {
/*
 * Given a list of String find out no. of Strings which length is greater Than 3
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list= List.of("php", "Java", "WebTech", "bb", "Python", "Allu", "Html", "Css", "Pearl", "Ruby");

long count =list.stream().filter(e->e.length()>3).count();
System.out.println(count);
	}

}

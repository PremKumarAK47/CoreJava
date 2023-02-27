
package answerOneAgain;



/**
 * @author Prem
 *
 */
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
        student1.setRoll(1);
        student1.setName("John");
        student1.setAge(2);
        student1.setMarks(80);
        
        Student student2 = new Student(2, "Mary", 35, 90);
        
        System.out.println(student1);
        System.out.println(student2);
		
		

	}

}

package answer.four;


public class NumberPrinter {
	
	
    public void printNumber(int num) 
    {
        if (num < 0) 
        {
            System.out.println("Error");
        }
        else if (num % 2 == 0) 
        {
            System.out.println((num / 10 + 1) * 10);
        } 
        else 
        {
            System.out.println(num);
        }
    }

    public static void main(String[] args) 
    {
        NumberPrinter printer = new NumberPrinter();

        printer.printNumber(44); // Output: 50
        printer.printNumber(45); // Output: 45
        printer.printNumber(-5); // Output: Error
    }
}

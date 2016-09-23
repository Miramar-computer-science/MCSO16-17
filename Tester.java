++++package number;

public class Tester 
{
	public static void main(String[] args)
	{
		int testNum = 1111;
		int multNum = 1;
		
		
		for(int j = 0; j < 10; j++)
		{
			for(int i = 0; i < 10000; i++)
			{
				String numStr = "" + testNum;
				char A = numStr.charAt(0);
				char B = numStr.charAt(1);
				char C = numStr.charAt(2);
				char D = numStr.charAt(3);
				String key = "" +  D + C + B + A;
				int password = Integer.parseInt(key);
				
				int product = testNum * multNum; 
				
				if (product == (password))
				{
					System.out.println(testNum + " * " + multNum + " = " + password);
					
				}
				testNum++;
			}//end for
			multNum++;
			testNum = 1111;
		}//end for
	}//end main
}

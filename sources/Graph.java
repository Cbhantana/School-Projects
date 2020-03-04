public class Graph
{
	public static void Graph()
	{
		for (int i = -10; i <= 10; i++) 
	   {
           for (int j = 0; j <= i * i; j++)
		   {
               if (j == i * i)
			   {
                   System.out.println("*");
               }
			   else
			   {
                   System.out.print(" ");
               }
		   }
	   }
	}
	
	
	public static void Draw2()
	{
		int space=0;
		int x_min=-10;
		int x_middle=-1;
		for (int x=x_min; x<=x_middle; x++)
		{
			for (space=0; space<=Math.abs(x_min)-Math.abs(x); space++)
				if (space!=0)
					System.out.print(" ");
				System.out.print("*");
				for (space=0; space<=2*(Math.abs(x)- Math.abs(x_middle))-1; space++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
				if (space==2*(Math.abs(x)-Math.abs(x_middle))-1)
					System.out.print("\b");
				System.out.println();
				for (int k=0; k<(Math.abs((x+1) -(x)/2)); k++)
					{
					System.out.println();
					}
       }
	}
	
	public static void main(String[] args)
	{
		Draw1();
		Draw2();    
		System.out.println();
    }
}
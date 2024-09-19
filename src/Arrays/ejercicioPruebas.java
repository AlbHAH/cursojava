package Arrays;

public class ejercicioPruebas {
	public static void main(String[]args) {
	
		
		int t[][]=new int[5][5];
		 int i,j;
		 for (i=0;i<5;i++)
		 for (j=0;j<5;j++)
		 if (i==j)
			 
		 t[i][j] = 1;
		 else
			 t[i][j] = 0;
		 
		 System.out.println ("Matriz:");
		 for (i=0;i<5;i++)
		 {
		 for (j=0;j<5;j++)
		 System.out.print(t[i][j]+" ");
		 System.out.println ();
	}
	}
}
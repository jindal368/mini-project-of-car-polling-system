import java.util.*;

public class project {
	public static int i=0;
	public static int j=0;
	public static int k=0;
    public	static int l=0;
	public static String[] namear=new String[100];
	public static String[] srcar=new String[100];
	public static String[] destar= new String[100];
	public static void entry()
	{
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter name");
         namear[j]=sc.next();
         j++;
         //enter Source.....
          
         System.out.println("Enter Source");
         srcar[k]=sc.next();
         k++;
         //enter destination..
          
         System.out.println("Enter Destination");
         destar[l]=sc.next();
         l++;
         
         
	}
        public static void show()
	{   int t=0; 
		System.out.print("{");
          for(int m=0;m<j;m++)
          {  t=0;
          	for(int n=m+1;n<j;n++)
          	{
          		if((srcar[m].equals(srcar[n]))&&(destar[m].equals(destar[n])))
          		{   if(t==0)
          			{
          				System.out.print("("+namear[m]+" , "+srcar[m]+" , "+destar[m]+"),");
                         t++;
                     }
          			System.out.print("("+namear[n]+" , "+srcar[n]+" , "+destar[n]+")");
          			m=n-1;
          		}
          		 
          		
          	}
          }System.out.println("}");
	}

	public static void main(String[] args) {
        while(i==0){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter choice---");
         System.out.println("1.Enter Journey Details");
          System.out.println("2.Show Combinations");
           System.out.println("3.Exit");
          int ch=ob.nextInt();
          switch(ch)
        {
        	case 1:   entry();
                       break;
            case 2:   show();
                       break;
            case 3:   i=1;
        }
        
    }
		
	}
}
import java.util.*;

public class problem_3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = s.nextInt();
        if(a%2!=0)
        {
            for(int i=0;i<2*a;i++)
            {
                if(i%2!=0)
                {
                    if(i<2*a-1)
                    {
                        System.out.print(i+", ");
                    }
                    else
                    {
                        System.out.print(i);
                    }
                }
            }
            
        }
        else
        {
            a=a-1;
             for(int i=0;i<2*a;i++)
            {
                if(i%2!=0)
                {
                    if(i<2*a-1)
                    {
                        System.out.print(i+", ");
                    }
                    else
                    {
                        System.out.print(i);
                    }
                }
            }
        }
    }
}

public class problem_4 {
    public static void main(String args[]) {
        int num[] = {1,2,3,4,5,6,7,8,9};
        int input[] = {1,2,8,9,12,46,76,82,15,20,30};
        int count=0;
        int[] total = new int[num.length]; 
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<input.length;j++)
            {
                if(input[j]%num[i]==0)
                {
                    count++;
                }
            }
            total[i]=count;
            count=0;
        }
        System.out.print("{ ");
        for(int i=0;i<total.length;i++)
        {   
            if(i<total.length-1)
            {
                System.out.print(num[i]+" : "+total[i]+", ");
            }
            else
            {
                System.out.print(num[i]+" : "+total[i]);   
            }
        }
        System.out.print("}");
    }
}
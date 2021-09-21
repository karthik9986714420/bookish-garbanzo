import java.util.Scanner;
public class problem_2 {
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        System.out.println("enter a");
        int a=sn.nextInt();
        
    
        for(int i=1;i<=a*2;i++){
            if(i%2!=0){
                System.out.print(i+",");
                
            
            }
            System.out.println();

        }
    }
   
    
}

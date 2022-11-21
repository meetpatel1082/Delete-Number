import java.util.Scanner;
public class Delete 
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the length of integer array needed: ");
        int a= s.nextInt();
        int[] result= new int[a];
        System.out.println("Enter the elements of integer array: ");
        for(int i=0; i<result.length;i++)
        {
            result[i]= s.nextInt();
        }
        System.out.println("Enter the number to delete: ");
        int number= s.nextInt();
        int temp=0;
        for(int i=0; i<result.length;i++)
        {
            if(result[i]==number)
            {
                temp=temp+1;
            }
        }  
        int[] result2= new int[a-temp];
        int var=0;
        for(int i=0; i<result.length;i++)
        {
            if(result[i]==number)
            {
                var=var+1;
            }
            else
            {
                result2[i-var]=result[i];
            }  
        }
        for(int i=0;i<result2.length;i++)
        {
            System.out.println(result2[i]);
        }
    }
}
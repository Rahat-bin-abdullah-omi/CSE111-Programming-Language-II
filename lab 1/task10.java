import java.util.Scanner;
public class task10
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        for(int lineCount=1;lineCount<=line;lineCount++)
        {
            for(int spCount=1;spCount<=line-lineCount;spCount++)
            {
                System.out.print(" ");
            }
            for(int colCount=line-(lineCount-1);colCount<=line;colCount++)
            {
                if (lineCount == 1 || lineCount == 2 || lineCount == line)
                    System.out.print(colCount);
                else {
                    if(colCount == line-(lineCount-1) || colCount == line){
                        System.out.print(colCount);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
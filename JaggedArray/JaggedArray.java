import java.util.Scanner;
class JaggedArray
{
    public static void main(String args[]){
        int[][] JaggedArray;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no.of Rows for Jagged Array");
        int numRows=sc.nextInt();
        JaggedArray=new int[numRows][];
        for(int i=0;i<numRows;i++){
            System.out.print("Enter no.of Columns for Rows"+i+":");
            int numCols=sc.nextInt();
            JaggedArray[i]=new int[numCols];
        }
        for(int i=0;i<JaggedArray.length;i++)
        {
            for(int j=0;j<JaggedArray[i].length;j++)
            {
                System.out.print("Enter the elements at ["+i+"]["+j+"]:");
                JaggedArray[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<JaggedArray.length;i++)
        {
            for(int j=0;j<JaggedArray[i].length;j++)
            {
                System.out.print(JaggedArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
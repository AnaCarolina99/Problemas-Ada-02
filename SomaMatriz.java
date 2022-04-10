import java.util.Scanner;
public class SomaMatriz{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int l=0; int c=0;
        l=s.nextInt();
        c=s.nextInt();
        
        int[][] m1=new int[l][c];
        int [][]m2=new int[l][c];
        
        for(int i=0;i<l;i++){
          for(int j=0;j<c;j++){
               m1[i][j]=s.nextInt();
          }
        }
        for(int i=0;i<l;i++){
          for(int j=0;j<c;j++){
               m2[i][j]=s.nextInt();
          }
        }
        
        
        int [][]soma=new int[l][c];
        
         for(int i=0;i<l;i++){
          for(int j=0;j<c;j++){
               soma[i][j]=m1[i][j]+m2[i][j];
          }
        }
        for(int i=0;i<l;i++){
          for(int j=0;j<c;j++){
        System.out.print(soma[i][j]);
         }
         }
        
        
    }
}
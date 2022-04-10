import java.util.ArrayList;
import java.util.Scanner;

public class ArayList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<String> agenda = new ArrayList();
        agenda.add("Ana Carolina; 11 1111-1111");
        agenda.add("Deolinda; 22 2222-2222");

        int n = agenda.size();
        for(int i = 0;i<n;i++){
            System.out.println("Posicao: "+ i +" Contato: "+ agenda.get(i));
        }

        int j = 1;
        agenda.remove(j);

        System.out.println("==========Depois de ter deletado==========");
        int i = 0;
        for(String selena: agenda){
            System.out.println("Posicao: "+ i +" Contato: "+ selena);
            i++;
        }
    }    
        
}
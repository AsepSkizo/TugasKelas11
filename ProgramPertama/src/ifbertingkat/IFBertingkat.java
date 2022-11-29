package ifbertingkat;
import java.util.Scanner;

public class IFBertingkat {
    public static void main(String [] args)
    {
        int nilai1, nilai2, nilai3;
        
        Scanner key = new Scanner(System.in);
        System.out.println("Masukkan Nilai 1 : ");
        nilai1 = key.nextInt();
        System.out.println("Masukkan Nilai 2 : ");
        nilai2 = key.nextInt();
        System.out.println("Masukkan Nilai 3 : ");
        nilai3 = key.nextInt();
        
        
        if(nilai1 > nilai2)
        {System.out.println("Nilai 1 lebih besar dari nilai 2");}
        else if (nilai2 > nilai1)
        {System.out.println("Nilai 2 lebih besar dari nilai 1");}
        if(nilai1 > nilai3)
        {System.out.println("Nilai 1 lebih besar dari nilai 3");}
        else if(nilai3 > nilai1)
        {System.out.println("Nilai 3 lebih besar dari nilai 1");}
        if(nilai2 > nilai3)
        {System.out.println("Nilai 2 lebih besar dari nilai 3");}
        else if(nilai3 > nilai2)
        {System.out.println("Nilai 3 lebih besar dari nilai 2");}
    }
}

package programvariabel;

public class ProgramVariabel {
    //Luas Trapesium
        public static void main(String [] args)
        {
            int bilangan = 80;
            System.out.println(bilangan);
            int atas = 60;
            int bawah = 7;
            int tinggi = 2;        
            int luas = (atas + bawah) * tinggi / 2; 
            System.out.println(luas);
            
    //Keliling Trapesium
           int miring1 = 4;
           int miring2 = 6;
           int keliling = atas + bawah + miring1 + miring2;
           System.out.println(keliling);
           
        }
}

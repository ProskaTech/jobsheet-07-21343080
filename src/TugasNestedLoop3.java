/*
 * Created by 21343080_Andi Sultan Al Ayyubi
 */

public class TugasNestedLoop3 {
    public static void main(String[] args){
        int baris,kolom;
        int maks=5;
        
        for(baris =1 ; baris <=maks ; baris++){
            for (kolom =1;kolom<=baris;kolom++){
                System.out.print(baris);
            }
            System.out.println("");
        }
    }
}

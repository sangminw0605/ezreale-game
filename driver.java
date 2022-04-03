import java.util.*;
import java.io.*;

public class driver {

    final int CHAMP_SIZE = 159;
    
    public static void main(String[] args) {
        champList list = new champList();

       
        try {
            File in = new File("data.txt");
            Scanner scan = new Scanner(in);
            for(int i = 0; i < 1; i++) {
                String champName = scan.next();
                String champRegion = scan.next();
                String champRole = scan.next();
                String champLane = scan.next();
                int champCost = scan.nextInt();
            
                list.addChamp(champName, champRegion, champRole, champLane, champCost);
            }
            scan.close();   
            System.out.println(list.getChamp("Aatrox"));
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }

    }
}

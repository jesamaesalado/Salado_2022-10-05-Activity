import java.util.Scanner;
public class Salado {
    public static void main(String[] args){
        String myfavoriteperfume[] = {"juicy", "victoria secret", "calvin klein", "gucci", "versace"};
        Scanner Scan = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("   Ola! I am Sam sam ");
        System.out.println("You want me? I mean you want to know my top 5 favorite perfumes? well----ARAT NA! ");
        System.out.println(" ");
        System.out.println("  HERE ARE THE LIST OF MY FAV. PERFUMES!");
        System.out.println("       =============>>>>>>>>>> ");
        System.out.println("       =           = ");
        System.out.println("       = 0 1 2 3 4 5 = ");
        System.out.println("       =           = ");
        System.out.println("       <<<<<<<<<<<<<============= ");
        System.out.println(" ");
        System.out.print("Enter any number that will contain the list of my favorite perfume^__*: ");
        int choice = Scan.nextInt();
        try{
            if(choice < 0){
                Scan.close();
                System.out.println(" ");
                throw new PerfumeException("The Index is negative, there is no such index in the menu!");
            }if(choice > 4){
                Scan.close();
                System.out.println(" ");
                throw new PerfumeException("There is no number "+ choice +" PASAYLOA GWAPA RA AKONG AMBAG:(!");
            }
            System.out.println(" ");
            System.out.println("Yey! " + myfavoriteperfume[choice] +" is one of my favorites. I love it" + ".");
        }catch(PerfumeException e){
            System.out.println(e.getMessage());
        }
        Scan.close();
    }
}

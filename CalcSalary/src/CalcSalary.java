import java.util.Scanner;

public class CalcSalary {
    public static void main(String[] args){
        System.out.println("how much do you earn a year");
        Scanner scan = new Scanner(System.in);
        int dochodb = scan.nextInt();
        scan.close();
        int dochodn;
        int i = 0;
        int[] tab = new int[4];
        for(String arg: args) {
            tab[i] = Integer.parseInt(arg);
            i++;
        }
        if(dochodb<tab[2]){
            dochodn = dochodb*(100-tab[0])/100;
        }else{
            dochodn = (tab[2]*(100-tab[0])+(dochodb-tab[2])*(100-tab[1]))/100;
        }
        System.out.println(dochodn);
    }
}
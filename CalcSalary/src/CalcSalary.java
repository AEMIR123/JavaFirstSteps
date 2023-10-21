public class CalcSalary {
    public static void main(String[] args){
        int incomeNet;
        int incomeGross = Integer.parseInt(args[0]);
        if(incomeGross<12000){
            incomeNet = incomeGross*88/100;
        }else{
            incomeNet = (12000*88+(incomeGross-12000)*68)/100;
        }
        System.out.println(incomeNet);
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("> Part 1, PH");
        double[] hydrogen = {0,0,3.56e-3, 4.85e-7,5.1e-1,8.34e-14,7.24e-2,2.89e-12,9.86e-4,6.96e-9};
        for(int i = 0; i < hydrogen.length; i++)
        {
            System.out.println("PH: " + DoMath(hydrogen[i]));
        }

        System.out.println("\n> Part 2, H+");

        double[] PH = {12.9,8.75,3.26,1.9,6.85,2.8,11.7,13.4,3.46,5.79};
        for(int i = 0; i < PH.length; i++)
        {
            System.out.println("H+: " + FindHydrogen(PH[i]));
        }

        System.out.println("\n> Part 3, PH");
        double[] OH = {1.2e-5,7.02e-8,3.56e-3,4.85e-7,5.1e-1,8.34e-14,7.24e-2,2.89e-12,9.86e-4,6.97e-9};
        for(int i = 0; i < OH.length; i++)
        {
            System.out.println("PH: " + FindPH2(OH[i]));
        }

    }
    public static double DoMath(double input)
    {
        return -Math.round((Math.log(input)/Math.log(10)) * 10.0) / 10.0;
    }
    public static String FindHydrogen(double PH)
    {
        return String.format("%.2E", Math.pow(10,-PH));
                //2e-9
    }
    public static  double FindPH2(double OH) {
        double valRaw = 14 - (-Math.round((Math.log(OH)/Math.log(10)) * 10.0 )/10.0);
        return Math.round(valRaw * 10) / 10.0;
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //assignment:
        // https://docs.google.com/spreadsheets/d/11it3Ai7tgGr1UgyY_G4b3jf6NFQFZ33cSz69VnEZmPk/copy?usp=sharing

        //Part 1, [H+] to PH.
        //Formula: PH = -log([H+])
        System.out.println("> Part 1, PH");
        double[] hydrogen = {1.2e-5,7.02e-8,3.56e-3, 4.85e-7,5.1e-1,8.34e-14,7.24e-2,2.89e-12,9.86e-4,6.96e-9};
        for (double v : hydrogen) {
            System.out.println("PH: " + Part1(v));
        }

        //Part 2, PH to [H+]
        //Formula: [H+] = 10^-PH
        System.out.println("\n> Part 2, H+");
        double[] PH = {12.9,8.75,3.26,1.9,6.85,2.8,11.7,13.4,3.46,5.79};
        for (double v : PH) {
            System.out.println("H+: " + Part2(v));
        }

        //Part 3, [OH-] to PH
        //Formula: PH = 14 - log(OH)
        System.out.println("\n> Part 3, PH");
        double[] OH = {1.2e-5,7.02e-8,3.56e-3,4.85e-7,5.1e-1,8.34e-14,7.24e-2,2.89e-12,9.86e-4,6.97e-9};
        for (double v : OH) {
            System.out.println("PH: " + Part3(v));
        }

    }
    public static double Part1(double input)
    {
        return -Math.round((Math.log(input)/Math.log(10)) * 10.0) / 10.0;
    }
    public static String Part2(double PH)
    {
        return String.format("%.2E", Math.pow(10,-PH));
                //2e-9
    }
    public static  double Part3(double OH) {
        double valRaw = 14 + (Math.log(OH)/Math.log(10));
        return Math.round(valRaw * 10) / 10.0; //round to tenths place
    }
}
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double weight;
        double height;
        double imt;
        double idealWeight;
        int age;
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your weight");
        str = scanner.nextLine();
        weight = Double.parseDouble(str);
        System.out.println("input your height in meters");
        str = scanner.nextLine();
        height = Double.parseDouble(str);
        System.out.println("input your age");
        str = scanner.nextLine();
        age = Integer.parseInt(str);
        imt = weight / (height * 2) ;
        idealWeight = 24.9 * (height * 2);
        if (imt > 24.9){
            System.out.println("Index body mass "+ imt + " Ideal weight " + idealWeight);
            System.out.println("Recomenndation to decrease your weight. Ideal weight is " + idealWeight + " Need to get rid of " + (weight - idealWeight) + " Recommend calories " + (66.4730 +(13.7516 * weight) + (1.8496 * (height * 100) ) - (4.6756 * age) - 500 ) );

        } else if (imt < 18.5){
            System.out.println("Index body mass "+ imt + " Ideal weight " + idealWeight);
            System.out.println("Recomenndation to increase your weight. Ideal weight is " + idealWeight + " Need to get " + (idealWeight - weight) + " Recommend calories " + (66.4730 +(13.7516 * weight) + (1.8496 * (height * 100)  ) - (4.6756 * age) + 500 ) );

        }
        else{
            System.out.println("Index body mass "+ imt + " Ideal weight " + idealWeight);
            System.out.println("Your weight is normal " + "Recommend calories " + (66.4730 +(13.7516 * weight) + (1.8496 * height * 100 ) - (4.6756 * age) + 500 ) );
        }


    }
}
import java.util.Scanner; 
public class Main{
    public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
        double height =sc.nextDouble();
        double weight =sc.nextDouble();
        double bmi =weight / (height*height);

        System.out.println(Math.round(bmi*100)/100.0);
	
	double height2 =sc.nextDouble();
	double weight2 =sc.nextDouble();
	double bmi2 =weight2 / (height2*height2);

	System.out.println(Math.round(bmi2*100)/100.0);
        


    }
}

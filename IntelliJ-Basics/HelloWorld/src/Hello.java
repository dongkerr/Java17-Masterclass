public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Keke");
        boolean isAlien = false;
        if (isAlien==false) {
            System.out.println("It is not an alien!");
            System.out.println(("And I am scared of aliens"));
        }

        int topScore = 80;
        if (topScore != 100){
            System.out.println("You got the high score!");
        }

        int secondScore = 81;
        if (topScore > secondScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100");
        }

        if(topScore > 90 || secondScore <= 90){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar){
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if(isDomestic){
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double var1 = 20.00d;
        double var2 = 80.00d;
        double var3 = (var1 + var2) *100.00d;
        double var4 = var3 % 40.00d;
        boolean isZero = var4 == 0.00 ? true : false;
        System.out.println(isZero);
        if(!isZero){
            System.out.println("got some remainder");
        }
    }
}

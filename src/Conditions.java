public class Conditions {

    public static void main(String[] args) {

        int testScore=95;

        if(testScore>50){
            System.out.println("Congratulations you passed the test");
        } else if (testScore ==50){
            System.out.println("Sorry - we are not sure if you passed");
        } else {
            System.out.println("Sorry - you failed the test");
        }

        switch(testScore) {
            case 0:
                System.out.println("Did you even take the test?");
                break;
            case 100:
                System.out.println("You got top marks");
                break;
            default:
                System.out.println("You didn't do anything special");
                break;
        }

        int maxScore=100;

        if (testScore>50 && testScore<maxScore){
            System.out.println("You passed but didn't get full marks.");
        }

        if (testScore<10 || testScore>90){
            System.out.println("You are on the upper/ lower range.");
        }

        if (testScore!= 100){
            System.out.println("You didn't get full marks.");
        }
        System.out.println("*****$$$$$*********");
    }
}

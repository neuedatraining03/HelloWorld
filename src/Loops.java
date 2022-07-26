public class Loops {

    public static void main(String[] args) {

        for (int i=50; i<=55; i++){

            System.out.println(i*3);

        }
        System.out.println("************************************");
        int number[]={12,16,9,4,22,104,66,8,222};
        for (int i=0; i<number.length; i++){
            System.out.println(number[i]);
        }

        int counter=0;
        while (counter<10){
            System.out.println("Hello");
            counter++;
        }
        System.out.println("EXIT");

        int selectedNumbers[]={4,3,5,8,9,7,2,1,6,0};
        int counter1=0;
        while (selectedNumbers[counter1]<7){
            System.out.println(selectedNumbers[counter1]);
            counter1++;
        }

        int myAge=26;
        do{
            System.out.println("You are young");
            System.out.println(myAge);
            myAge++;
        }while (myAge<20);
        System.out.println(myAge);

    }

}

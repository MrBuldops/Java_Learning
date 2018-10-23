package Tomasz_Nowak;

public class Main {

    public static void main(String[] args) {
	// write your code here

        PhoneNumber number = new PhoneNumber("123 43534-6 -123456  123-7-8-9121112321");
        number.ClearNumber();
        System.out.println(number.PureNumber);
        System.out.println(number.FinalNumber);
    }


}

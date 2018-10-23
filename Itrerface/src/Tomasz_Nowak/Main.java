package Tomasz_Nowak;

public class Main {

    public static void main(String[] args) {


        ITelephone TomPhone;
        TomPhone = new DeskPhone(123345);
        TomPhone.powerOn();
        TomPhone.callPhone(123345);
        TomPhone.answer();
        TomPhone =new MobilePhone(987654);
        //TomPhone.powerOn();
        TomPhone.callPhone(987654);
        TomPhone.answer();
    }
}

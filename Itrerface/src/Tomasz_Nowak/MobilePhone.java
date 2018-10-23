package Tomasz_Nowak;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powerd on.");
    }

    @Override
    public void dail(int phoneNumber) {
        if(isOn) {
            System.out.println("now ringing " + phoneNumber + "on deskPhone.");
        }else {
            System.out.println("mobile phone is switched off");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("answering the mobile phone.");
        }
        isRinging = false;

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody ring");
        }else
            isRinging = false;

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }


}



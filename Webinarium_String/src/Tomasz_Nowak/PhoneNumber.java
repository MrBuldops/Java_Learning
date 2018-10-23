package Tomasz_Nowak;

public class PhoneNumber {



    String PureNumber;
    String FinalNumber;

    public PhoneNumber(String pureNumber) {
        PureNumber = pureNumber;
    }

    public void ClearNumber()
    {

        FinalNumber = PureNumber.replace("-","" );
        FinalNumber = FinalNumber.replace(" ", "");
        int len = FinalNumber.length();
        StringBuilder str = new StringBuilder(FinalNumber);
        System.out.println("MODULO = " + FinalNumber.length()%3);
        if( FinalNumber.length()%3!=1) {


            for (int i = 3; i < len; i= i + 4) {
                str.insert(i,"-");
                len++;
            }
        }
        else {
            len = FinalNumber.length()-3;

        for (int i = 3; i < len; i= i + 4) {
            str.insert(i,"-");
            len++;
        }

            str.insert(len+1,"-");
        }



        FinalNumber = str.toString();
    }

}

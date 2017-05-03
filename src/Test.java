import java.util.ArrayList;
import java.util.List;

/**
 * Created by arkan on 03.05.2017.
 */
public class Test {
    public static void main(String[] args){
        float f_value = 20;
        int i_value = 2;
        String s_value = "ala";
        double d_value = 23.2;

        System.out.format("float: %f, integer: %d, string: %s, double: %f", f_value, i_value, s_value, d_value);
        // or System.out.printf(...

        double a = -193.635;
        double b = 140.743;
        System.out.printf("%nfloat %.3f: ", a);
        System.out.printf("%nabsolute %.3f is: %.3f %nceiling %.3f is: %.0f %n", a, Math.abs(a), b, Math.ceil(b));

        int number = 0;
        for(int i=0; i<5; i++){
            number = (int)(Math.random()*10);
            System.out.printf(String.valueOf(number));
            System.out.println(number);
        }

        int[] tab = new int[10];
        for(int i=0; i<10; i++){
            tab[i] = (int)(Math.random()*10);
            System.out.printf(String.valueOf(tab[i]));
        }

        String data = "57";
        System.out.println(String.valueOf(data));       //only for string type
        int abba = Integer.parseInt((String)data);
        System.out.println("Changed from string: " + abba*10);

        char ch1 = 'a';
        Character ch2 = new Character('2');     // fe. when you need char for method argument

        System.out.println(Character.isLetter(ch2));    //isLetter / isDigit
        System.out.println(Character.isDigit(ch2));

        char [] charArray = {'h', 'e', 'l', 'l'};
        String helloFromChar = new String(charArray);
        System.out.println(helloFromChar);

        //Coverting Strings to Numbers      [Type.valueOF(...) ]
        String tmpA = "10";
        float aa = Float.valueOf(tmpA).floatValue();
        int bb = Integer.valueOf(tmpA).intValue();
        System.out.println(aa+0.5);
        System.out.println(bb + 1);

        //Coverting Numbers to String      [String.ValueOf(...) ]
        int temp1 = 12;
        String string1 = "";
        string1 = String.valueOf(temp1);
        System.out.println(string1);        //value as String

        StringBuilder tempStringBuilder = new StringBuilder();
        tempStringBuilder.append("ariel");
        tempStringBuilder.append(26);
        System.out.println(tempStringBuilder);
        tempStringBuilder.reverse().deleteCharAt(1);    //reverse all data from val and remove first - in this case '1'
        System.out.println(tempStringBuilder);

        // autoboxing and unboxing [ int and Integer, double and Double ]
        List<Integer> li = new ArrayList<>();
        for(int i=1; i<50; i+=2){
            li.add(i);                  // it is: li.add(Integer.valueOf(i));       <- converting value into object (autoboxing)
        }

        //autoboxing in java: - primitive value is converting into object when is passed as a parameter to a method that expects an object
        //                    - and when primitive value is assigned to a variable of the corresponding wrapper class

        // Unboxing

        Integer i = new Integer(8);
        int tempxx = Math.abs(i);
        // now we have access to 'i' value via 'tempxx'

    }
}

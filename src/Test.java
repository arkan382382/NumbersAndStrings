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


    }
}

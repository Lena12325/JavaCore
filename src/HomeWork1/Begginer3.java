package HomeWork1;

public class Begginer3 {
    public static void main(String[] args) {

        //Создать из массива букв a,b,c,d,e, строку,вывести на экран, поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран

        char[] text = {'a', 'b', 'c', 'd','e'};
        String text1 = new String(text);
        System.out.println(text1);

        text[3] = 'h';
        String text2 = new String(text);
        System.out.println(text2);


    }
}

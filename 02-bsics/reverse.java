
public class reverse {
    public static void main(String[] args) {

        String str = "book", nstr = "";
        char ch;

        System.out.print("Original word: ");
        System.out.println("book");

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Reversed word: " + nstr);
    }

}

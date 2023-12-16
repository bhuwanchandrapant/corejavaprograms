public class practiceset2 {
    public static void main(String[] args) {
        // question1
        String s = "BHUWAN";
        s = s.toLowerCase();
        System.out.println(s);

        // question2
        String sc = "bhu  wan";
        sc=sc.replace("  ", "_");
        System.out.println(sc);

        //question3
        String letter = "hello |<name>| thanks a lot";
        letter = letter.replace("|<name>|", "bhuwan");
        System.out.println(letter);

        //question4

        String space = "here is  double space and here is   space";
        System.out.println(space.indexOf("  "));
        System.out.println(space.indexOf("   "));

        //question5
        String letterr = "dear bhuwan,\n\t how are you.\n\t\t\tthanks ";
        System.out.println(letterr);


    }
}

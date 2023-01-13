package HomeWork_Week_8;

public class ArrayList1 {
    public static void main(String[] args) {
        String[] postman = {"Kirtan", "Minesh", "Maulik", "Sheetal"};
        String[] java = {"Anupama", "Krunal", "Riddhi"};
        String[] selenium = {"Urvi", "Sonia", "Kuldip", "Umangi"};
        String[] restAssured = {"Jigar", "Akshit", "Shivam", "Arpita"};

        for (String name: postman ) {
            if (name.equals("Akshit")){
                System.out.println("Found Akshit in postman");
            }
        }
        for (String name: java) {
            if (name.equals("Akshit")){
                System.out.println("Found Akshit in java");
            }
        }
        for (String name: selenium) {
            if (name.equals("Akshit")){
                System.out.println("Found Akshit in selenium");
            }
        }
        for (String name : restAssured) {
            if (name.equals("Akshit")){
                System.out.println("Found Akshit in restAssured");
            }
        }
    }
}

package HomeWork_Week_8;
import java.util.ArrayList;
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> groups = new ArrayList<>();
        groups.add("Postman");
        groups.add("Rest Assured");
        groups.add("Java");
        groups.add("Selenium");
        
       for (String group : groups) {
            System.out.println(group);
        }
    }
}

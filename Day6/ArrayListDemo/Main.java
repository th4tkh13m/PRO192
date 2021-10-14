package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
   public static void main(String[] args) {
       System.out.println("Normal array:");
       String[] names = new String[3];
       names[0] = "Khiem";
       names[1] = "Linus Torvald";
       names[2] = "Jeff Bezos";
       
       System.out.println();
       System.out.println("Array List");
       List<String> nameList = new ArrayList<>();
       nameList.add("Khiem");
       nameList.add("Linus Torvald");
       nameList.add("Jeff Bezos");
       nameList.add("This has more elements than the above array.");

       System.out.println("FORI");
       for (int i = 0; i < nameList.size(); i++) {
           System.out.println(nameList.get(i));
       }

       System.out.println("FORE");
       for (String name : nameList) {
           System.out.println(name);
       }

       System.out.println("Iterator");
       Iterator<String> iter = nameList.iterator();
       while (iter.hasNext()) {
           System.out.println(iter.next());
       }
   } 
   
}

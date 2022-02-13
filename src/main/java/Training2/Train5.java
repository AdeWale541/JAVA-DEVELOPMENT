package Training2;

//ARRAY LIST
import java.util.ArrayList;
import java.util.Iterator;

public class Train5 {

    public static void main(String[] args) {

        ArrayList listTest = new ArrayList();
   listTest.add("first item");
   listTest.add("second item");
   listTest.add("third item");
   listTest.add(7);

        Iterator it= listTest.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        listTest.remove("second item");
        System.out.println("Whole list = " + listTest);

        System.out.println("Position 1 = " + listTest.get(1));
    }
}

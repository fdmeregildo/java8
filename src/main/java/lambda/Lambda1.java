package lambda;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class Lambda1 {

    public void ordenar() {

        List<String> provinces = new ArrayList<String>();
        provinces.add("Illes Balears");
        provinces.add("Valencia");
        provinces.add("Madrid");
        provinces.add("Barcelona");

        //Order with Java 7 --------------------------------
        /*
        provinces.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        */


        //Order with Java 8 - Lambda -----------------------

        //provinces.sort((String o1, String o2) -> o1.compareTo(o2));
        provinces.sort( (o1, o2) -> o1.compareTo(o2));
        provinces.stream().forEach(out::println);

    }


    public static void main(String[] args) {

        Lambda1 lambda = new Lambda1();
        lambda.ordenar();
    }
}

package tema7_parte2.flatmap;

import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Soldado s1 = new Soldado("s1", "raso", UUID.randomUUID().toString());
        Soldado s2 = new Soldado("s2", "cabo", UUID.randomUUID().toString());
        Soldado s3 = new Soldado("s3", "raso", UUID.randomUUID().toString());
        Soldado s4 = new Soldado("s4", "sargento", UUID.randomUUID().toString());
        Soldado s5 = new Soldado("s5", "raso", UUID.randomUUID().toString());
        Soldado s6 = new Soldado("s6", "cabo", UUID.randomUUID().toString());
        Soldado s7 = new Soldado("s7", "raso", UUID.randomUUID().toString());
        Soldado s8 = new Soldado("s8", "sargento", UUID.randomUUID().toString());

        Batallon b1 = new Batallon("b1");
        b1.getSoldados().addAll(List.of(s1,s2,s3,s4));

        Batallon b2 = new Batallon("b2");
        b2.getSoldados().addAll(List.of(s5,s6,s7,s8));

        Stream.of(b1,b2)
                .flatMap( b -> b.getSoldados().stream() )
                .filter( s -> s.getRango().equals("sargento"))
                .forEach( System.out::println );




    }
}

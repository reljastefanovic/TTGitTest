package Package;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Oblik> lista = new ArrayList<>();
        Krug krug = new Krug(5);
        Kvadrat kvadrat = new Kvadrat(5);
        Trougao trougao = new Trougao(5, 4, 3);
        lista.add(krug);
        lista.add(kvadrat);
        lista.add(trougao);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).izracunajPovrsinu());
            System.out.println(lista.get(i).izracunajObim());
        }

        System.out.println("test za git a");

        System.out.println("test za merge");

    }
}
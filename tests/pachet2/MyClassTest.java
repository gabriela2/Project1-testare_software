/*
        Graful asociat programului poate fi vizualizat prin intermediul site-ului:
        https://app.code2flow.com
        In folderul Materiale exista CFG_exemplu2_curs.png

        Despre plugin-ul de generare a mutantilor in Java, dar si despre
        libraria SystemOutRule mai multe detalii in fisierul pluginuri_utile_Java.
        */

package pachet2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import pachet1.MyClass;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MyClassTest {

    MyClass tester = new MyClass();

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();


    @Test
    public void equivalencePartitioning(){
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(6);
        arrayList1.add(13);
        arrayList1.add(11);
        arrayList1.add(10);
        arrayList1.add(10);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(4);
        arrayList2.add(5);
        arrayList2.add(9);
        arrayList2.add(6);

        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(-1000000002);
        arrayList3.add(-1000000002);
        arrayList3.add(-1000000002);
        arrayList3.add(-1000000002);
        arrayList3.add(-1000000002);

        ArrayList<Integer> arrayList4 = new ArrayList<>();
        arrayList4.add(-1000000008);
        arrayList4.add(-1000000002);
        arrayList4.add(-1000000008);
        arrayList4.add(-1000000002);

        ArrayList<Integer> arrayList5 = new ArrayList<>();
        arrayList5.add(1000000004);
        arrayList5.add(1000000006);
        arrayList5.add(1000000018);
        arrayList5.add(1000000012);
        arrayList5.add(1000000002);

        ArrayList<Integer> arrayList6 = new ArrayList<>();
        arrayList6.add(1000000002);
        arrayList6.add(1000000006);
        arrayList6.add(1000000002);
        arrayList6.add(1000000006);

        assertEquals("[4, 5, 9, 6, 1]",tester.find(5,arrayList1));
        assertEquals("[-1]",tester.find(4,arrayList2));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(5,arrayList3));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(4,arrayList4));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(5,arrayList5));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(4,arrayList6));
        assertEquals("N trebuie sa aiba o valoare din intervalul [4; 100 000]",tester.find(0,null));
        assertEquals("N trebuie sa aiba o valoare din intervalul [4; 100 000]",tester.find(100005,null));

    }

    @Test
    public void boundaryValueAnalysis(){

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(-1000000000);
        arrayList1.add(-1000000000);
        arrayList1.add(-1000000000);
        arrayList1.add(-1000000000);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1000000000);
        arrayList2.add(1000000000);
        arrayList2.add(1000000000);
        arrayList2.add(1000000000);

        ArrayList<Integer> arrayList3 = new ArrayList<>();
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        ArrayList<Integer> arrayList5 = new ArrayList<>();
        ArrayList<Integer> arrayList6 = new ArrayList<>();
        for(Integer i=1;i<=100000;i++){
            arrayList3.add(-1000000000);
            arrayList4.add(1000000000);
            arrayList5.add(-1000000001);
            arrayList6.add(1000000001);
        }

        ArrayList<Integer> arrayList7 = new ArrayList<>();
        arrayList7.add(-1000000008);
        arrayList7.add(-1000000001);
        arrayList7.add(-1000000008);
        arrayList7.add(-1000000001);

        ArrayList<Integer> arrayList8 = new ArrayList<>();
        arrayList8.add(1000000008);
        arrayList8.add(1000000001);
        arrayList8.add(1000000008);
        arrayList8.add(1000000001);

        assertEquals("N trebuie sa aiba o valoare din intervalul [4; 100 000]",tester.find(3,null));
        assertEquals("N trebuie sa aiba o valoare din intervalul [4; 100 000]",tester.find(100001,null));
        assertEquals("[-1]",tester.find(4,arrayList1));
        assertEquals("[-1]",tester.find(4,arrayList2));
        assertEquals("[-1]",tester.find(100000,arrayList3));
        assertEquals("[-1]",tester.find(100000,arrayList4));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(4,arrayList7));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(100000,arrayList5));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(4,arrayList8));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(100000,arrayList6));

    }

    @Test
    public void categoryPartitioning(){
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        ArrayList<Integer> arrayList5 = new ArrayList<>();
        ArrayList<Integer> arrayList6 = new ArrayList<>();
        ArrayList<Integer> arrayList7 = new ArrayList<>();
        ArrayList<Integer> arrayList8 = new ArrayList<>();
        ArrayList<Integer> arrayList9 = new ArrayList<>();
        ArrayList<Integer> arrayList10 = new ArrayList<>();
        ArrayList<Integer> arrayList11 = new ArrayList<>();
        ArrayList<Integer> arrayList12 = new ArrayList<>();
        ArrayList<Integer> arrayList13 = new ArrayList<>();
        ArrayList<Integer> arrayList14 = new ArrayList<>();
        ArrayList<Integer> arrayList15 = new ArrayList<>();
        ArrayList<Integer> arrayList16 = new ArrayList<>();
        ArrayList<Integer> arrayList17 = new ArrayList<>();
        ArrayList<Integer> arrayList18 = new ArrayList<>();
        ArrayList<Integer> arrayList19 = new ArrayList<>();
        ArrayList<Integer> arrayList20 = new ArrayList<>();
        ArrayList<Integer> arrayList21 = new ArrayList<>();
        ArrayList<Integer> arrayList22 = new ArrayList<>();
        ArrayList<Integer> arrayList23 = new ArrayList<>();
        ArrayList<Integer> arrayList24 = new ArrayList<>();
        ArrayList<Integer> arrayList25 = new ArrayList<>();
        ArrayList<Integer> arrayList26 = new ArrayList<>();
        ArrayList<Integer> arrayList27 = new ArrayList<>();
        ArrayList<Integer> arrayList28 = new ArrayList<>();


        for(Integer i= 1; i<= 4;i++){
            arrayList1.add(-1000000005);
            arrayList2.add(-1000000001);
            arrayList3.add(-1000000000);
            arrayList5.add(1000000000);
            arrayList6.add(1000000001);
            arrayList7.add(1000000005);
        }
        arrayList4.add(-1);
        arrayList4.add(29);
        arrayList4.add(-1);
        arrayList4.add(29);

        for(Integer i= 1; i<= 8;i++){
            arrayList8.add(-1000000005);
            arrayList10.add(-1000000001);
            arrayList12.add(-1000000000);
            arrayList16.add(1000000000);
            arrayList18.add(1000000001);
            arrayList20.add(1000000005);
        }
        for(Integer i= 1; i<= 5;i++){
            arrayList9.add(-1000000005);
            arrayList11.add(-1000000001);
            arrayList13.add(-1000000000);
            arrayList17.add(1000000000);
            arrayList19.add(1000000001);
            arrayList21.add(1000000005);
        }
        arrayList14.add(5);
        arrayList14.add(17);
        arrayList14.add(-2);
        arrayList14.add(19);
        arrayList14.add(5);
        arrayList14.add(7);
        arrayList14.add(12);
        arrayList14.add(5);

        arrayList15.add(30);
        arrayList15.add(3);
        arrayList15.add(15);
        arrayList15.add(14);
        arrayList15.add(10);

        for(Integer i=1;i<= 100000;i++){
            arrayList22.add(-1000000005);
            arrayList23.add(-1000000001);
            arrayList24.add(-1000000000);
            arrayList25.add(100);
            arrayList26.add(1000000000);
            arrayList27.add(1000000001);
            arrayList28.add(1000000005);
        }



        assertEquals("N trebuie sa aiba o valoare din intervalul [4; 100 000]",tester.find(0,null));
        assertEquals("N trebuie sa aiba o valoare din intervalul [4; 100 000]",tester.find(3,null));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(4,arrayList1));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(4,arrayList2));
        assertEquals("[-1]",tester.find(4,arrayList3));
        assertEquals("[-1]",tester.find(4,arrayList4));
        assertEquals("[-1]",tester.find(4,arrayList5));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(4,arrayList6));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(4,arrayList7));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(8,arrayList8));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(5,arrayList9));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(8,arrayList10));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(5,arrayList11));
        assertEquals("[-1]",tester.find(8,arrayList12));
        assertEquals("[-500000000, -500000000, -500000000, -500000000, -500000000]",tester.find(5,arrayList13));
        assertEquals("[-1]",tester.find(8,arrayList14));
        assertEquals("[7, 12, -4, 3, 18]",tester.find(5,arrayList15));
        assertEquals("[-1]",tester.find(8,arrayList16));
        assertEquals("[500000000, 500000000, 500000000, 500000000, 500000000]",tester.find(5,arrayList17));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(8,arrayList18));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(5,arrayList19));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(8,arrayList20));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(5,arrayList21));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(100000,arrayList22));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(100000,arrayList23));
        assertEquals("[-1]",tester.find(100000,arrayList24));
        assertEquals("[-1]",tester.find(100000,arrayList25));
        assertEquals("[-1]",tester.find(100000,arrayList26));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(100000,arrayList27));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(100000,arrayList28));
        assertEquals("N trebuie sa aiba o valoare din intervalul [4; 100 000]",tester.find(100001,null));
        assertEquals("N trebuie sa aiba o valoare din intervalul [4; 100 000]",tester.find(100005,null));
    }

    @Test
    public void statementCoverage(){
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        ArrayList<Integer> arrayList5 = new ArrayList<>();

        arrayList1.add(-1000000001);
        arrayList1.add(-1000000001);
        arrayList1.add(-1000000001);
        arrayList1.add(-1000000001);

        arrayList2.add(1);
        arrayList2.add(3);
        arrayList2.add(1);
        arrayList2.add(3);

        arrayList3.add(30);
        arrayList3.add(3);
        arrayList3.add(15);
        arrayList3.add(14);
        arrayList3.add(10);

        arrayList4.add(-3);
        arrayList4.add(9);
        arrayList4.add(4);
        arrayList4.add(5);
        arrayList4.add(9);
        arrayList4.add(10);

        arrayList5.add(18);
        arrayList5.add(8);
        arrayList5.add(6);
        arrayList5.add(5);
        arrayList5.add(3);
        arrayList5.add(14);
        arrayList5.add(12);


        assertEquals("N trebuie sa aiba o valoare din intervalul [4; 100 000]",tester.find(3,null));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(4,arrayList1));
        assertEquals("[-1]",tester.find(4,arrayList2));
        assertEquals("[7, 12, -4, 3, 18]",tester.find(5,arrayList3));
        assertEquals("[7, -4, 2, 8, 3, 1]",tester.find(6,arrayList4));
        assertEquals("[7, 8, 1, -2, 4, 5, 10]",tester.find(7,arrayList5));
    }

    @Test
    public void branchCoverage() {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        ArrayList<Integer> arrayList5 = new ArrayList<>();

        arrayList1.add(-1000000001);
        arrayList1.add(-1000000001);
        arrayList1.add(-1000000001);
        arrayList1.add(-1000000001);

        arrayList2.add(1);
        arrayList2.add(3);
        arrayList2.add(1);
        arrayList2.add(3);

        arrayList3.add(30);
        arrayList3.add(3);
        arrayList3.add(15);
        arrayList3.add(14);
        arrayList3.add(10);

        arrayList4.add(-3);
        arrayList4.add(9);
        arrayList4.add(4);
        arrayList4.add(5);
        arrayList4.add(9);
        arrayList4.add(10);

        arrayList5.add(18);
        arrayList5.add(8);
        arrayList5.add(6);
        arrayList5.add(5);
        arrayList5.add(3);
        arrayList5.add(14);
        arrayList5.add(12);


        assertEquals("N trebuie sa aiba o valoare din intervalul [4; 100 000]",tester.find(3,null));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(4,arrayList1));
        assertEquals("[-1]",tester.find(4,arrayList2));
        assertEquals("[7, 12, -4, 3, 18]",tester.find(5,arrayList3));
        assertEquals("[7, -4, 2, 8, 3, 1]",tester.find(6,arrayList4));
        assertEquals("[7, 8, 1, -2, 4, 5, 10]",tester.find(7,arrayList5));

    }
    @Test
    public void conditionCoverage() {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList1b = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        ArrayList<Integer> arrayList5 = new ArrayList<>();

        arrayList1.add(-1000000001);
        arrayList1.add(-1000000001);
        arrayList1.add(-1000000001);
        arrayList1.add(-1000000001);

        arrayList1b.add(1000000001);
        arrayList1b.add(1000000001);
        arrayList1b.add(1000000001);
        arrayList1b.add(1000000001);

        arrayList2.add(1);
        arrayList2.add(3);
        arrayList2.add(1);
        arrayList2.add(3);

        arrayList3.add(30);
        arrayList3.add(3);
        arrayList3.add(15);
        arrayList3.add(14);
        arrayList3.add(10);

        arrayList4.add(-3);
        arrayList4.add(9);
        arrayList4.add(4);
        arrayList4.add(5);
        arrayList4.add(9);
        arrayList4.add(10);

        arrayList5.add(18);
        arrayList5.add(8);
        arrayList5.add(6);
        arrayList5.add(5);
        arrayList5.add(3);
        arrayList5.add(14);
        arrayList5.add(12);

        assertEquals("N trebuie sa aiba o valoare din intervalul [4; 100 000]",tester.find(3,null));
        assertEquals("N trebuie sa aiba o valoare din intervalul [4; 100 000]",tester.find(100001,null));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(4,arrayList1));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(4,arrayList1b));
        assertEquals("[-1]",tester.find(4,arrayList2));
        assertEquals("[7, 12, -4, 3, 18]",tester.find(5,arrayList3));
        assertEquals("[7, -4, 2, 8, 3, 1]",tester.find(6,arrayList4));
        assertEquals("[7, 8, 1, -2, 4, 5, 10]",tester.find(7,arrayList5));

    }

    @Test
    public void circuitCoverage() {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        ArrayList<Integer> arrayList5 = new ArrayList<>();

        arrayList1.add(-1000000001);
        arrayList1.add(-1000000001);
        arrayList1.add(-1000000001);
        arrayList1.add(-1000000001);

        arrayList2.add(1);
        arrayList2.add(3);
        arrayList2.add(1);
        arrayList2.add(3);

        arrayList3.add(30);
        arrayList3.add(3);
        arrayList3.add(15);
        arrayList3.add(14);
        arrayList3.add(10);

        arrayList4.add(-3);
        arrayList4.add(9);
        arrayList4.add(4);
        arrayList4.add(5);
        arrayList4.add(9);
        arrayList4.add(10);

        arrayList5.add(18);
        arrayList5.add(8);
        arrayList5.add(6);
        arrayList5.add(5);
        arrayList5.add(3);
        arrayList5.add(14);
        arrayList5.add(12);


        assertEquals("N trebuie sa aiba o valoare din intervalul [4; 100 000]",tester.find(3,null));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(4,arrayList1));
        assertEquals("[-1]",tester.find(4,arrayList2));
        assertEquals("[7, 12, -4, 3, 18]",tester.find(5,arrayList3));
        assertEquals("[7, -4, 2, 8, 3, 1]",tester.find(6,arrayList4));
        assertEquals("[7, 8, 1, -2, 4, 5, 10]",tester.find(7,arrayList5));
    }

    @Test
    public void killMutants() {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        ArrayList<Integer> arrayList5 = new ArrayList<>();

        arrayList1.add(-1000000001);
        arrayList1.add(-1000000001);
        arrayList1.add(-1000000001);
        arrayList1.add(-1000000001);

        arrayList2.add(1);
        arrayList2.add(3);
        arrayList2.add(1);
        arrayList2.add(3);

        arrayList3.add(30);
        arrayList3.add(3);
        arrayList3.add(15);
        arrayList3.add(14);
        arrayList3.add(10);

        arrayList4.add(-3);
        arrayList4.add(9);
        arrayList4.add(4);
        arrayList4.add(5);
        arrayList4.add(9);
        arrayList4.add(10);

        arrayList5.add(18);
        arrayList5.add(8);
        arrayList5.add(6);
        arrayList5.add(5);
        arrayList5.add(3);
        arrayList5.add(14);
        arrayList5.add(12);




        assertEquals("N trebuie sa aiba o valoare din intervalul [4; 100 000]",tester.find(3,null));
        assertEquals("Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]",tester.find(4,arrayList1));
        assertEquals("[-1]",tester.find(4,arrayList2));
        assertEquals("[7, 12, -4, 3, 18]",tester.find(5,arrayList3));
        assertEquals("[7, -4, 2, 8, 3, 1]",tester.find(6,arrayList4));
        assertEquals("[7, 8, 1, -2, 4, 5, 10]",tester.find(7,arrayList5));


        assertEquals("N trebuie sa aiba o valoare din intervalul [4; 100 000]\n"+
                        "Rezultatele initiale trebuie sa aiba valori din intervalul [- 1 000 000 000; 1 000 000 000]\n"+
                        "[-1]\n"+
                        "final results are:[7, 12, -4, 3, 18]\n"+
                        "final results are:[7, -4, 2, 8, 3, 1]\n"+
                        "final results are:[7, 8, 1, -2, 4, 5, 10]\n",
                systemOutRule.getLogWithNormalizedLineSeparator());

    }



}

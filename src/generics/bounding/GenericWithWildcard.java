package generics.bounding;

import java.util.ArrayList;
import java.util.List;

//wildcard-->joker-->? bilinmeyen data tipi
public class GenericWithWildcard {
    public static void main(String[] args) {

        List<Integer> integerList=new ArrayList<>();
        List<Double> doubleList=new ArrayList<>();
        List<String> stringList=new ArrayList<>();
        List<Number> numberList=new ArrayList<>();
        List<Object> onjectList=new ArrayList<>();

        addElements(integerList);
        System.out.println(integerList);
        //addElements(doubleList); alttan int ile sinirladigimiz iicn double i kabul etmedi
        addElements(numberList);
        System.out.println(numberList);
        addElements(onjectList);
        System.out.println(onjectList);

        multiplyByTwo(integerList);
        multiplyByTwo(doubleList);
        multiplyByTwo(numberList);
        //multiplyByTwo(onjectList); object'in icinde sayisal olmayal data typelarid  aoldugu iicn buna izin vermedi'



        printElements(integerList);
        printElements(doubleList);
        printElements(stringList);
        printElements(numberList);
        printElements(onjectList);
    }


    //alttan sinirlama
    //list verdigimizde 1den 10a kadar degerleri ekleyen method
    public static void addElements(List< ? super Integer > list){//list integer,number,object olabilir yani en az integer olmali
        //?--> kendisi Integer veya Integer'in parentlari demek
        for (int i=1; i<11; i++){
            list.add(i);
        }
    }

    //ustten sinirlama
    public static void multiplyByTwo(List< ? extends Number> list){
        list.stream().map(t->2*t.doubleValue()).forEach(t-> System.out.print(t+" "));
    }


    //wildcard(?) herhangi bir data type iicnde kullanilabilir yani sadece alttan veya ustten sinirlama hariicnde T,E,V veya S yerine de kullanilabilir
    //wildcard sadece read-only'dir yani data uzeridne dgeisiklik yaptirmaz
    public static void printElements(List<?>list){
        //        list.add(12);
//        list.add("java");

        for (Object obj:list){
            System.out.print(obj+"  ");

        }

        //list.stream().forEach(t-> System.out.print(t+" "));
    }

    //NOT:List<?> ile List<T> benzer fakat tamamen aynı DEĞİLDİR.

    //List<Object>
    public static void printObjectElements(List<Object> list){

        list.add(12);
        list.add("java");

        for (Object obj:list){
            System.out.print(obj+"  ");

        }

        // list.stream().forEach(t-> System.out.print(t+" "));

    }

    //List<Object>--->farklı data tipi
    //List<String>--->farklı data tipi
}

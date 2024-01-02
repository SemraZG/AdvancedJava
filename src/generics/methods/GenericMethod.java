package generics.methods;

import java.util.Arrays;

public class GenericMethod {
    public static void main(String[] args) {
        Integer[] intArr={2,3,8,99,55};
        Double[] doubleArr={1.3,35.6,99.9,0.5};
        String[] stringArr={"Java","generics","hayatımızı","kolaylaştırır"};

        printArray(intArr);
        printArray(doubleArr);//overload yaptik
        printArray(stringArr);//overload yaptik

        //generic method ile overloading yapmaya gerek kalmadan her data ile methodu kullanabildik
        printArrayGeneric(intArr);
        printArrayGeneric(doubleArr);
        printArrayGeneric(stringArr);

        //generic return edn method
        Integer first1=getFirst(intArr);
        String first2=getFirst(stringArr);

        //biden fazla parametreli generic method
        printArrayAndValue(intArr,12);//S de U da int olmus oldu
        printArrayAndValue(stringArr,35);//S string U int oldu





    }

    //arrayleri yazdirmak icin method tanimlayalim
    public static void printArray(Integer[] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println();
    }
    //-------------------overloading-------------------------------
    public static void printArray(Double[] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println();
    }
    //-------------------overloading-------------------------------
    public static void printArray(String[] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println();
    }
    //3 tane veya daha da fazla overload yapmak zorunda kaldik generic method olsaydi...
    //generic ve vois bir method yazalim
    public static <T> void printArrayGeneric(T[] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println();
    }

    //geriye generic typeda data donduren generic method yazalim
    public static <T> T getFirst(T[] arr){
        T first=arr[0];
        return first;
    }

    //birden fazla data type kullanan bir method olusturalim
    public static <S,U> void printArrayAndValue(S[] arr, U value){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println("deger: "+value);
    }


}

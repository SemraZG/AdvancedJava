package generics.clases;

import java.util.ArrayList;
import java.util.HashMap;

public class RunnerGeneric {
    public static void main(String[] args) {
        //2 farkli objemis var--> book and laptop
        GenericProduct<Integer> laptop=new GenericProduct();
        laptop.setCode(123);

        GenericProduct<String> book=new GenericProduct<>();
        book.setCode("Advanced Java");

        String str= book.getCode();//casting'e gerek aklmadi generic sayesinde
        System.out.println(str);
        //String str2=laptop.getCode();//yukarda int olarak belirttigimiz iicn burda stringe koyamama izin vermedi compile time error verdi
        //yani genericde data type kontrolu var
        Integer code= laptop.getCode();

        ArrayList<String> arrayList=new ArrayList<>();//E string oldu
        arrayList.add("harika");
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Studen1", 99);


//=================COK PARAMETRELI CLASS=========================
        GenericClassWithTwoParam<String, Integer> myMap=new GenericClassWithTwoParam<>("generic",100,"Jack");
        GenericClassWithTwoParam<Integer, Integer> myMap2=new GenericClassWithTwoParam<>(99,100,"Jack");


    }
}

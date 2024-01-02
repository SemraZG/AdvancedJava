package generics.clases;

public class RunnerNonGeneric {
    public static void main(String[] args) {
        //2 farkli obje:laptop, kitap
        NonGenericProduct book=new NonGenericProduct();
        book.setCode("Advanced Java");//code fieldinin degerini String data typeinda set ettik

        NonGenericProduct laptop=new NonGenericProduct();
        laptop.setCode(123);//code fieldinin degerini Integer data typeinda set ettik

        String str= (String) book.getCode();//casting yaptik, manual olrsk book.getCode(); onune (String) yazdik
        System.out.println(str);

        String str2=(String)laptop.getCode();
        System.out.println(str2);//Runtime Exc aldik, cunku int datayi stringin icine koymaya calistik
        //bu yuzden generics'ler olusturuldu

    }
}

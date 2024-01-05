package generics.bounding;

public class GenericUpperBound <T extends Number>{//T-->Number veya childleri olabilir, Number tum sayisal data type'larinin parenti
    //bir sinirlama koymazsak T hersey(String Intger Account Use...) olabilir
    //sinirlamayi sadece ustten yani parentdan yapabiliyoruz
    //T degisken olsun ama sayi tipinde bir degisken olsun-->INTEGER SORT LONG FLOAT BYTE VEYA BUNLARIN PARANRI OLAN EN FAZLA NUMBER OLSUN
    public T[] numberArray;
    //parametreli const ile array i set edelim
    public GenericUpperBound(T[] numberArray) {
        this.numberArray = numberArray;
    }


    //numberAray icindeki elemanlarin ortalamasini bulan method
    public Double getAverage(){
        double sum=0;
        for (T t: this.numberArray){//T data type'inda olan arayin icindeki her bit eleman-->t
            sum+=t.doubleValue();//t'nin degerini mesela int ise double cevirip double  olarak al demek
        }
        double avg=sum/this.numberArray.length;
        return avg;
    }






    //main method/runner
    public static void main(String[] args) {

        Integer[] integers={5,6,9,8};
        Double[] doubles={1.2, 3.4, 5.6, 7.9,9.0};
        String[] strings={"genericler","üstten","sınırlandırılabilir."};


        GenericUpperBound<Integer> obj=new GenericUpperBound<>(integers);
        System.out.println(obj.getAverage());

        GenericUpperBound<Double> obj2=new GenericUpperBound<>(doubles);
        System.out.println(obj2.getAverage());

//        GenericUpperBound<String> obj3=new GenericUpperBound<>(strings);//string alamaz cunku en fazla number veya onun cocuklari olsun dedik
//        System.out.println(obj3.getAverage());
    }

}

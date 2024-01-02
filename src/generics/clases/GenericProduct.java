package generics.clases;
//her urun(book, laptop. phone..) icin ayri classlar olusturmak yerine,
//Product classini farkli data parametreleri alarak calsimasini saglayacagiz
//Generic'ler sadece non-primitive datalarla calisirlar Integer,Double,String gibi
public class GenericProduct <T>{//class adindan sonra <> isaretini koyup icine generic isaretlerden birini yaziyorum T,E gibi,
    // buyuk harf oldugu surece birden fazla data type alacaksa S,V koyuyoruz dogerlerinde T,E gibi hepsi de olabiulir

    private T code;//

    public T getCode() {
        return code;
    }

    public void setCode(T code) {
        this.code = code;
    }
}

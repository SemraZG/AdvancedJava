package generics.clases;

public class NonGenericProduct {
    //amac her bir urun(laptop, book) icin ayri ayri classlar olusturmak yerine,
    // sadece farkli data type ile kullanmak istedigimiz cide fieldinin ref. Object yaptik
    private Object code;//code field'inin data type'i object oldugundan objectin child i olan tum data tyuoelaridna deger alabilir

    //field private oldugu icin getter ve setter lari olustirduk
    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }
}

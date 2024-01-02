package generics.clases;

public class GenericClassWithTwoParam <S,U> {//S demek birdne fazla data type alacak demek, U veya V de oalbilirdi S yerine
    private S anahtar;//
    private U deger;
    private String name;//burda generic data type kullanmadik

    //parametreli constructor olusturudk ki degerleri tek tek set methodu ile set etmek zorunda kalmayalim
    public GenericClassWithTwoParam(S anahtar, U deger, String name) {
        this.anahtar = anahtar;
        this.deger = deger;
        this.name = name;
    }

    //getter and setter
    public S getAnahtar() {
        return anahtar;
    }

    public void setAnahtar(S anahtar) {
        this.anahtar = anahtar;
    }

    public U getDeger() {
        return deger;
    }

    public void setDeger(U deger) {
        this.deger = deger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

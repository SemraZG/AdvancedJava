package generics.interfaces;

public interface GenericInterface <T>{
    //code tekrarindan kurtulmak ve benzer yapilardaki nesneleri olustururken bir standart olusturnmak iicn interface kullaniriiz
    //interface implememnt ettigimizde implement eden tum classlar interfacedeki standartlara uymak zorunda

    void print(T value);
    T find();
}

package generics.interfaces.exaple;

public interface Repository <T>{

    void save( T obj);
    T find(int id);//impelment eden class T'yi hangi data type'inda belirtirse, find methodu o data type ini dondurecek demek
}

package generics.interfaces;

public class GenericInterfaceImpl<T> implements GenericInterface<T>{
    //1.secenek-->generic interface implemet eden class da generic olmali
    @Override
    public void print(T value) {

    }

    @Override
    public T find() {
        return null;
    }
    //1. secenek
}

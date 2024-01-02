package generics.interfaces;

public class GenericInterfaceStringImpl implements GenericInterface<String>{
//2. secenek-->implement ederken dtaa typeina karar verdik String olsun dedik karar vermeseydik bu class da generic olmalkiydi
    @Override
    public void print(String value) {

    }

    @Override
    public String find() {
        return null;
    }
}

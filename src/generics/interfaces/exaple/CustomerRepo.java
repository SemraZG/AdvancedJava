package generics.interfaces.exaple;
//tek tek 2 repo classinda methodlari yazmak yerine Interface olusturup implemet ediyporuz
public class CustomerRepo implements Repository<Customer>{
    @Override
    public void save(Customer obj) {
        //codes...

    }

    @Override
    public Customer find(int id) {
        //codes...
        return null;
    }
}

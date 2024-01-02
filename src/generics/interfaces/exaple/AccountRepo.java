package generics.interfaces.exaple;
//Account'un dadabase islemleri oalcak bu classda
public class AccountRepo implements Repository<Account>{//burada implement ederken data type olarak Account olsun dedik
    //tum classlar ayni zamanda bir data type'dir-->Account gibi

    @Override
    public void save(Account obj) {

    }

    @Override
    public Account find(int id) {
        return null;
    }
}

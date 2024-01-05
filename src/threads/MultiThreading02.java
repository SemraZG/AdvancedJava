package threads;

public class MultiThreading02 {
    public static int sayac=0;
    public static void main(String[] args) {


        //Tom ve Jerry adinda 2 thread olustutralim
        Thread thread1=new Thread(new Runnable() {//Sayac classini Thread'e extend ederek de thread baslatabilirdik
            @Override
            public void run() {
                //burada baska kodlar da olabilir
                //mesela
                for (int i=1;i<10;i++){
                    System.out.println("Tom---Bazi kodlar");
                }//burdaki kodlar synchronized yailmadiysa yin ethreadlar birbirinden bagimsiz sekilde calisacaklar, synchronized ile sirayla yapiyirlar

                Sayac.count();//Sayac classinin count methodunu cagirdik

                //bazi kodlar...
            }
        });
        thread1.setName("Tom");
        thread1.start();

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                //burada baska kodlar da olabilir
                //mesela
                for (int i=1;i<10;i++){
                    System.out.println("Jerry---Bazi kodlar");
                }

                Sayac.count();

                //bazi kodlar...
            }
        });
        thread2.setName("Jerry");
        thread2.start();




    }
}

class Sayac{
    //2 thread de ayni anda count'u kullandigi icin ayni anda hem okuma hem degistirme hem yazdirma islemi oldugu icin hata alabiliriz
    // senkron bir sekilde calismalilardi
    //bunun icin methoda synchronized keywordunu ekliyoruz
    //synchronized sayesinde ayni kaynaga (burda count methodu) ayni anda 1 thread ulssabilir
    //bu problemi join ile diger thread i bekjleterek cozemeyiz
    //cunki join diger thread tum isini bitirene kadar bejletir ve multithreading olmz
    public synchronized static void count(){

        for (int i=1; i<=1000;i++){
            MultiThreading02.sayac++;
            System.out.println(Thread.currentThread().getName()+"----> counter: "+MultiThreading02.sayac);

        }
    }
}

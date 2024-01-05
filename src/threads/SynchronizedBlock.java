package threads;

public class SynchronizedBlock {
    public static void main(String[] args) {
        //task: Ekrana 14 defa [[[[[]]]]] yazdirin(5 ac 5 kapa)
        //bu taski 2 thread yapsin

        Brackets brackets=new Brackets();

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1; i<=7; i++){
                    brackets.generateBrackets();

                }
            }
        });

        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1; i<=7; i++){
                    brackets.generateBrackets();

                }
            }
        });

        long start=System.currentTimeMillis();
        thread1.start();
        thread2.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long finish=System.currentTimeMillis();

    }
}

class Brackets{

    public /*synchronized*/ void generateBrackets(){

        synchronized (this) {//sadece bu bloga sirayla ulassin threadler demis oliuyoruz, blogu senkonize etmek daha hizli sonuc verir
            for (int i = 1; i <= 10; i++) {
                if (i < 6) {
                    System.out.print("[ ");
                } else {
                    System.out.print("] ");
                }
            }
            System.out.println("----" + Thread.currentThread().getName());
        }

        //ayni methodun icinde sekron olmasi gerekmeyen kodlar olduugnda method basligindaki synchronized kaldiriyorum
        for (int i=1;i<6;i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}

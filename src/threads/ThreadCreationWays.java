package threads;

public class ThreadCreationWays {
    public static void main(String[] args) throws InterruptedException {
        //jer java programinda bir tane default thread baslatilir
        System.out.println("Mevcut calisan thread : "+ Thread.currentThread().getName());

        //1.way-->Thread classindan defauld constructori kullanip
        Thread thread1=new MyThread();
        thread1.start();//start() threadi baslatir ve run methodunu cagirir.
        //thread1.run();//run()-->adece run methodu icndeki kodelari calistirir ama yeni bir thread baslatmaz bunun isin start() sart.
        thread1.setName("threadcik");//isim vermezsek default -->Thread-0,Thread-1....


        //2.way-->asagida kendimiz class olusturduk bu classin tek amaci Runnable interface implement edip, run methodunu cagirabilmek
        //asagida ise bu classi olusturmaya gerek kalmadan new Runable diyerek direk de run methodunu cagirabildim
        Runnable myrunnable=new MyRunnable();//runnable objesi olusturdum
        //runnable functional interface'dir yani icinde implement edilecek sadece bir method var(run())
        Thread thread2=new Thread(myrunnable);//yukarda paramtresizi kullandik,burda parametreliyi kullandk paramtre olrak runnable objesi aldigi once once onu olusturdum
        thread2.start();

        //ananymous class-->burada kendimiz class olusturmadan new diyerek Runnable interfacesini parametre olrk verip run methodunu direk cagirdik
        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Calisan thread "+Thread.currentThread().getName());
                System.out.println("Anonim sinif ile thread olusturuldu");
            }
        });
        thread3.setName("anonim");
        thread3.start();


        //2.yol
        Thread thread4=new Thread(() -> {
            System.out.println("Calisan thread "+Thread.currentThread().getName());
            System.out.println("Lambda ile thread olusturuldu");
        });

        thread4.setName("harika");
        thread4.start();

        Thread.sleep(300);//hangi thread calisirken(burda main) kullanilirsa o threadi bekletir

        System.out.println("Burada main method bitiyor");//en sonda cikmadi konsolda rastgele geliyor

    }
}
//class disi
//Thread olusturmanin sadece 2 yolu var
//1. way-->Thread clasiini extend ederek
class MyThread extends Thread{
    @Override
    public void run() {
        //threade yaptirmak istedigimiz islemleri run methodu icnde belirtiyoruz
        System.out.println("Mevcut thread: "+Thread.currentThread().getName());
        System.out.println("Mythread calisiyor.");
    }
}
//class disi

//2.way-->Runnable interfacesini implement ederek
class MyRunnable implements Runnable{

    @Override
    public void run() {
        //threade yaptirmak istedigimiz islemleri run methodu icnde belirtiyoruz
        System.out.println("Calisan thread: "+Thread.currentThread().getName());
        System.out.println("Runnable ile olusturdugumuz Mythread calisiyor.");
    }
}


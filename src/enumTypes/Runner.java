package enumTypes;

import java.sql.SQLOutput;

import static enumTypes.PasswordStrengthConstant.*;

public class Runner {
    public static void main(String[] args) {

        //diyelim ki validation yapildi
        printPasswordStrength("LOW");
        printPasswordStrength("MEDIUN");
        printPasswordStrength("HIGH");

        printPasswordStrengthWithEnum(PasswordStrengthWithEnum.LOW);
        printPasswordStrengthWithEnum(PasswordStrengthWithEnum.MEDIUM);
        printPasswordStrengthWithEnum(PasswordStrengthWithEnum.HIGH);
//BU UC DEGISKEN DIISNDA BASKA HICBIRSEY KABUL ETMIYOR ENUM SAYESINDE BUNLARIN DISINDA CTE (COMPILE TIME ERROR)VERIR

    }

    //main disi


    //password gucunu 3 seviye (low,medium,high) olrak belirledik

        //if (strength.equals("LOW")){//nbaska bir dev low yerine baska birsey weak veya dusuk veya too low doyebilir, yani sabit degil
        //veya LOW'un oldugu classi import edersem dogrudan degeri de cagirabilirim class ismine gerek kalmadan

    public static void printPasswordStrength(String strength){

        if (strength.equals(LOW)){
            System.out.println("Password gücünüz düşüktür.");
        } else if (strength.equals(MEDIUM)) {
            System.out.println("Password gücünüz orta seviyededir..");
        }else if (strength.equals(HIGH)){
            System.out.println("Password gücünüz yüksek seviyededir..");
        }

    }

    //enum ile ayni methodu yazalim
    public static void printPasswordStrengthWithEnum(PasswordStrengthWithEnum strength){//kendi olusturdugmuz enum'i data type olrak verdik
        if (strength.equals(PasswordStrengthWithEnum.LOW)){
            System.out.println("Password dusuk");
        }else if (strength.equals(PasswordStrengthWithEnum.MEDIUM)){
            System.out.println("Password orta");
        }else if (strength.equals(PasswordStrengthWithEnum.HIGH)){
            System.out.println("Password yuksek");
        }
        System.out.println("Enum sirasi: "+strength.ordinal());
        System.out.println("Enum ismi:"+strength.name());
    }
}

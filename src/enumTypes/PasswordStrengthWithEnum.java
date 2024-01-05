package enumTypes;

public enum PasswordStrengthWithEnum {
    //enumlarda degiskenler genelde buyuk harfle olusturulur, ama zorunlu degil
    LOW(10),
    MEDIUM(30),
    HIGH(50);

    private final int level;

    //parametreli const


    PasswordStrengthWithEnum(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

}

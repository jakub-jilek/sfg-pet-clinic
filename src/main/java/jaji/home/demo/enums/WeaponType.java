package jaji.home.demo.enums;

public enum WeaponType {
    SWORD(1),
    STAFF(2),
    BOW(3);

    private final int code;

    WeaponType(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public static WeaponType getWeaponByCode(int code) {
        return switch (code) {
            case 1 -> SWORD;
            case 2 -> STAFF;
            case 3 -> BOW;
            default -> throw new IllegalArgumentException("Neplatný kód zbraně");
        };
    }
}

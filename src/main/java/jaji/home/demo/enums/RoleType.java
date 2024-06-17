package jaji.home.demo.enums;

public enum RoleType {
    WARRIOR(1, "Válečník"),
    WIZARD(2, "Kouzelník"),
    SHOOTER(3, "Střelec");

    private final int code;

    private final String text;

    private RoleType(int code, String text) {
        this.code = code;
        this.text = text;
    }

    public int getCode() {
        return this.code;
    }

    public String getText() {
        return this.text;
    }

    public static RoleType getRoleByCode(int code) {
        return switch (code) {
            case 1 -> WARRIOR;
            case 2 -> WIZARD;
            case 3 -> SHOOTER;
            default -> throw new IllegalArgumentException("Neplatný kód role");
        };
    }
}

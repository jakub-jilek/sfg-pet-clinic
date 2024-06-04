package jaji.home.demo.enums;

public enum RoleType {
    WARRIOR(1),
    WIZARD(2),
    SHOOTER(3);

    private final int kod;

    private RoleType(int kod) {
        this.kod = kod;
    }

    public int getKod() {
        return this.kod;
    }
}

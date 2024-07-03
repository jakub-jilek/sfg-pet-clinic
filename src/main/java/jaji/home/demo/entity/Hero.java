package jaji.home.demo.entity;

import jakarta.persistence.*;

@Entity
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long heroId;

    private String name;

    private int roleTypeCode;

    private int age;

    private int attack;

    private int defense;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "weapon_id")
    private Weapon weapon;

    public Long getHeroId() {
        return heroId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoleTypeCode() {
        return roleTypeCode;
    }

    public void setRoleTypeCode(int roleTypeCode) {
        this.roleTypeCode = roleTypeCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

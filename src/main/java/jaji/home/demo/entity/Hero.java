package jaji.home.demo.entity;

import jakarta.persistence.*;

@Entity
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long heroId;

    private String name;

    private int roleTypeKod;

    private int age;

    private int attack;

    private int defense;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "weapon_id", referencedColumnName = "weaponId")
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

    public int getRoleTypeKod() {
        return roleTypeKod;
    }

    public void setRoleTypeKod(int roleTypeKod) {
        this.roleTypeKod = roleTypeKod;
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

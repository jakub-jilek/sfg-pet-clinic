package jaji.home.demo.entity;

import jaji.home.demo.enums.WeaponType;
import jakarta.persistence.*;

@Entity
public class Weapon {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long weaponId;

    private WeaponType weaponType;

    private int price;

    private int dmgMin;

    private int dmgMax;

    public long getWeaponId() {
        return weaponId;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDmgMin() {
        return dmgMin;
    }

    public void setDmgMin(int dmgMin) {
        this.dmgMin = dmgMin;
    }

    public int getDmgMax() {
        return dmgMax;
    }

    public void setDmgMax(int dmgMax) {
        this.dmgMax = dmgMax;
    }
}

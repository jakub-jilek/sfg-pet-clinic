package jaji.home.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Weapon {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long weaponId;

    private int weaponTypeCode;

    private int price;

    private int dmgMin;

    private int dmgMax;

    public long getWeaponId() {
        return weaponId;
    }

    public int getWeaponTypeCode() {
        return weaponTypeCode;
    }

    public void setWeaponTypeCode(int weaponTypeCode) {
        this.weaponTypeCode = weaponTypeCode;
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

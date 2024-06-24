package jaji.home.demo.dto;

import jaji.home.demo.enums.RoleType;

public class HeroDto {
        private String name;
        private RoleType role;
        private int age;
        private int attack;
        private int defense;
        private WeaponDto weaponDto;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleType getRole() {
        return role;
    }

    public void setRole(RoleType role) {
        this.role = role;
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

    public WeaponDto getWeaponDto() {
        return weaponDto;
    }

    public void setWeaponDto(WeaponDto weaponDto) {
        this.weaponDto = weaponDto;
    }
}

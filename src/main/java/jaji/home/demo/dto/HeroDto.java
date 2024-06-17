package jaji.home.demo.dto;

import jaji.home.demo.enums.RoleType;

public record HeroDto(long id, String name, RoleType role, int age, int attack, int defense, WeaponDto weaponDto) {
}

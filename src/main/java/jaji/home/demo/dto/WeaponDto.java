package jaji.home.demo.dto;

import jaji.home.demo.enums.WeaponType;

public record WeaponDto(long id, WeaponType weaponType, int price, int dmgMin, int dmgMax) {
}

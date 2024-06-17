package jaji.home.demo.mapper;

import jaji.home.demo.dto.WeaponDto;
import jaji.home.demo.entity.Weapon;
import jaji.home.demo.enums.WeaponType;

public class WeaponMapper {

    public static WeaponDto weaponToWeaponDto(Weapon weapon) {
        WeaponDto dto = new WeaponDto(
                weapon.getWeaponId(),
                WeaponType.getWeaponByCode(weapon.getWeaponTypeCode()),
                weapon.getPrice(),
                weapon.getDmgMin(),
                weapon.getDmgMax()
        );

        return dto;
    }

    public static Weapon weaponDtoToWeapon(WeaponDto dto) {
        Weapon weapon = new Weapon();
        weapon.setPrice(dto.price());
        weapon.setWeaponTypeCode(dto.weaponType().getCode());
        weapon.setDmgMin(dto.dmgMin());
        weapon.setDmgMax(dto.dmgMax());

        return weapon;
    }
}

package jaji.home.demo.mapper;

import jaji.home.demo.dto.HeroDto;
import jaji.home.demo.entity.Hero;
import jaji.home.demo.enums.RoleType;

import javax.management.relation.Role;

public class HeroMapper {

    public static HeroDto HeroToHeroDto(Hero hero) {
        HeroDto dto = new HeroDto();

        dto.setName(hero.getName());
        dto.setRole(RoleType.getRoleByCode(hero.getRoleTypeCode()));
        dto.setAge(hero.getAge());
        dto.setAttack(hero.getAttack());
        dto.setDefense(hero.getDefense());
        dto.setWeaponDto(WeaponMapper.weaponToWeaponDto(hero.getWeapon()));

        return dto;
    }

    public static Hero HeroDtoToHero(HeroDto dto) {
        Hero hero = new Hero();
        hero.setName(dto.getName());
        hero.setAge(dto.getAge());
        hero.setRoleTypeCode(dto.getRole().getCode());
        hero.setAttack(dto.getAttack());
        hero.setDefense(dto.getDefense());
        hero.setWeapon(WeaponMapper.weaponDtoToWeapon(dto.getWeaponDto()));

        return hero;
    }
}

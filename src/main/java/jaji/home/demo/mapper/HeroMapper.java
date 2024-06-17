package jaji.home.demo.mapper;

import jaji.home.demo.dto.HeroDto;
import jaji.home.demo.entity.Hero;
import jaji.home.demo.enums.RoleType;

public class HeroMapper {

    public static HeroDto HeroToHeroDto(Hero hero) {
        HeroDto dto = new HeroDto(
                hero.getHeroId(),
                hero.getName(),
                RoleType.getRoleByCode(hero.getRoleTypeCode()),
                hero.getAge(),
                hero.getAttack(),
                hero.getDefense(),
                WeaponMapper.weaponToWeaponDto(hero.getWeapon())
        );

        return dto;
    }

    public static Hero HeroDtoToHero(HeroDto dto) {
        Hero hero = new Hero();
        hero.setName(dto.name());
        hero.setAge(dto.age());
        hero.setWeapon(WeaponMapper.weaponDtoToWeapon(dto.weaponDto()));

        return hero;
    }
}

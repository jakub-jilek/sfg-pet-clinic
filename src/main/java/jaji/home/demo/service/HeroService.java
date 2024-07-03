package jaji.home.demo.service;

import jaji.home.demo.dto.HeroDto;
import jaji.home.demo.entity.Hero;
import jaji.home.demo.entity.Weapon;
import jaji.home.demo.enums.RoleType;
import jaji.home.demo.mapper.HeroMapper;
import jaji.home.demo.repository.HeroRepository;
import jaji.home.demo.repository.WeaponRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class HeroService {

    private final HeroRepository heroRepository;
    private final WeaponRepository weaponRepository;

    public HeroService(HeroRepository heroRepository, WeaponRepository weaponRepository) {
        this.heroRepository = heroRepository;
        this.weaponRepository = weaponRepository;
    }

    public Hero create(HeroDto heroDto) {
        Hero hero = HeroMapper.HeroDtoToHero(heroDto);

        return heroRepository.save(hero);
    }

    public List<HeroDto> getAll() {
        List<Hero> heroList = (List<Hero>) this.heroRepository.findAll();
        return heroList.stream().map(HeroMapper::HeroToHeroDto).toList();
    }

    public String getHeroName(long heroId) {
        Hero hero = heroRepository.findById(heroId).orElse(null);

        if (hero == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        return hero.getName().concat(" (").concat(RoleType.getRoleByCode(hero.getRoleTypeCode()).toString()).concat(")");
    }

    public void deleteHeroById(long heroId) {
        this.heroRepository.deleteById(heroId);
    }

    public void enhanceWeapon(long weaponId) {
        Weapon weapon = this.weaponRepository.findById(weaponId).orElse(null);
        if (weapon == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        int enhancedDmdMin = (int) (weapon.getDmgMin() * 1.5);
        int enhancedDmdMax = (int) (weapon.getDmgMax() * 1.5);

        weapon.setDmgMin(enhancedDmdMin);
        weapon.setDmgMax(enhancedDmdMax);

        weaponRepository.save(weapon);
    }
}

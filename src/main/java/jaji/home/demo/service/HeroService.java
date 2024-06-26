package jaji.home.demo.service;

import jaji.home.demo.dto.HeroDto;
import jaji.home.demo.entity.Hero;
import jaji.home.demo.enums.RoleType;
import jaji.home.demo.mapper.HeroMapper;
import jaji.home.demo.repository.HeroRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class HeroService {

    private final HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
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
}

package jaji.home.demo.service;

import jaji.home.demo.dto.HeroDto;
import jaji.home.demo.entity.Hero;
import jaji.home.demo.mapper.HeroMapper;
import jaji.home.demo.repository.HeroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroService {

    private final HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public void create(HeroDto heroDto) {
        Hero hero = HeroMapper.HeroDtoToHero(heroDto);

        hero = heroRepository.save(hero);
        System.out.println(hero);
    }

    public List<HeroDto> getAll() {
        List<Hero> heroList = (List<Hero>) this.heroRepository.findAll();
        return heroList.stream().map(HeroMapper::HeroToHeroDto).toList();
    }
}

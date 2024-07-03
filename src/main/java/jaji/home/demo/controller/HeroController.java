package jaji.home.demo.controller;

import jaji.home.demo.dto.HeroDto;
import jaji.home.demo.entity.Hero;
import jaji.home.demo.service.HeroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/hero")
public class HeroController {

    private final HeroService heroService;

    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @PostMapping
    public ResponseEntity<Hero> create(@RequestBody HeroDto heroDto) {
        Hero hero = this.heroService.create(heroDto);

        return ResponseEntity.accepted().body(hero);
    }

    @GetMapping("/all")
    public List<HeroDto> getAll() {
        return this.heroService.getAll();
    }

    @GetMapping("/{heroId}/name")
    public String getHeroName(@PathVariable long heroId) {
        return this.heroService.getHeroName(heroId);
    }

    @DeleteMapping("/{heroId}")
    public void delete(@PathVariable long heroId) {
        this.heroService.deleteHeroById(heroId);
    }

    @PutMapping("/weapon/{weaponId}")
    public void enhanceWeapon(@PathVariable long weaponId) {
        this.heroService.enhanceWeapon(weaponId);
    }
}

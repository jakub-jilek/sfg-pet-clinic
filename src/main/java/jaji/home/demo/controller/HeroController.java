package jaji.home.demo.controller;

import jaji.home.demo.dto.HeroDto;
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
    public ResponseEntity<?> create(@RequestBody HeroDto heroDto) {
        this.heroService.create(heroDto);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/all")
    public List<HeroDto> getALl() {
        return this.heroService.getAll();
    }
}

package jaji.home.demo.repository;

import jaji.home.demo.entity.Hero;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HeroRepository extends CrudRepository<Hero, Long> {

    @Query("""
    select h from Hero h where h.roleTypeCode = 1
    """)
    List<Hero> getWarriorHero();

}

package jaji.home.demo.service;

import jaji.home.demo.entity.Hero;
import jaji.home.demo.entity.Weapon;
import jaji.home.demo.enums.RoleType;
import jaji.home.demo.enums.WeaponType;
import jaji.home.demo.repository.HeroRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Service for init data - first hero creation
 * */
@Service
public class InitService {

    private final static Logger logger = LogManager.getLogger(InitService.class);

    private final HeroRepository heroRepository;

    public InitService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    @PostConstruct
    public void init() {
        logger.info("Zahajuji inicializaci dat aplikace");
        heroRepository.deleteAll();

        Weapon wizardStaff = new Weapon();
        wizardStaff.setPrice(1000);
        wizardStaff.setWeaponTypeCode(WeaponType.STAFF.getCode());
        wizardStaff.setDmgMin(5);
        wizardStaff.setDmgMax(15);

        Hero jakub = new Hero();
        jakub.setAttack(wizardStaff.getDmgMax() + 5);
        jakub.setName("Mighty Jakub");
        jakub.setAge(150);
        jakub.setRoleTypeCode(RoleType.WIZARD.getCode());
        jakub.setDefense(6);
        jakub.setWeapon(wizardStaff);

        heroRepository.save(jakub);
    }
}

package pl.bykowski.springboothibernate.oneWayBinding.O2O;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Start {

    private FemaleRepo femaleRepo;
    private MaleRepo maleRepo;

    @Autowired
    public Start(FemaleRepo femaleRepo, MaleRepo maleRepo) {
        this.femaleRepo = femaleRepo;
        this.maleRepo = maleRepo;
    }

    @GetMapping("/addMaleAndFemale")
    public void init() {
        Female female = new Female("Ewa");
        Male male = new Male("Adam");
        female.setMale(male);
        maleRepo.save(male);
        femaleRepo.save(female);
    }
}

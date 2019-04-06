package pl.bykowski.springboothibernate.twowaybinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.bykowski.springboothibernate.oneWayBinding.O2O.Female;
import pl.bykowski.springboothibernate.oneWayBinding.O2O.FemaleRepo;
import pl.bykowski.springboothibernate.oneWayBinding.O2O.Male;
import pl.bykowski.springboothibernate.oneWayBinding.O2O.MaleRepo;

@RestController("start1")
public class Start {

    private CarRepo carRepo;
    private PlatesRepo platesRepo;

    @Autowired
    public Start(CarRepo carRepo, PlatesRepo platesRepo) {
        this.carRepo = carRepo;
        this.platesRepo = platesRepo;
    }

    @GetMapping("/addCarAndPlates")
    public void init() {
        Car car = new Car("BMW");
        Plates plates = new Plates("PO2321");
        car.setPlates(plates);

        platesRepo.save(plates);
        carRepo.save(car);

    }
}

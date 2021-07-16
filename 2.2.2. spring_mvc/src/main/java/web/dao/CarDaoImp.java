package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class CarDaoImp implements CarDao {

    private static  List<Car> listCar = new ArrayList<>();

    {
        listCar.add(new Car("Honda", "V4", 5550, 180));
        listCar.add(new Car("BMW", "V8", 15550.45, 280));
        listCar.add(new Car("Opel", "V4", 6800, 210));
        listCar.add(new Car("Toyota", "V6", 10000, 230));
        listCar.add(new Car("Mercedes-Bans", "V12", 20000.600, 352));
    }

    @Override
    public List<Car> getListCar(int count) {
        if (count == 0) {
            return listCar;

        }
        return listCar.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> getListAllCar() {
        return listCar.stream().collect(Collectors.toList());
    }
}

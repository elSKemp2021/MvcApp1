package ru.elskemp.dao;

import org.springframework.stereotype.Repository;
import ru.elskemp.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Mercedes-Benz M-class", "black", 2007, 650_000.00));
        carList.add(new Car("Hyundai ix35", "white", 2015, 945_000));
        carList.add(new Car("Land Rover Range Rover Evoque", "white", 2012, 1_490_000));
        carList.add(new Car("Peugeot 408", "black", 2017, 984_000.00));
        carList.add(new Car("Volkswagen Touareg II", "silver", 2013, 1_797_000));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
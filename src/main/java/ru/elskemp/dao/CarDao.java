package ru.elskemp.dao;

import ru.elskemp.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCars(int count);
}
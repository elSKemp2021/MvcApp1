package ru.elskemp.service;

import ru.elskemp.model.Car;

import java.util.List;


public interface CarService {
    List<Car> getCars(int count);
}

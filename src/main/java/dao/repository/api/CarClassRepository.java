package dao.repository.api;

import dao.entity.CarClass;

public interface CarClassRepository {
    CarClass getCarClassById(Long id);
}
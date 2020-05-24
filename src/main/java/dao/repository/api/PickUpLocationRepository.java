package dao.repository.api;

import dao.entity.PickUpLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PickUpLocationRepository extends JpaRepository<PickUpLocation, Long> {
}

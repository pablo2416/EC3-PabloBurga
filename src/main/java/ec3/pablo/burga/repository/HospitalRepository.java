package ec3.pablo.burga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ec3.pablo.burga.model.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

}

package co.com.k4soft.tarifa.repository;


import co.com.k4soft.tarifa.entity.TarifaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarifaRepository extends JpaRepository<TarifaEntity,Integer> {
}

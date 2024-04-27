package marcasapi.repository;

import marcasapi.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarcasRepository extends JpaRepository<Marca, Integer> {
    List<Marca> findAllByTpVeiculoIsOrderByNome(String tpVeiculo);
}

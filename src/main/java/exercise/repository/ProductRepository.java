package exercise.repository;

import exercise.common.repositories.BaseRepository;
import exercise.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface para el uso de JpaRepository.
 * @author: Azael Espinosa
 * @version: 12/10/2018/V1.0
 */

public interface ProductRepository extends BaseRepository<ProductEntity, Long> {
}

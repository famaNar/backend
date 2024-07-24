package tola.esp.tola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tola.esp.tola.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Vous pouvez ajouter des méthodes personnalisées de requête si nécessaire
}

package tola.esp.tola.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tola.esp.tola.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Ajoutez des méthodes personnalisées pour le repository de User si nécessaire
}

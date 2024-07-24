package tola.esp.tola.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tola.esp.tola.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    // Ajoutez des méthodes personnalisées pour le repository de Question si nécessaire
}

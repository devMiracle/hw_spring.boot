package net.miracle.broker.repositories;

import net.miracle.broker.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackDao extends JpaRepository<Feedback, Long> {

}

package mobility.pm.repository;

import mobility.pm.entity.ErrorCodesAndMessages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ErrorCodesAndMessagesRepository extends JpaRepository<ErrorCodesAndMessages, String> {
}

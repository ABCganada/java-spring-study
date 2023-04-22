package MysqlAndSpring.practice.repository;

import MysqlAndSpring.practice.domain.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {
}

package com.spring.boardCRUD.Repository;

import com.spring.boardCRUD.Entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}

package com.lu2code.springbootlibrary.dao;

import com.lu2code.springbootlibrary.entity.History;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface HistoryRepository extends JpaRepository<History,Long> {
    Page<History> findBookByUserEmail(@RequestParam("email") String userEmail, Pageable pageable);
}

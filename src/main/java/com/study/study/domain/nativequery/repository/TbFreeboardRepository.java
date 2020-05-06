package com.study.study.domain.nativequery.repository;

import com.study.study.domain.nativequery.entity.TbFreeboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface TbFreeboardRepository extends JpaRepository<TbFreeboard, Integer> {

    String deleteQuery = "delete from tb_freeboard "
                       + "where title like '%-%' "
                       + "  and title like '222%' ";

    @Transactional
    @Modifying
    @Query(value = deleteQuery, nativeQuery = true)
    Integer deleteFreeboard();
}

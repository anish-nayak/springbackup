package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.ResultEntity;


@Repository
public interface ResultRepository extends JpaRepository<ResultEntity, Long> {
	ResultEntity findByCandidateid(Long candidateid);

	List<ResultEntity> OrderByVotecountDesc();
}

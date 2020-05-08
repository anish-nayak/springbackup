package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.ElectionEntity;

public interface ElectionRepository extends JpaRepository<ElectionEntity, Long> {
	Boolean existsByElectionid(String electionid);

	Boolean deleteByElectionid(String electionId);

	List<ElectionEntity> findByElectionid(Long electionId);
}

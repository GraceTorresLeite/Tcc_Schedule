package com.tcc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcc.domain.model.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule,Long>{

}

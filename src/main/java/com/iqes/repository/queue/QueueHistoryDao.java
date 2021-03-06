package com.iqes.repository.queue;

import com.iqes.entity.QueueHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QueueHistoryDao extends JpaRepository<QueueHistory,Long>{

    @Query(value = "SELECT MAX(queue_end_time) from queue_history where table_type_id = ?1",nativeQuery = true)
    String getLastTime(long id);


    List<QueueHistory> getByCustomerName(String name);
}

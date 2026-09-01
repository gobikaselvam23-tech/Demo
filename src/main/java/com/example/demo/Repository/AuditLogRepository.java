package com.example.demo.Repository;
import com.example.demo.entity.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuditLogRepository {  

    public interface auditLogRepository extends JpaRepository<AuditLog, Long> {
    }
}

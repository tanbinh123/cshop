package com.javachen.email.repository;

import com.javachen.email.domain.EmailRecord;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author june
 * @createTime 2019-06-27 12:07
 * @see
 * @since
 */
public interface EmailRecordRepository extends JpaRepository<EmailRecord,Long> {
}

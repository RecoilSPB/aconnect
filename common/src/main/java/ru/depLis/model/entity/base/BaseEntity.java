package ru.depLis.model.entity.base;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import java.time.LocalDateTime;

/**
 * @author PopovN
 * @created 17.04.2025 16:56
 */

public abstract class BaseEntity {
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(insertable = false, updatable = false)
    private LocalDateTime createdate;
    @Column(insertable = false, updatable = false)
    private Long createby;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(insertable = false, updatable = false)
    private LocalDateTime updatedate;
    @Column(insertable = false, updatable = false)
    private Long updateby;
}

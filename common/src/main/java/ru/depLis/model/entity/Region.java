package ru.depLis.model.entity;

import ru.depLis.model.entity.base.BaseEntity;

import javax.persistence.*;
import java.util.UUID;

/**
 * @author PopovN
 * @created 17.04.2025 16:55
 */

@Entity
@Table(name = "region")
public class Region extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "region")
    @SequenceGenerator(name = "region", sequenceName = "s_region", allocationSize = 1)
    private long id;
    private UUID code;
    private String text;
    private String codeReg;
}

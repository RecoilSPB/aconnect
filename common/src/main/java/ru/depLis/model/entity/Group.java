package ru.depLis.model.entity;

import ru.depLis.model.entity.base.BaseEntity;

import javax.persistence.*;
import java.util.UUID;

/**
 * @author PopovN
 * @created 17.04.2025 16:54
 */

@Entity
@Table(name = "grp")
public class Group extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "grp")
    @SequenceGenerator(name = "grp", sequenceName = "s_grp", allocationSize = 1)
    private long id;
    private UUID code;
    private String text;
}

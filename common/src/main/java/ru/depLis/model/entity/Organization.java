package ru.depLis.model.entity;

import ru.depLis.model.entity.base.BaseEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * @author PopovN
 * @created 17.04.2025 16:51
 */

@Entity
public class Organization extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "organization")
    @SequenceGenerator(name = "organization", sequenceName = "s_organization", allocationSize = 1)
    private long id;

    private UUID code;
    private String text;
    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

    @Column(name = "customer_code")
    private String customerCode;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.MERGE,
                    CascadeType.REFRESH,
                    CascadeType.DETACH
            })
    @JoinTable(
            name = "organization_group",
            joinColumns = {@JoinColumn(name = "organization_id")},
            inverseJoinColumns = {@JoinColumn(name = "group_id")})
    private Set<Group> groups = new HashSet<>();
}

package ru.depLis.model.entity;

import ru.depLis.model.entity.base.BaseAgent;

import javax.persistence.*;
import java.util.UUID;

/**
 * @author PopovN
 * @created 17.04.2025 17:24
 */

public class ClientAgent extends BaseAgent {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "agent")
    @SequenceGenerator(name = "agent", sequenceName = "s_agent", allocationSize = 1)
    private long id;
    private UUID code;
    private String text;
    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;
    private String url;
    private String version;
}

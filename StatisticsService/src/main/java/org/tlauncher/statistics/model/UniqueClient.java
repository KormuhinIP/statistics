package org.tlauncher.statistics.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import java.sql.Timestamp;

@Entity
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class UniqueClient extends BaseEntity {

    private String os;
    private String versionJava;
    private String resolution;
    private double clientVersion;

    private String osVersion;
    //    private String clientId;
    private Timestamp date;
}

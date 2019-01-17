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
public class RunVersion extends BaseEntity {

    private String version;
    private Timestamp date;

}



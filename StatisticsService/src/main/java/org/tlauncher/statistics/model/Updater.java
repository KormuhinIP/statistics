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
public class Updater extends BaseEntity {

    private String client;
    private String offer;
    private Timestamp date;



    private String country;
    private double currentVersion;
    private double newVersion;



    private String args;
    private boolean updaterLater;
    private String requestTime;

}

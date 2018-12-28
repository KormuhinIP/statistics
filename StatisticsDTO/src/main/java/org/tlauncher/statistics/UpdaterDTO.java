package org.tlauncher.statistics;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonProperty;


@Data
public class UpdaterDTO {

    private String client;
    private String offer;
    private String country;
    private double currentVersion;
    private double newVersion;
    private String args;
    @JsonProperty("isUpdaterLater")
    private boolean updaterLater;
    private String requestTime;
}

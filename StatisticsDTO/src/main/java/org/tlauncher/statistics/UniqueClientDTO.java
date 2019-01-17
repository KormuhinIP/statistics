package org.tlauncher.statistics;

import lombok.Data;


@Data
public class UniqueClientDTO {

    private String os;
    private String versionJava;
    private String resolution;
    private double clientVersion;

    private String osVersion;
    //  private String clientId;

}

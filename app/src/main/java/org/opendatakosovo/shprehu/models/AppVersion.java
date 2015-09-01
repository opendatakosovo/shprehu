package org.opendatakosovo.shprehu.models;
import com.google.gson.annotations.Expose;

/**
 * Created by pechorin on 9/1/15.
 */
public class AppVersion {

    @Expose
    private Boolean forceUpdate;
    @Expose
    private Versions versions;

    /**
     *
     * @return
     * The forceUpdate
     */
    public Boolean getForceUpdate() {
        return forceUpdate;
    }

    /**
     *
     * @param forceUpdate
     * The forceUpdate
     */
    public void setForceUpdate(Boolean forceUpdate) {
        this.forceUpdate = forceUpdate;
    }

    /**
     *
     * @return
     * The versions
     */
    public Versions getVersions() {
        return versions;
    }

    /**
     *
     * @param versions
     * The versions
     */
    public void setVersions(Versions versions) {
        this.versions = versions;
    }

}

class Versions {

    @Expose
    private Double app;
    @Expose
    private Double config;

    /**
     * @return The app
     */
    public Double getApp() {
        return app;
    }

    /**
     * @param app The app
     */
    public void setApp(Double app) {
        this.app = app;
    }

    /**
     * @return The config
     */
    public Double getConfig() {
        return config;
    }

    /**
     * @param config The config
     */
    public void setConfig(Double config) {
        this.config = config;
    }
}
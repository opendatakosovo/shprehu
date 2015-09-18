package org.opendatakosovo.shprehu.models;




import android.util.Log;

import java.io.IOException;
import java.io.InputStream;

public class AppVersion {



    private Boolean forceUpdate;

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

    /**
     *
    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append("forceUpdate:"+getForceUpdate());
        sb.append("Versions:"+getVersions());

        Log.d("WHATTTT", "" + sb.toString());
        return sb.toString();


    }**/

}

class Versions extends InputStream {


    private Double app;

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

    @Override
    public int read() throws IOException {
        return 0;
    }





}
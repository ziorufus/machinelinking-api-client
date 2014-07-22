package com.machinelinking.api.client;

import java.io.Serializable;
import java.net.URL;

/**
 * An <i>Wikipedia</i> topic.
 *
 * @author Michele Mostarda (michele@machinelinking.com)
 */
public class Topic implements Serializable {

    private final String label;
    private final URL url;
    private final float probability;

    public Topic(String label, URL url, float probability) {
        this.label = label;
        this.url = url;
        this.probability = probability;
    }

    public String getLabel() {
        return label;
    }

    public URL getUrl() {
        return url;
    }

    public float getProbability() {
        return probability;
    }

}

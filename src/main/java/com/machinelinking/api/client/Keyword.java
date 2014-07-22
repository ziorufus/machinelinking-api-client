/*
 *  Copyright 2013 MachineLinking S.r.l.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.machinelinking.api.client;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Defines a keyword returned by the <b>/annotate</b> service.
 *
 * @author Michele Mostarda (michele@machinelinking.com)
 */
public class Keyword implements Serializable {

    private final String form;

    private final float rel;

    private final String sensePage;
    private final float senseProbability;

    private final String  _abstract;
    private final Clazz[] classes;
    private final Category[] categories;
    private final External[] externals;
    private final Alt[] alts;
    private final Cross[] crosses;
    private final Topic[] topics;
    private final Image[] images;

    private NGram[] nGrams;

    public Keyword(
            String form,
            float rel,
            String sensePage,
            float senseProbability,
            String _abstract,
            Clazz[] classes,
            Category[] categories,
            External[] externals,
            Alt[] alts,
            Cross[] crosses,
            Topic[] topics,
            NGram[] nGrams,
            Image[] images
    ) {
        this.form = form;
        this.rel = rel;
        this.sensePage = sensePage;
        this.senseProbability = senseProbability;
        this._abstract = _abstract;
        this.classes = classes;
        this.categories = categories;
        this.alts = alts;
        this.crosses = crosses;
        this.topics = topics;
        this.externals = externals;
        this.nGrams = nGrams;
        this.images = images;
    }

    public String getForm() {
        return form;
    }

    public float getRel() {
        return rel;
    }

    public String getSensePage() {
        return sensePage;
    }

    public float getSenseProbability() {
        return senseProbability;
    }

    public String getAbstract() {
        return _abstract;
    }

    public Clazz[] getClasses() {
        return classes;
    }

    public Category[] getCategories() {
        return categories;
    }

    public External[] getExternals() {
        return externals;
    }

    public Alt[] getAlts() {
        return alts;
    }

    public Cross[] getCrosses() {return crosses;}

    public Topic[] getTopics() { return topics; }

    public NGram[] getNGrams() {
        return nGrams;
    }

    public Image[] getImages() {
        return images;
    }

    @Override
    public String toString() {
        return String.format(
                "form: [%s], rel: %f, sense page: [%s], sense probability: %f, " +
                        "images: %s, classes: %s, categories: %s",
                form, rel, sensePage, senseProbability,
                Arrays.toString(images), Arrays.toString(classes), Arrays.toString(categories)
        );
    }

}

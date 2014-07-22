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
 * Models an annotation from the <i>MachineLinking</i> <b>/annotate</b> service.
 *
 * @see {@link com.machinelinking.api.client.APIClient#annotate(String, java.util.Map)}
 * @author Michele Mostarda (michele@machinelinking.com)
 */
public class AnnotationResponse implements Response, Serializable {

    private final String lang;

    private final Keyword[] keywords;

    private final Topic[] topics;

    private final int cost;

    public AnnotationResponse(String lang, Keyword[] keywords, Topic[] topics, int cost) {
        this.lang = lang;
        this.keywords = keywords;
        this.topics = topics;
        this.cost = cost;
    }

    @Override
    public String getLang() {
        return lang;
    }

    @Override
    public int getCost() {
        return cost;
    }

    public Keyword[] getKeywords() {
        return keywords;
    }

    public Topic[] getTopics() {
        return topics;
    }

    @Override
    public String toString() {
        return String.format("lang: [%s], keywords: %s", lang, Arrays.toString(keywords));
    }
}

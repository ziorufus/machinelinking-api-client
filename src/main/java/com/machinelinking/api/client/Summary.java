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

/**
 * @author Michele Mostarda (michele@machinelinking.com)
 */
public class Summary {

    private final String sentence;
    private final float weight;
    private final int start;
    private final int end;

    public Summary(String sentence, float weight, int start, int end) {
        this.sentence = sentence;
        this.weight = weight;
        this.start = start;
        this.end = end;
    }

    public String getSentence() {
        return sentence;
    }

    public float getWeight() {
        return weight;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

}

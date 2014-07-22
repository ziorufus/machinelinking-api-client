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

/**
 * Alternative form in annotation.
 *
 * @author Michele Mostarda (michele@machinelinking.com)
 */
public class Alt implements Serializable {

    private final String form;
    private final double freq;

    public Alt(String form, double freq) {
        this.form = form;
        this.freq = freq;
    }

    public String getForm() {
        return form;
    }

    public double getFreq() {
        return freq;
    }

    @Override
    public String toString() {
        return String.format("form: %s, freq: %f", form, freq);
    }

}

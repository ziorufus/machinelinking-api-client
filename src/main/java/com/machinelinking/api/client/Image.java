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
import java.net.URL;

/**
 * Defines an image associated to a resource.
 *
 * @author Michele Mostarda (michele@machinelinking.com)
 */
public class Image implements Serializable {

    private final URL image;
    private final URL thumb;

    public Image(URL image, URL thumb) {
        this.image = image;
        this.thumb = thumb;
    }

    public URL getImage() {
        return image;
    }

    public URL getThumb() {
        return thumb;
    }

    @Override
    public String toString() {
        return String.format("image: %s, thumb: %s", image, thumb);
    }

}

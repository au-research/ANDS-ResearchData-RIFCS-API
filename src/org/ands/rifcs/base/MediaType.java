/**
 * Copyright 2009 The Australian National University (ANU)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ands.rifcs.base;

import org.w3c.dom.Node;

/**
 * Class representing a RIF-CS media type object.
 *
 * @author Richard Walker
 * @since 3.0.0
 *
 */
public class MediaType extends RIFCSElement {
    /**
     * Construct a MediaType object.
     *
     * @param n
     *        A w3c Node, typically an Element
     *
     * @throws RIFCSException A RIFCSException
     */
    protected MediaType(final Node n) throws RIFCSException {
        super(n, Constants.ELEMENT_MEDIATYPE);
    }


    /**
     * Set the content.
     *
     * @param value
     *      The content of the media type
     */
    public final void setValue(final String value) {
        super.setTextContent(value);
    }


    /**
     * Obtain the content.
     *
     * @return
     *      The media type
     */
    public final String getValue() {
        return super.getTextContent();
    }
}

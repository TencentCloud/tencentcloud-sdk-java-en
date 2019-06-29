/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagSpecification  extends AbstractModel{

    /**
    * Type of resource bound to a tag. Only type "instance" and "host" are supported.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * List of tag pairs
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Obtain type of resource bound to a tag. Only type "instance" and "host" are supported.
     * @return ResourceType type of resource bound to a tag. Only type "instance" and "host" are supported.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set type of resource bound to a tag. Only type "instance" and "host" are supported.
     * @param ResourceType type of resource bound to a tag. Only type "instance" and "host" are supported.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Obtain ist of tag pairs
     * @return Tags List of tag pairs
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set list of tag pairs
     * @param Tags List of tag pairs
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}


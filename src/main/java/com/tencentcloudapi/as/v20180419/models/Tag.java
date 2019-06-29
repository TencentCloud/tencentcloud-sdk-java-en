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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Tag  extends AbstractModel{

    /**
    * Tag key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Tag key.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Type of resource that tag is bound. Current supported type: “auto-scaling-group” Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
     * Obtain tag key
     * @return Key Tag key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Tag key
     * @param Key Tag key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Obtain tag value
     * @return Value Tag value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set tag value
     * @param value tag value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Obtain the type of resource that tag is bound. Current supported type: “auto-scaling-group” Note: This field may return null, indicating that no valid value was found.
     * @return ResourceType The type of resource that tag is bound. Current supported type: “auto-scaling-group” Note: This field may return null, indicating that no valid value was found.
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set the type of resource that tag is bound. Current supported type: “auto-scaling-group” Note: This field may return null, indicating that no valid value was found.
     * @param ResourceType The type of resource that tag is bound. Current supported type: “auto-scaling-group” Note: This field may return null, indicating that no valid value was found.
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);

    }
}


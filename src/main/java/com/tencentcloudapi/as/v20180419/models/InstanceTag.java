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

public class InstanceTag  extends AbstractModel{

    /**
    * Tag key.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Tag value.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Obtain a tag key.
     * @return Key Tag key.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Configure a tag key.
     * @param Key Tag key.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Obtain a tag value.
     * @return Value Tag value.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Configure a tag value.
     * @param Value Tag value.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}


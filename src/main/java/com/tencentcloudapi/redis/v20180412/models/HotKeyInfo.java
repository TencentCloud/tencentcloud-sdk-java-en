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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HotKeyInfo extends AbstractModel{

    /**
    * Hot key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Count
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Hot key 
     * @return Key Hot key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Hot key
     * @param Key Hot key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Type 
     * @return Type Type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type
     * @param Type Type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Count 
     * @return Count Count
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Count
     * @param Count Count
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}


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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionDetail extends AbstractModel{

    /**
    * Region ID
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Region name in Chinese or English
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
     * Get Region ID 
     * @return RegionId Region ID
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
     * @param RegionId Region ID
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region name in Chinese or English 
     * @return RegionName Region name in Chinese or English
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name in Chinese or English
     * @param RegionName Region name in Chinese or English
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);

    }
}


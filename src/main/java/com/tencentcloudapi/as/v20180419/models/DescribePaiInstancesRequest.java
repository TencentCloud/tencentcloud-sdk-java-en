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

public class DescribePaiInstancesRequest  extends AbstractModel{

    /**
    * Query the details of PAI instances according to instance ID.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Filter conditions.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of values to be returned. Default is 20. Maximum is 100.
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * Offset. Default is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
     * Obtain query the details of PAI instances according to instance ID
     * @return InstanceIds Query the details of PAI instances according to instance ID.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set query the details of PAI instances according to instance ID
     * @param InstanceIds Query the details of PAI instances according to instance ID.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Obtain filter conditions.
     * @return Filters Filter conditions.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set filter conditions.
     * @param Filters Filter conditions.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Obtain number of values to be returned. Default is 20. Maximum is 100.
     * @return Limit Number of values to be returned. Default is 20. Maximum is 100.
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * Set number of values to be returned. Default is 20. Maximum is 100.
     * @param Limit Number of values to be returned. Default is 20. Maximum is 100.
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * Obtain offset. Default is 0.
     * @return Offset Offset. Default is 0.
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * Set offset. Default is 0.
     * @param Offset Offset. Default is 0.
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}


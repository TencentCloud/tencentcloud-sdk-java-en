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

public class DescribeInstanceParamsResponse  extends AbstractModel{

    /**
    * Number of instance parameters
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Instance parameter in Enum type
    */
    @SerializedName("InstanceEnumParam")
    @Expose
    private InstanceEnumParam [] InstanceEnumParam;

    /**
    * Instance parameter in Integer type
    */
    @SerializedName("InstanceIntegerParam")
    @Expose
    private InstanceIntegerParam [] InstanceIntegerParam;

    /**
    * Instance parameter in Char type
    */
    @SerializedName("InstanceTextParam")
    @Expose
    private InstanceTextParam [] InstanceTextParam;

    /**
    * Instance parameter in Multi type
    */
    @SerializedName("InstanceMultiParam")
    @Expose
    private InstanceMultiParam [] InstanceMultiParam;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of instance parameters 
     * @return TotalCount Number of instance parameters
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of instance parameters
     * @param TotalCount Number of instance parameters
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Instance parameter in Enum type 
     * @return InstanceEnumParam Instance parameter in Enum type
     */
    public InstanceEnumParam [] getInstanceEnumParam() {
        return this.InstanceEnumParam;
    }

    /**
     * Set Instance parameter in Enum type
     * @param InstanceEnumParam Instance parameter in Enum type
     */
    public void setInstanceEnumParam(InstanceEnumParam [] InstanceEnumParam) {
        this.InstanceEnumParam = InstanceEnumParam;
    }

    /**
     * Get Instance parameter in Integer type 
     * @return InstanceIntegerParam Instance parameter in Integer type
     */
    public InstanceIntegerParam [] getInstanceIntegerParam() {
        return this.InstanceIntegerParam;
    }

    /**
     * Set Instance parameter in Integer type
     * @param InstanceIntegerParam Instance parameter in Integer type
     */
    public void setInstanceIntegerParam(InstanceIntegerParam [] InstanceIntegerParam) {
        this.InstanceIntegerParam = InstanceIntegerParam;
    }

    /**
     * Get Instance parameter in Char type 
     * @return InstanceTextParam Instance parameter in Char type
     */
    public InstanceTextParam [] getInstanceTextParam() {
        return this.InstanceTextParam;
    }

    /**
     * Set Instance parameter in Char type
     * @param InstanceTextParam Instance parameter in Char type
     */
    public void setInstanceTextParam(InstanceTextParam [] InstanceTextParam) {
        this.InstanceTextParam = InstanceTextParam;
    }

    /**
     * Get Instance parameter in Multi type 
     * @return InstanceMultiParam Instance parameter in Multi type
     */
    public InstanceMultiParam [] getInstanceMultiParam() {
        return this.InstanceMultiParam;
    }

    /**
     * Set Instance parameter in Multi type
     * @param InstanceMultiParam Instance parameter in Multi type
     */
    public void setInstanceMultiParam(InstanceMultiParam [] InstanceMultiParam) {
        this.InstanceMultiParam = InstanceMultiParam;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "InstanceEnumParam.", this.InstanceEnumParam);
        this.setParamArrayObj(map, prefix + "InstanceIntegerParam.", this.InstanceIntegerParam);
        this.setParamArrayObj(map, prefix + "InstanceTextParam.", this.InstanceTextParam);
        this.setParamArrayObj(map, prefix + "InstanceMultiParam.", this.InstanceMultiParam);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


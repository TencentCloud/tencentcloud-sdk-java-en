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

public class DescribeInstancesOperationLimitResponse  extends AbstractModel{

    /**
    * The parameter meaning query limit of adjusting configuration(scaling down)
    */
    @SerializedName("InstanceOperationLimitSet")
    @Expose
    private OperationCountLimit [] InstanceOperationLimitSet;

    /**
    * The unique ID of a request, which is required for each troubleshooting case.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Obtain the parameter meaning query limit of adjusting configuration(scaling down)
     * @return InstanceOperationLimitSet The parameter means query limit of adjusting configuration(scaling down)
     */
    public OperationCountLimit [] getInstanceOperationLimitSet() {
        return this.InstanceOperationLimitSet;
    }

    /**
     * Set the parameter means query limit of adjusting configuration(scaling down)
     * @param InstanceOperationLimitSet The parameter means query limit of adjusting configuration(scaling down)
     */
    public void setInstanceOperationLimitSet(OperationCountLimit [] InstanceOperationLimitSet) {
        this.InstanceOperationLimitSet = InstanceOperationLimitSet;
    }

    /**
     * Obtain the unique ID of a request, which is required for each troubleshooting case.
     * @return RequestId The unique ID of a request, which is required for each troubleshooting case.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Configure the unique ID of a request, which is required for each troubleshooting case.
     * @param RequestId The unique ID of a request, which is required for each troubleshooting case.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, reserved from use 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InstanceOperationLimitSet.", this.InstanceOperationLimitSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


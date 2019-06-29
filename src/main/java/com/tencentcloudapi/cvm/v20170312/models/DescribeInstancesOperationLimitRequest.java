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

public class DescribeInstancesOperationLimitRequest  extends AbstractModel{

    /**
    * Query by one or more IDs of instance via [DescribeInstances](https://cloud.tencent.com/document/api/213/9388) the returned InstanceId from API. the sample as below: ins-xxxxxxxx。（the detailed format of parameters refer to API[introduction](chapter : ID.N of https://cloud.tencent.com/document/api/213/15688）。the upper limit of instance IDs of each request is 100.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Instance operation
<li> INSTANCE_DEGRADE：instance scaling down</li>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
     * Obtain query by one or more IDs of instance via [DescribeInstances](https://cloud.tencent.com/document/api/213/9388) the returned InstanceId from API. the sample as below: ins-xxxxxxxx。（the detailed format of parameters refer to API[introduction](chapter : ID.N of https://cloud.tencent.com/document/api/213/15688）。the upper limit of instance IDs of each request is 100.
     * @return InstanceIds Query by one or more IDs of instance via [DescribeInstances](https://cloud.tencent.com/document/api/213/9388) the returned InstanceId from API. the sample as below: ins-xxxxxxxx。（the detailed format of parameters refer to API[introduction](chapter : ID.N of https://cloud.tencent.com/document/api/213/15688）。the upper limit of instance IDs of each request is 100.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set query by one or more IDs of instance via [DescribeInstances](https://cloud.tencent.com/document/api/213/9388) the returned InstanceId from API. the sample as below: ins-xxxxxxxx。（the detailed format of parameters refer to API[introduction](chapter : ID.N of https://cloud.tencent.com/document/api/213/15688）。the upper limit of instance IDs of each request is 100.
     * @param InstanceIds Query by one or more IDs of instance via [DescribeInstances](https://cloud.tencent.com/document/api/213/9388) the returned InstanceId from API. the sample as below: ins-xxxxxxxx。（the detailed format of parameters refer to API[introduction](chapter : ID.N of https://cloud.tencent.com/document/api/213/15688）。the upper limit of instance IDs of each request is 100.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Obtain instance operation
<li> INSTANCE_DEGRADE：instance scaling down</li>
     * @return Operation instance operaiton
<li> INSTANCE_DEGRADE：instance scaling down</li>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set instance operation
<li> INSTANCE_DEGRADE：instance scaling down</li>
     * @param Operation instance operation
<li> INSTANCE_DEGRADE：instance scaling down</li>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Internal implementation, reserved from use 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Operation", this.Operation);

    }
}


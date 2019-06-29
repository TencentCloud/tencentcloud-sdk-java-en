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

public class OperationCountLimit  extends AbstractModel{

    /**
    * The opeartion of instance
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The number have been used, -1 in return means no number limited of this operation.
    */
    @SerializedName("CurrentCount")
    @Expose
    private Integer CurrentCount;

    /**
    * Maximum number of operations,-1 in return means no number limited of this operation,0 in return means Configuration adjust not supported.
    */
    @SerializedName("LimitCount")
    @Expose
    private Integer LimitCount;

    /**
     * Obtain the instance
     * @return Operation The opeartion of instance.
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * The operation of setting instance
     * @param Operation The opeartion of instance.
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Obtain instance ID
     * @return InstanceIds instance IDs
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Setting the ID of instance
     * @param InstanceId instance IDs
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Getting the number have been used, -1 in return means no number limited of this operation.
     * @return CurrentCount the number have been used, -1 in return means no number limited of this operation.
     */
    public Integer getCurrentCount() {
        return this.CurrentCount;
    }

    /**
     * Setting the number have been used, -1 in return means no number limited of this operation.
     * @param CurrentCount the number have been used, -1 in return means no number limited of this operation.
     */
    public void setCurrentCount(Integer CurrentCount) {
        this.CurrentCount = CurrentCount;
    }

    /**
     * Geting the maximum amount of operations,-1 in return means no number limited of this operation,0 in return means Configuration adjust not supported.
     * @return LimitCount The maximum amount of operations,-1 in return means no number limited of this operation,0 in return means Configuration adjust not supported.
     */
    public Integer getLimitCount() {
        return this.LimitCount;
    }

    /**
     * Setting the maximum amount of operations,-1 in return means no number limited of this operation,0 in return means Configuration adjust not supported.
     * @param LimitCount The maximum amount of operations,-1 in return means no number limited of this operation,0 in return means Configuration adjust not supported.
     */
    public void setLimitCount(Integer LimitCount) {
        this.LimitCount = LimitCount;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CurrentCount", this.CurrentCount);
        this.setParamSimple(map, prefix + "LimitCount", this.LimitCount);

    }
}


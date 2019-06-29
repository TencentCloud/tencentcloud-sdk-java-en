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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeletePolicyRequest  extends AbstractModel{

    /**
    * Array. Array elements are policy IDs. Policies can be deleted in batch
    */
    @SerializedName("PolicyId")
    @Expose
    private Long [] PolicyId;

    /**
     * Getting Array. Array elements are policy IDs. Policies can be deleted in batch
     * @return PolicyId Array. Array elements are policy IDs. Policies can be deleted in batch
     */
    public Long [] getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Configuring an array. Array elements are policy IDs. Policies can be deleted in batch
     * @param PolicyId Array. Array elements are policy IDs. Policies can be deleted in batch
     */
    public void setPolicyId(Long [] PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PolicyId.", this.PolicyId);

    }
}


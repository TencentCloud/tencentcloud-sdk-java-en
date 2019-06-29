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

public class InquiryPriceModifyInstancesChargeTypeRequest  extends AbstractModel{

    /**
    * ID(s) of one or more instances you are working with, which can be obtained from field value `InstanceId` in the returned result of API [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728). The maximum number of instances in a batch for each request is 100.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * [Billing type](https://intl.cloud.tencent.com/document/product/213/2180) of the instance.<br><li>PREPAID: Monthly Subscription.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * The relevant parameter setting for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis.
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
     * Get ID(s) of one or more instances you are working with, which can be obtained from field value `InstanceId` in the returned result of API [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728). The maximum number of instances in a batch for each request is 100.
     * @return InstanceIds ID(s) of one or more instances you are working with, which can be obtained from field value `InstanceId` in the returned result of API [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728). The maximum number of instances in a batch for each request is 100.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set ID(s) of one or more instances you are working with, which can be obtained from field value `InstanceId` in the returned result of API [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728). The maximum number of instances in a batch for each request is 100.
     * @param InstanceIds ID(s) of one or more instances you are working with, which can be obtained from field value `InstanceId` in the returned result of API [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728). The maximum number of instances in a batch for each request is 100.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get [billing type](https://intl.cloud.tencent.com/document/product/213/2180) of the instance.<br><li>PREPAID: Monthly Subscription.
     * @return InstanceChargeType [Billing type](https://intl.cloud.tencent.com/document/product/213/2180) of the instance.<br><li>PREPAID: Monthly Subscription.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set [billing type](https://intl.cloud.tencent.com/document/product/213/2180) of the instance.<br><li>PREPAID: Monthly Subscription.
     * @param InstanceChargeType [Billing type](https://intl.cloud.tencent.com/document/product/213/2180) of the instance.<br><li>PREPAID: Monthly Subscription.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get the relevant parameter setting for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis.
     * @return InstanceChargePrepaid The relevant parameter setting for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis.
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set the relevant parameter setting for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis.
     * @param InstanceChargePrepaid The relevant parameter setting for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis.
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * For internal use only
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);

    }
}


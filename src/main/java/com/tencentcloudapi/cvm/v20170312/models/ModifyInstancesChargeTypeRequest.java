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

public class ModifyInstancesChargeTypeRequest  extends AbstractModel{

    /**
    * ID(s) of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * For more information, see [Service Migration FAQs](https://intl.cloud.tencent.com/document/product/213/2180).<br><li>PREPAID: Prepaid.
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
     * To obtain ID(s) of one or more instances, you can obtain ID(s) from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 1.
     * @return InstanceIds ID(s) of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 1.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * To configure ID(s) of one or more instances, you can obtain ID(s) from [`DescribeInstances`](https://cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.The maximum number of instances for each request is 1.
     * @param InstanceIds  of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 1.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * For more information, see [Service Migration FAQs](https://intl.cloud.tencent.com/document/product/213/2180).<br><li>PREPAID: Prepaid.
     * @return InstanceChargeType 实例[计费类型] Instance [billing type](https://intl.cloud.tencent.com/document/product/213/2180).<br><li>PREPAID: Prepaid.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * For more information, see [Service Migration FAQs](https://intl.cloud.tencent.com/document/product/213/2180).<br><li>PREPAID: Prepaid.
     * @param InstanceChargeType Instance [billing type](https://intl.cloud.tencent.com/document/product/213/2180)。<br><li>PREPAID: Prepaid.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get the relevant parameter setting for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis.This parameter is mandatory if the billing method of the specified instance is prepaid
     * @return InstanceChargePrepaid Relevant parameter settings for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis. This parameter is mandatory if the billing method of the specified instance is prepaid. |
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set the relevant parameter setting for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis.This parameter is mandatory if the billing method of the specified instance is prepaid.
     * @param InstanceChargePrepaid Relevant parameter settings for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis. This parameter is mandatory if the billing method of the specified instance is prepaid. |
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);

    }
}


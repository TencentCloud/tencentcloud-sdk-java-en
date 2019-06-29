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

public class AllocateHostsRequest  extends AbstractModel{

    /**
    * Placement Location of instance. This parameter is used to specify the availability zone, project and other attributes of the instance
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * A string to ensure the idempotency of the request,
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Set relevant parameter for the prepaid mode. This parameter can specify the purchased usage period, set automatic renewal, and other attributes of prepaid instance. This parameter is mandatory if the billing method of the instance is prepaid
    */
    @SerializedName("HostChargePrepaid")
    @Expose
    private ChargePrepaid HostChargePrepaid;

    /**
    * Instance billing model, only prepaid supported.
    */
    @SerializedName("HostChargeType")
    @Expose
    private String HostChargeType;

    /**
    * CDH instance model, default: 'HS1'.
    */
    @SerializedName("HostType")
    @Expose
    private String HostType;

    /**
    * Amount of CDH instances purchased 
    */
    @SerializedName("HostCount")
    @Expose
    private Integer HostCount;

    /**
    * Tag description. This parameter can be used to bind a tag to a resource instance.
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
     * Get location of instance. This parameter is used to specify the availability zone and project to which the instance belongs.
     * @return Placement Placement location of instance. This parameter is used to specify the availability zone and project of instance.
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set location of instance. This parameter is used to specify availability zone,  project of instance.
     * @param Placement location of instance. This parameter is used to specify the availability zone and project of instance.
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get a string to ensure the idempotency of the request
     * @return ClientToken A string to ensure the idempotency of the request.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set A string to ensure the idempotency of the request.
     * @param ClientToken A string to ensure the idempotency of the request.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get prepaid mode parameter settings. This parameter can specify the usage period, set automatic renewal, and other attributes of the prepaid instance purchased. This parameter is mandatory if the billing method of the specified instance is prepaid.
     * @return HostChargePrepaid prepaid mode parameter setting. This parameter can specify the usage period, set automatic renewal, and other attributes of the prepaid instance purchased. This parameter is mandatory if the billing method of the specified instance is prepaid.
     */
    public ChargePrepaid getHostChargePrepaid() {
        return this.HostChargePrepaid;
    }

    /**
     * Set prepaid mode parameter. This parameter can specify the usage period, set automatic renewal, and other attributes of the prepaid instance purchased. This parameter is mandatory if the billing method of the specified instance is prepaid.
     * @param HostChargePrepaid Set prepaid mode parameter. This parameter can specify the usage period, set automatic renewal, and other attributes of the prepaid instance purchased. This parameter is mandatory if the billing method of the specified instance is prepaid.
     */
    public void setHostChargePrepaid(ChargePrepaid HostChargePrepaid) {
        this.HostChargePrepaid = HostChargePrepaid;
    }

    /**
     * Get instance billing mode. Only PREPAID mode is supported.
     * @return HostChargeType instance billing mode. Only PREPAID mode is supported.
     */
    public String getHostChargeType() {
        return this.HostChargeType;
    }

    /**
     * Set instance billing mode. Only PREPAID mode is supported.
     * @param HostChargeType Instance billing mode. Only PREPAID mode is supported.
     */
    public void setHostChargeType(String HostChargeType) {
        this.HostChargeType = HostChargeType;
    }

    /**
     * Get CDH instance mode, default 'HS1'.
     * @return HostType CDH instance mode, default 'HS1'.
     */
    public String getHostType() {
        return this.HostType;
    }

    /**
     * Set CDH instance mode, default 'HS1'.
     * @param HostType CDH instance mode, default 'HS1'.
     */
    public void setHostType(String HostType) {
        this.HostType = HostType;
    }

    /**
     * Get number of CDH instances purchased.
     * @return HostCount number of CDH instances purchased.
     */
    public Integer getHostCount() {
        return this.HostCount;
    }

    /**
     * Set number of CDH instances purchased.
     * @param HostCount number of CDH instances purchased.
     */
    public void setHostCount(Integer HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get tag description list. This parameter is used to bind a tag to a resource instance. 
     * @return TagSpecification Tag description list. This parameter is used to bind a tag to a resource instance.
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set tag description list. This parameter is used to bind a tag to a resource instance.
     * @param TagSpecification Tag description list. This parameter is used to bind a tag to a resource instance.
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamObj(map, prefix + "HostChargePrepaid.", this.HostChargePrepaid);
        this.setParamSimple(map, prefix + "HostChargeType", this.HostChargeType);
        this.setParamSimple(map, prefix + "HostType", this.HostType);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);

    }
}


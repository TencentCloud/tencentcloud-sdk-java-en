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

public class RenewHostsRequest  extends AbstractModel{

    /**
    * ID(s) of one or more CDH instances you are working with.
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
    * Relevant parameter settings for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis. This parameter is mandatory if the billing method of the specified instance is prepaid.
    */
    @SerializedName("HostChargePrepaid")
    @Expose
    private ChargePrepaid HostChargePrepaid;

    /**
     * Obtaining ID(s) of one or more CDH instances you are working with.
     * @return HostIds ID(s) of one or more CDH instance to be operated.
     */
    public String [] getHostIds() {
        return this.HostIds;
    }

    /**
     * Setting ID(s) of one or more CDH instances you are working with.
     * @param HostIds ID(s) of one or more CDH instance to be operated.
     */
    public void setHostIds(String [] HostIds) {
        this.HostIds = HostIds;
    }

    /**
     * Obtain relevant parameter settings for the prepaid mode: this parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis. This parameter is mandatory if the billing method of the specified instance is prepaid.
     * @return HostChargePrepaid Relevant parameter settings for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis. This parameter is mandatory if the billing method of the specified instance is prepaid.
     */
    public ChargePrepaid getHostChargePrepaid() {
        return this.HostChargePrepaid;
    }

    /**
     * Configure relevant parameter settings for the prepaid mode: this parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis. This parameter is mandatory if the billing method of the specified instance is prepaid.
     * @param HostChargePrepaid Relevant parameter settings for the prepaid mode. This parameter can specify the purchased usage period, whether to set automatic renewal, and other attributes of the instance purchased on a prepaid basis. This parameter is mandatory if the billing method of the specified instance is prepaid.
     */
    public void setHostChargePrepaid(ChargePrepaid HostChargePrepaid) {
        this.HostChargePrepaid = HostChargePrepaid;
    }

    /**
     * For internal use only
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);
        this.setParamObj(map, prefix + "HostChargePrepaid.", this.HostChargePrepaid);

    }
}


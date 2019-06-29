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

public class InternetChargeTypeConfig  extends AbstractModel{

    /**
    * Network Billing Method
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * Description of network billing method
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get network Billing Method
     * @return InternetChargeType Network billing type.
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set description of Network Billing Method.
     * @param InternetChargeType Network billing type.
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * Get description of network billing method.
     * @return Description description of network billing method.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set description of network billing method.
     * @param Description description of network billing method.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, reserved from use 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}


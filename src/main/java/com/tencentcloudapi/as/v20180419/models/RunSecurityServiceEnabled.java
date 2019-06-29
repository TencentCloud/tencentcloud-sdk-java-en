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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunSecurityServiceEnabled  extends AbstractModel{

    /**
    * Enable or disable [Cloud security](https://cloud.tencent.com/document/product/296)service.Value:<br><li>TRUE: Enable Cloud Security<br><li>FALSE: Disable Cloud Security<br><br>Default: TRUE Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Obtain setting of enable/disable [Cloud security] (https://cloud.tencent.com/document/product/296) service.Value:<br><li>TRUE: Enable Cloud Security<br><li>FALSE: Disable Cloud Security<br><br>Default: TRUE Note: This field may return null, indicating that no valid value was found.
     * @return Enabled Enabled or not [Cloud Security](https://cloud.tencent.com/document/product/296). Value range:<br><li>TRUE: Enable Cloud Security<br><li>FALSE: Disable Cloud Security<br><br>Default: TRUE Note: This field may return null, indicating that no valid value was found.
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Enabled or not [Cloud security](https://cloud.tencent.com/document/product/296) service.Value range:<br><li>TRUE: Enable Cloud Security<br><li>FALSE: Disable Cloud Security<br><br>Default: TRUE Note: This field may return null, indicating that no valid value was found.
     * @param Enabled Enable or disable [Cloud security](https://cloud.tencent.com/document/product/296) service. Value range:<br><li>TRUE: Enable Cloud Security<br><li>FALSE: Disable Cloud Security<br><br>Default: TRUE Note: This field may return null, indicating that no valid value was found.
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}


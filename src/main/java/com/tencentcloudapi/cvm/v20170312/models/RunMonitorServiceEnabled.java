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

public class RunMonitorServiceEnabled  extends AbstractModel{

    /**
    * Whether to enable [Cloud Monitor](/document/product/248) service. Values:<br><li>TRUE: Enable<br><li>FALSE: Do not enable<br><br>Default: TRUE
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Obtain whether to enable [Cloud Monitor](/document/product/248) service.<br><li>Whether to enable [Cloud Monitor](/document/product/248) service. Values:<br><li>FALSE: Do not enable<br><br>Default: TRUE
     * @return Enabled Whether to enable [Cloud Monitor](/document/product/248) service. Values:<br><li>TRUE: Enable<br><li>FALSE: Do not enable<br><br>Default: TRUE
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Configure whether to enable [Cloud Monitor](/document/product/248) service. Values:<br><li>TRUE: Enable<br><li>FALSE: Do not enable<br><br>Default: TRUE
     * @param Enabled Whether to enable [Cloud Monitor](/document/product/248) service. Values:<br><li>TRUE: Enable<br><li>FALSE: Do not enable<br><br>Default: TRUE
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


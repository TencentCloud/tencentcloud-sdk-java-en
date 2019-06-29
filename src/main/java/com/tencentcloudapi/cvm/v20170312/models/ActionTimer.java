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

public class ActionTimer  extends AbstractModel{

    /**
    * Extended data
    */
    @SerializedName("Externals")
    @Expose
    private Externals Externals;

    /**
    * Timer name. Only "TerminateInstances" is supported.
    */
    @SerializedName("TimerAction")
    @Expose
    private String TimerAction;

    /**
    * Execution time, which should be 5 minutes later than the current time. For example: 2018-5-29 11:26:40.
    */
    @SerializedName("ActionTime")
    @Expose
    private String ActionTime;

    /**
     * Get extended data
     * @return Externals extended data
     */
    public Externals getExternals() {
        return this.Externals;
    }

    /**
     * set extended data
     * @param Externals extended data
     */
    public void setExternals(Externals Externals) {
        this.Externals = Externals;
    }

    /**
     * Get Timer name. Only "TerminateInstances" is supported.
     * @return TimerAction Timer name. Only "TerminateInstances" is supported.
     */
    public String getTimerAction() {
        return this.TimerAction;
    }

    /**
     * Set Timer name. Only "TerminateInstances" is supported.
     * @param TimerAction Timer name. Only "TerminateInstances" is supported.
     */
    public void setTimerAction(String TimerAction) {
        this.TimerAction = TimerAction;
    }

    /**
     * Get execution time, which should be 5 minutes later than the current time. For example: 2018-5-29 11:26:40.
     * @return ActionTime Execution time, which should be 5 minutes later than the current time. For example: 2018-5-29 11:26:40
     */
    public String getActionTime() {
        return this.ActionTime;
    }

    /**
     * Set Execution time, which should be 5 minutes later than the current time. For example: 2018-5-29 11:26:40.
     * @param ActionTime Execution time, which should be 5 minutes later than the current time. For example: 2018-5-29 11:26:40.
     */
    public void setActionTime(String ActionTime) {
        this.ActionTime = ActionTime;
    }

    /**
     * Internally realized, users have no permission for it 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Externals.", this.Externals);
        this.setParamSimple(map, prefix + "TimerAction", this.TimerAction);
        this.setParamSimple(map, prefix + "ActionTime", this.ActionTime);

    }
}


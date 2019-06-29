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

public class StorageBlock  extends AbstractModel{

    /**
    * Type of local HDD storage. Value: LOCAL_PRO.Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Minimum size of local HDD storageNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("MinSize")
    @Expose
    private Integer MinSize;

    /**
    * Maximum size of local HDD storageNote: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("MaxSize")
    @Expose
    private Integer MaxSize;

    /**
     * Obtain type of local HDD storage. Value: LOCAL_PRO.Note: This field may return null, indicating that no valid value was found.
     * @return Type type of local HDD storage. Value: LOCAL_PRO.Note: This field may return null, indicating that no valid value was found.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set up type of local HDD storage. Value: LOCAL_PRO.Note: This field may return null, indicating that no valid value was found.
     * @param Type type of local HDD storage. Value: LOCAL_PRO.Note: This field may return null, indicating that no valid value was found.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Obtain minimum size of local HDD storageNote: This field may return null, indicating that no valid value was found.
     * @return MinSize minimum size of local HDD storageNote: This field may return null, indicating that no valid value was found.
     */
    public Integer getMinSize() {
        return this.MinSize;
    }

    /**
     * Set up minimum size of local HDD storageNote: This field may return null, indicating that no valid value was found.
     * Minimum size of local HDD storageNote: This field may return null, indicating that no valid value was found.
     */
    public void setMinSize(Integer MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Obtain maximum size of local HDD storageNote: This field may return null, indicating that no valid value was found.
     * @return MaxSize maximum size of local HDD storageNote: This field may return null, indicating that no valid value was found.
     */
    public Integer getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set up maximum size of local HDD storageNote: This field may return null, indicating that no valid value was found.
     * @param MaxSize Maximum size of local HDD storage.Note: This field may return null, indicating that no valid value was found.
     */
    public void setMaxSize(Integer MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);

    }
}


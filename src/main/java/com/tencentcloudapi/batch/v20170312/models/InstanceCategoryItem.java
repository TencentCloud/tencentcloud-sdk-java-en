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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceCategoryItem  extends AbstractModel{

    /**
    * Instance type name
    */
    @SerializedName("InstanceCategory")
    @Expose
    private String InstanceCategory;

    /**
    * List of instance families
    */
    @SerializedName("InstanceFamilySet")
    @Expose
    private String [] InstanceFamilySet;

    /**
     * Get Instance type name 
     * @return InstanceCategory Instance type name
     */
    public String getInstanceCategory() {
        return this.InstanceCategory;
    }

    /**
     * Set Instance type name
     * @param InstanceCategory Instance type name
     */
    public void setInstanceCategory(String InstanceCategory) {
        this.InstanceCategory = InstanceCategory;
    }

    /**
     * Get List of instance families 
     * @return InstanceFamilySet List of instance families
     */
    public String [] getInstanceFamilySet() {
        return this.InstanceFamilySet;
    }

    /**
     * Set List of instance families
     * @param InstanceFamilySet List of instance families
     */
    public void setInstanceFamilySet(String [] InstanceFamilySet) {
        this.InstanceFamilySet = InstanceFamilySet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceCategory", this.InstanceCategory);
        this.setParamArraySimple(map, prefix + "InstanceFamilySet.", this.InstanceFamilySet);

    }
}


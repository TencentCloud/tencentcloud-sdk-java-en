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

public class ResetInstancesPasswordRequest  extends AbstractModel{

    /**
    * ID(s) of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728)  in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Login password of the instance. The rule of password complexity varies with different operating systems: <br><li>`Linux`Password for a instance should be a combination of 8 to 16 characters comprised of at least two of the following types: `[a-z，A-Z]、[0-9]` and `[( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /]`中的符号。密码不允许以` starts with /`.<br><li>`Windows` password for an instance should be a combination of 12-16 characters comprised of at least three of the following types:`[a-z]，[A-Z]，[0-9]` and `[( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /]`中的符号。密码不允许以` starts with /`.<br><li>If both `Linux` and `Windows` instances are included, the password complexity is subject to the requirement for a `Windows` instance.    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Username of the instance operating system for which the password needs to be reset. This parameter is limited to 64 characters.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Whether to perform forced shutdown on the running instance. It is recommended to manually shut down the running instance before resetting the user password. Values: <br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.<br><br>Just like powering off a physical PC, a forced shutdown may cause data loss or the corruption of file system. Be sure to perform forced shutdown only when the server cannot be shut down normally.
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
     * To obtain ID(s) of one or more instances, you can obtain ID(s) from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
     * @return InstanceIds ID(s) of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728)  in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * To configure ID(s) of one or more instances, you can obtain ID(s) from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728) in the returned value of API `InstanceId`.The maximum number of instances for each request is 100.
     * @param InstanceIds  of one or more instances you are working with, which can be obtained from [`DescribeInstances`](https://intl.cloud.tencent.com/document/api/213/15728)  in the returned value of API `InstanceId`.The maximum number of instances in a batch for each request is 100.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Obtain a instance’s login password: password complexity requirement varies with different operating systems, as shown below:<br><li>`Linux`Password for a instance should be a combination of 8 to 16 characters comprised of at least two of the following types: `[a-z，A-Z]、[0-9]` and `[( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /]`中的符号。密码不允许以` starts with /`.<br><li>`Windows` password for an instance should be a combination of 12-16 characters comprised of at least three of the following types:`[a-z]，[A-Z]，[0-9]` and `[( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /]`中的符号。密码不允许以` starts with /`.<br><li>If both `Linux` and `Windows` instances are included, the password complexity is subject to the requirement for a `Windows` instance.     * @return Password Instance login Password. Password complexity requirement varies with different operating systems, as shown below:<br><li>`Linux`Password for a instance should be a combination of 8 to 16 characters comprised of at least two of the following types: `[a-z，A-Z]、[0-9]` and `[( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /]`中的符号。密码不允许以` starts with /`.<br><li>`Windows` password for an instance should be a combination of 12-16 characters comprised of at least three of the following types:`[a-z]，[A-Z]，[0-9]` and `[( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /]`中的符号。密码不允许以` starts with /`.<br><li>If both `Linux` and `Windows` instances are included, the password complexity is subject to the requirement for a `Windows` instance.     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Configure login password of an instance.<br><li>`Linux`Password for a instance should be a combination of 8 to 16 characters comprised of at least two of the following types: `[a-z，A-Z]、[0-9]` and `[( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /]`中的符号。密码不允许以` starts with /`.<br><li>`Windows` password for an instance should be a combination of 12-16 characters comprised of at least three of the following types:`[a-z]，[A-Z]，[0-9]` and `[( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /]`中的符号。密码不允许以` starts with /`.<br><li>If both `Linux` and `Windows` instances are included, the password complexity is subject to the requirement for a `Windows` instance.     * @param Password Instance login Password. Password complexity requirement varies with different operating systems, as shown below:<br><li>`Linux` password for an instance should be a combination of 8 to 16 characters comprised of at least two of the following types: `[a-z，A-Z]、[0-9]` and `[( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /]`中的符号。密码不允许以` starts with /`.<br><li>`Windows` password for an instance should be a combination of 12-16 characters comprised of at least three of the following types:`[a-z]，[A-Z]，[0-9]` and `[( ) ~ ~ ! @ # $ % ^ & * - + = _ | { } [ ] : ; ' < > , . ? /]`中的符号。密码不允许以` starts with /`.<br><li>If both `Linux` and `Windows` instances are included, the password complexity is subject to the requirement for a `Windows` instance.     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Obtain username of the instance operating system for which the password needs to be reset. This parameter is limited to 64 characters.
     * @return UserName Username of the instance operating system for which the password needs to be reset. This parameter is limited to 64 characters.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Configure username of the instance operating system for which the password needs to be reset. This parameter is limited to 64 characters.
     * @param UserName Username of the instance operating system for which the password needs to be reset. This parameter is limited to 64 characters.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Understand whether to perform forced shutdown on the running instance. It is recommended to manually shut down the running instance before resetting the user password. Values:<br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.<br><br>Just like powering off a physical PC, a forced shutdown may cause data loss or the corruption of file system. Be sure to perform forced shutdown only when the server cannot be shut down normally.
     * @return ForceStop Whether to perform forced shutdown on the running instance. It is recommended to manually shut down the running instance before resetting the user password. Values:<br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.<br><br>Just like powering off a physical PC, a forced shutdown may cause data loss or the corruption of file system. Be sure to perform forced shutdown only when the server cannot be shut down normally.
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Configure whether to perform forced shutdown on the running instance. It is recommended to manually shut down the running instance before resetting the user password. Values:<br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.<br><br>Just like powering off a physical PC, a forced shutdown may cause data loss or the corruption of file system. Be sure to perform forced shutdown only when the server cannot be shut down normally.
     * @param ForceStop Whether to perform forced shutdown on the running instance. It is recommended to manually shut down the running instance before resetting the user password. Values: <br><li>TRUE: Perform a forced shutdown in case of a failed normal shutdown.<br><li>FALSE: Do not perform a forced shutdown.<br><br>Default: FALSE.<br><br>Just like powering off a physical PC, a forced shutdown may cause data loss or the corruption of file system. Be sure to perform forced shutdown only when the server cannot be shut down normally.
     */
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);

    }
}


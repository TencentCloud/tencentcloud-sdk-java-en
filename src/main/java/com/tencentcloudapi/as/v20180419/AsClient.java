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
package com.tencentcloudapi.as.v20180419;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.as.v20180419.models.*;

public class AsClient extends AbstractClient{
    private static String endpoint = "as.tencentcloudapi.com";
    private static String version = "2018-04-19";

    /**
     * Construct client
     * @param credential client credentials
     * @param region product region
     */
    public AsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * Construct client
     * @param credential client credentials
     * @param region product region
     * @param profile client profile
     */
    public AsClient(Credential credential, String region, ClientProfile profile) {
        super(AsClient.endpoint, AsClient.version, credential, region, profile);
    }

    /**
     *This API (AttachInstances) is used to add CVM instances to a scaling group.

     * @param req AttachInstancesRequest
     * @return AttachInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AttachInstancesResponse AttachInstances(AttachInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AttachInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AttachInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CompleteLifecycleAction) is used to perform the action to complete the lifecycle.

* The user can call this API to specify how a lifecycle hook is used (CONTINUE or ABANDON). If you do not call this API, the lifecycle hook will be processed according to “DefaultResult”. 

     * @param req CompleteLifecycleActionRequest
     * @return CompleteLifecycleActionResponse
     * @throws TencentCloudSDKException
     */
    public CompleteLifecycleActionResponse CompleteLifecycleAction(CompleteLifecycleActionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CompleteLifecycleActionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CompleteLifecycleActionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CompleteLifecycleAction"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateAutoScalingGroup) is used to create a scaling group.
     * @param req CreateAutoScalingGroupRequest
     * @return CreateAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoScalingGroupResponse CreateAutoScalingGroup(CreateAutoScalingGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAutoScalingGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAutoScalingGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAutoScalingGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateLaunchConfiguration) is used to create a launch configuration.

* You can modify a limited number of fields of the launch configuration with  `ModifyLaunchConfigurationAttributes` . If you want to use a new launch configuration, you must create one.

* You can create 20 launch configurations for each project. For more information, see [Use Limits](https://cloud.tencent.com/document/product/377/3120).

     * @param req CreateLaunchConfigurationRequest
     * @return CreateLaunchConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public CreateLaunchConfigurationResponse CreateLaunchConfiguration(CreateLaunchConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLaunchConfigurationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLaunchConfigurationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLaunchConfiguration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateLifeCycleHook) is used to create new lifecycle hooks.

* You can set notifications for lifecycle hooks. The notifications will be sent to your CMQ message queue. The format of the notification is as below: 

```
{
	"Service": "Tencent Cloud Auto Scaling",
	"Time": "2019-03-14T10:15:11Z",
	"AppId": "1251783334",
	"ActivityId": "asa-fznnvrja",
	"AutoScalingGroupId": "asg-rrrrtttt",
	"LifecycleHookId": "ash-xxxxyyyy",
	"LifecycleHookName": "my-hook",
	"LifecycleActionToken": "3080e1c9-0efe-4dd7-ad3b-90cd6618298f",
	"InstanceId": "ins-aaaabbbb",
	"LifecycleTransition": "INSTANCE_LAUNCHING",
	"NotificationMetadata": ""
}
```
     * @param req CreateLifecycleHookRequest
     * @return CreateLifecycleHookResponse
     * @throws TencentCloudSDKException
     */
    public CreateLifecycleHookResponse CreateLifecycleHook(CreateLifecycleHookRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLifecycleHookResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLifecycleHookResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLifecycleHook"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API （CreateNotificationConfiguration）is used to create notification. 
     * @param req CreateNotificationConfigurationRequest
     * @return CreateNotificationConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public CreateNotificationConfigurationResponse CreateNotificationConfiguration(CreateNotificationConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNotificationConfigurationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNotificationConfigurationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateNotificationConfiguration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreatePaiInstance) is used to create a Pai instance.
     * @param req CreatePaiInstanceRequest
     * @return CreatePaiInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreatePaiInstanceResponse CreatePaiInstance(CreatePaiInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePaiInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePaiInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreatePaiInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateScalingPolicy) is used to create an alarm trigger policy.
     * @param req CreateScalingPolicyRequest
     * @return CreateScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateScalingPolicyResponse CreateScalingPolicy(CreateScalingPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateScalingPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateScalingPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateScalingPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (CreateScheduledAction) is used to create a scheduled action.
     * @param req CreateScheduledActionRequest
     * @return CreateScheduledActionResponse
     * @throws TencentCloudSDKException
     */
    public CreateScheduledActionResponse CreateScheduledAction(CreateScheduledActionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateScheduledActionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateScheduledActionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateScheduledAction"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteAutoScalingGroup) is used to delete a scaling group. You can only delete a scaling group when no instance exists and no scaling activity is being executed in it.
     * @param req DeleteAutoScalingGroupRequest
     * @return DeleteAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAutoScalingGroupResponse DeleteAutoScalingGroup(DeleteAutoScalingGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAutoScalingGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAutoScalingGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAutoScalingGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteLaunchConfiguration) is used to delete a launch configuration.

* * If a launch configuration in the scaling group is in active status, then it cannot be deleted.

     * @param req DeleteLaunchConfigurationRequest
     * @return DeleteLaunchConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLaunchConfigurationResponse DeleteLaunchConfiguration(DeleteLaunchConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLaunchConfigurationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLaunchConfigurationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLaunchConfiguration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteLifeCycleHook) is used to delete a lifecycle hook.
     * @param req DeleteLifecycleHookRequest
     * @return DeleteLifecycleHookResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLifecycleHookResponse DeleteLifecycleHook(DeleteLifecycleHookRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLifecycleHookResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLifecycleHookResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLifecycleHook"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteNotificationConfiguration) is used to delete notifications. 
     * @param req DeleteNotificationConfigurationRequest
     * @return DeleteNotificationConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNotificationConfigurationResponse DeleteNotificationConfiguration(DeleteNotificationConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNotificationConfigurationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNotificationConfigurationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteNotificationConfiguration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteScalingPolicy) is used to delete alarm trigger policies.
     * @param req DeleteScalingPolicyRequest
     * @return DeleteScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScalingPolicyResponse DeleteScalingPolicy(DeleteScalingPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteScalingPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteScalingPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteScalingPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DeleteScheduledAction) is used to delete a scheduled action.
     * @param req DeleteScheduledActionRequest
     * @return DeleteScheduledActionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteScheduledActionResponse DeleteScheduledAction(DeleteScheduledActionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteScheduledActionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteScheduledActionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteScheduledAction"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeAccountLimits) is used to query the limits on the resources for your account.
     * @param req DescribeAccountLimitsRequest
     * @return DescribeAccountLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountLimitsResponse DescribeAccountLimits(DescribeAccountLimitsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountLimitsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountLimitsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAccountLimits"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeScalingActivity) is used to query scaling activity logs of scaling groups.
     * @param req DescribeAutoScalingActivitiesRequest
     * @return DescribeAutoScalingActivitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalingActivitiesResponse DescribeAutoScalingActivities(DescribeAutoScalingActivitiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAutoScalingActivitiesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutoScalingActivitiesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAutoScalingActivities"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeAutoScalingGroups) is used to query the information of one or more scaling groups.

* You can query the details of scaling groups according to ID, name, or launch configuration ID. For more information about filtering, see Filter `Filter`.
* If the parameter is empty, a certain number (specified by ``Limit``, the default is 20) of scaling groups are returned to the current user.
     * @param req DescribeAutoScalingGroupsRequest
     * @return DescribeAutoScalingGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalingGroupsResponse DescribeAutoScalingGroups(DescribeAutoScalingGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAutoScalingGroupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutoScalingGroupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAutoScalingGroups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeAutoScalingInstances) is used to query the information of auto scaling instances.

* You can query the details of instances according to ID or scaling group name. For more information about filtering, see Filter `Filter`.
* If the parameter is empty, a certain number (specified by ``Limit``, the default is 20) of instances are returned to the current user.
     * @param req DescribeAutoScalingInstancesRequest
     * @return DescribeAutoScalingInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoScalingInstancesResponse DescribeAutoScalingInstances(DescribeAutoScalingInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAutoScalingInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutoScalingInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAutoScalingInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeLaunchConfigurations) is used to query the information of one or more launch configurations.

* You can query the details of launch configurations according to ID or name. For more information about filtering, see Filter `Filter`.
* If the parameter is empty, a certain number (specified by ``Limit``, the default is 20) of launch configurations are returned to the current user.
     * @param req DescribeLaunchConfigurationsRequest
     * @return DescribeLaunchConfigurationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLaunchConfigurationsResponse DescribeLaunchConfigurations(DescribeLaunchConfigurationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLaunchConfigurationsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLaunchConfigurationsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLaunchConfigurations"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeLifecycleHooks) is used to query the information of lifecycle hooks.

* You can query the details of lifecycle hooks according to scaling group ID, lifecycle hook ID or lifecycle hook name. For more information about filtering, see Filter `Filter`.
* If the parameter is empty, a certain number (specified by ``Limit``, the default is 20) of lifecycle hooks are returned to the current user.
     * @param req DescribeLifecycleHooksRequest
     * @return DescribeLifecycleHooksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLifecycleHooksResponse DescribeLifecycleHooks(DescribeLifecycleHooksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLifecycleHooksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLifecycleHooksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLifecycleHooks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeNotificationConfigurations) is used to query the information of one or more notifications.  You can query the details of notifications according to notification ID or scaling group ID. For more information about filtering, see Filter `Filter`. If the parameter is empty, a certain number (specified by `Limit`, the default is 20) of notifications are returned to the current user.
     * @param req DescribeNotificationConfigurationsRequest
     * @return DescribeNotificationConfigurationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotificationConfigurationsResponse DescribeNotificationConfigurations(DescribeNotificationConfigurationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNotificationConfigurationsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNotificationConfigurationsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNotificationConfigurations"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribePaiInstances) is used to query the information of PAI instances.

* You can query the details of PAI instances according to instance ID or instance domain name. For more information about filtering, see Filter `Filter`.
* If the parameter is empty, a certain number (specified by ``Limit``, the default is 20) of PAI instances are returned to the current user.
     * @param req DescribePaiInstancesRequest
     * @return DescribePaiInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePaiInstancesResponse DescribePaiInstances(DescribePaiInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePaiInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePaiInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePaiInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeScalingPolicies) is used to query alarm trigger policies.
     * @param req DescribeScalingPoliciesRequest
     * @return DescribeScalingPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScalingPoliciesResponse DescribeScalingPolicies(DescribeScalingPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScalingPoliciesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScalingPoliciesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeScalingPolicies"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DescribeScheduledActions) is used to query the details of one or more scheduled actions.

* You can query the details of scheduled actions according to its ID, name, or scaling group ID. For more information about filtering, see Filter `Filter`.
* If the parameter is empty, a certain number (specified by `Limit`, the default is 20) of scheduled actions are returned to the current user.
     * @param req DescribeScheduledActionsRequest
     * @return DescribeScheduledActionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScheduledActionsResponse DescribeScheduledActions(DescribeScheduledActionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScheduledActionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScheduledActionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeScheduledActions"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DetachInstances) is used to remove CVM instances from a scaling group. Instances removed via this API will not be terminated.
     * @param req DetachInstancesRequest
     * @return DetachInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DetachInstancesResponse DetachInstances(DetachInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetachInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetachInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (DisableAutoScalingGroup) is used to disable a scaling group.
     * @param req DisableAutoScalingGroupRequest
     * @return DisableAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public DisableAutoScalingGroupResponse DisableAutoScalingGroup(DisableAutoScalingGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableAutoScalingGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableAutoScalingGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableAutoScalingGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (EnableAutoScalingGroup) is used to enable a scaling group.
     * @param req EnableAutoScalingGroupRequest
     * @return EnableAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public EnableAutoScalingGroupResponse EnableAutoScalingGroup(EnableAutoScalingGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableAutoScalingGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableAutoScalingGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableAutoScalingGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ExecuteScalingPolicy) is used to execute a scaling policy.

* It will execute scaling policies according to the scaling policy ID.
* If the scaling group the policy belongs to is already performing a scaling activity, it will reject executing the scaling policy. 
     * @param req ExecuteScalingPolicyRequest
     * @return ExecuteScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ExecuteScalingPolicyResponse ExecuteScalingPolicy(ExecuteScalingPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExecuteScalingPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ExecuteScalingPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ExecuteScalingPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyAutoScalingGroup) is used to modify a scaling group.
     * @param req ModifyAutoScalingGroupRequest
     * @return ModifyAutoScalingGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAutoScalingGroupResponse ModifyAutoScalingGroup(ModifyAutoScalingGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAutoScalingGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAutoScalingGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAutoScalingGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyDesiredCapacity) is used to modify the desired number of instances for a scaling group.
     * @param req ModifyDesiredCapacityRequest
     * @return ModifyDesiredCapacityResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDesiredCapacityResponse ModifyDesiredCapacity(ModifyDesiredCapacityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDesiredCapacityResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDesiredCapacityResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDesiredCapacity"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyLaunchConfigurationAttributes) is used to modify launch configuration attributes. 

* After the launch configuration is modified, the existing instances that have been created by it will not be changed, but new instances will be created according to the new configuration.
* This API only supports modifying simple launch configurations. 
     * @param req ModifyLaunchConfigurationAttributesRequest
     * @return ModifyLaunchConfigurationAttributesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLaunchConfigurationAttributesResponse ModifyLaunchConfigurationAttributes(ModifyLaunchConfigurationAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLaunchConfigurationAttributesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLaunchConfigurationAttributesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLaunchConfigurationAttributes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyLoadBalancers) is used to modify the load balancer of a scaling group.

* This API can specify a new load balancer configuration for the scaling group. The new configuration overwrites the original load balancer configuration.
* If you want to remove all load balancers from the scaling group, specify only the scaling group ID but not the specific load balancer when calling this API.
* This API will immediately modify the load balancer of the scaling group and generate a scaling activity to asynchronously modify the load balancer of the existing instances.
     * @param req ModifyLoadBalancersRequest
     * @return ModifyLoadBalancersResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancersResponse ModifyLoadBalancers(ModifyLoadBalancersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLoadBalancersResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLoadBalancersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLoadBalancers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyNotificationConfiguration) is used to modify notifications. 
     * @param req ModifyNotificationConfigurationRequest
     * @return ModifyNotificationConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNotificationConfigurationResponse ModifyNotificationConfiguration(ModifyNotificationConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNotificationConfigurationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNotificationConfigurationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyNotificationConfiguration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyScalingPolicy) is used to modify alarm trigger policies.
     * @param req ModifyScalingPolicyRequest
     * @return ModifyScalingPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyScalingPolicyResponse ModifyScalingPolicy(ModifyScalingPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyScalingPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyScalingPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyScalingPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (ModifyScheduledAction) is used to modify scheduled actions.
     * @param req ModifyScheduledActionRequest
     * @return ModifyScheduledActionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyScheduledActionResponse ModifyScheduledAction(ModifyScheduledActionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyScheduledActionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyScheduledActionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyScheduledAction"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (PreviewPaiDomainName) is used to preview PAI domain names. 

     * @param req PreviewPaiDomainNameRequest
     * @return PreviewPaiDomainNameResponse
     * @throws TencentCloudSDKException
     */
    public PreviewPaiDomainNameResponse PreviewPaiDomainName(PreviewPaiDomainNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PreviewPaiDomainNameResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PreviewPaiDomainNameResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PreviewPaiDomainName"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (RemoveInstances) is used to delete CVM instances from a scaling group. Instances created automatically by Auto Scaling will be terminated, while those created and added to the scaling group will be removed and retained.
     * @param req RemoveInstancesRequest
     * @return RemoveInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RemoveInstancesResponse RemoveInstances(RemoveInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RemoveInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (SetInstancesProtection) is used to enable removal protection for an instance.  When an instance has removal protection enabled, it will not be removed when scaling is triggered due to situations such as replacement of unhealthy instances, alarm trigger policies or threshold changes. 
     * @param req SetInstancesProtectionRequest
     * @return SetInstancesProtectionResponse
     * @throws TencentCloudSDKException
     */
    public SetInstancesProtectionResponse SetInstancesProtection(SetInstancesProtectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetInstancesProtectionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SetInstancesProtectionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SetInstancesProtection"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (UpgradeLaunchConfiguration) is used to upgrade launch configurations. 

* This API is used to upgrade launch configurations. The new configuration overwrites the original launch configuration. Default values will be used for optional fields that are left blank. 
* After the launch configuration is upgraded and modified, the existing instances that have been created by it will not be changed, but new instances will be created according to the new configuration.
     * @param req UpgradeLaunchConfigurationRequest
     * @return UpgradeLaunchConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeLaunchConfigurationResponse UpgradeLaunchConfiguration(UpgradeLaunchConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeLaunchConfigurationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeLaunchConfigurationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpgradeLaunchConfiguration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API (UpgradeLifecycleHook) is used to upgrade lifecycle hooks.

* This API is used to upgrade lifecycle hooks. The new configuration overwrites the original configuration. Default values will be used for optional fields that are left blank. 

     * @param req UpgradeLifecycleHookRequest
     * @return UpgradeLifecycleHookResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeLifecycleHookResponse UpgradeLifecycleHook(UpgradeLifecycleHookRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeLifecycleHookResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeLifecycleHookResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpgradeLifecycleHook"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}

/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful GetAccountSummary request.
 * </p>
 */
public class GetAccountSummaryResult implements Serializable, Cloneable {

    /**
     * A set of key value pairs containing information about IAM entity usage
     * and IAM quotas. <p> <code>SummaryMap</code> contains the following
     * keys: <ul> <li> <p><b>AccessKeysPerUserQuota</b> <p>The maximum number
     * of active access keys allowed for each IAM user. </li> <li>
     * <p><b>AccountAccessKeysPresent</b> <p>This value is 1 if the AWS
     * account (root) has an access key, otherwise it is 0. </li> <li>
     * <p><b>AccountMFAEnabled</b> <p>This value is 1 if the AWS account
     * (root) has an MFA device assigned, otherwise it is 0. </li> <li>
     * <p><b>AccountSigningCertificatesPresent</b> <p>This value is 1 if the
     * AWS account (root) has a signing certificate, otherwise it is 0. </li>
     * <li> <p><b>AssumeRolePolicySizeQuota</b> <p>The maximum allowed size
     * for assume role policy documents (trust policies), in non-whitespace
     * characters. </li> <li> <p><b>AttachedPoliciesPerGroupQuota</b> <p>The
     * maximum number of managed policies that can be attached to an IAM
     * group. </li> <li> <p><b>AttachedPoliciesPerRoleQuota</b> <p>The
     * maximum number of managed policies that can be attached to an IAM
     * role. </li> <li> <p><b>AttachedPoliciesPerUserQuota</b> <p>The maximum
     * number of managed policies that can be attached to an IAM user. </li>
     * <li> <p><b>GroupPolicySizeQuota</b> <p>The maximum allowed size for
     * the aggregate of all inline policies embedded in an IAM group, in
     * non-whitespace characters. </li> <li> <p><b>Groups</b> <p>The number
     * of IAM groups in the AWS account. </li> <li>
     * <p><b>GroupsPerUserQuota</b> <p>The maximum number of IAM groups each
     * IAM user can belong to. </li> <li> <p><b>GroupsQuota</b> <p>The
     * maximum number of IAM groups allowed in the AWS account. </li> <li>
     * <p><b>InstanceProfiles</b> <p>The number of instance profiles in the
     * AWS account. </li> <li> <p><b>InstanceProfilesQuota</b> <p>The maximum
     * number of instance profiles allowed in the AWS account. </li> <li>
     * <p><b>MFADevices</b> <p>The number of MFA devices in the AWS account,
     * including those assigned and unassigned. </li> <li>
     * <p><b>MFADevicesInUse</b> <p>The number of MFA devices that have been
     * assigned to an IAM user or to the AWS account (root). </li> <li>
     * <p><b>Policies</b> <p>The number of customer managed policies in the
     * AWS account. </li> <li> <p><b>PoliciesQuota</b> <p>The maximum number
     * of customer managed policies allowed in the AWS account. </li> <li>
     * <p><b>PolicySizeQuota</b> <p>The maximum allowed size of a customer
     * managed policy, in non-whitespace characters. </li> <li>
     * <p><b>PolicyVersionsInUse</b> <p>The number of managed policies that
     * are attached to IAM users, groups, or roles in the AWS account. </li>
     * <li> <p><b>PolicyVersionsInUseQuota</b> <p>The maximum number of
     * managed policies that can be attached to IAM users, groups, or roles
     * in the AWS account. </li> <li> <p><b>Providers</b> <p>The number of
     * identity providers in the AWS account. </li> <li>
     * <p><b>RolePolicySizeQuota</b> <p>The maximum allowed size for the
     * aggregate of all inline policies (access policies, not the trust
     * policy) embedded in an IAM role, in non-whitespace characters. </li>
     * <li> <p><b>Roles</b> <p>The number of IAM roles in the AWS account.
     * </li> <li> <p><b>RolesQuota</b> <p>The maximum number of IAM roles
     * allowed in the AWS account. </li> <li> <p><b>ServerCertificates</b>
     * <p>The number of server certificates in the AWS account. </li> <li>
     * <p><b>ServerCertificatesQuota</b> <p>The maximum number of server
     * certificates allowed in the AWS account. </li> <li>
     * <p><b>SigningCertificatesPerUserQuota</b> <p>The maximum number of
     * X.509 signing certificates allowed for each IAM user. </li> <li>
     * <p><b>UserPolicySizeQuota</b> <p>The maximum allowed size for the
     * aggregate of all inline policies embedded in an IAM user, in
     * non-whitespace characters. </li> <li> <p><b>Users</b> <p>The number of
     * IAM users in the AWS account. </li> <li> <p><b>UsersQuota</b> <p>The
     * maximum number of IAM users allowed in the AWS account. </li> <li>
     * <p><b>VersionsPerPolicyQuota</b> <p>The maximum number of policy
     * versions allowed for each managed policy. </li> </ul>
     */
    private java.util.Map<String,Integer> summaryMap;

    /**
     * A set of key value pairs containing information about IAM entity usage
     * and IAM quotas. <p> <code>SummaryMap</code> contains the following
     * keys: <ul> <li> <p><b>AccessKeysPerUserQuota</b> <p>The maximum number
     * of active access keys allowed for each IAM user. </li> <li>
     * <p><b>AccountAccessKeysPresent</b> <p>This value is 1 if the AWS
     * account (root) has an access key, otherwise it is 0. </li> <li>
     * <p><b>AccountMFAEnabled</b> <p>This value is 1 if the AWS account
     * (root) has an MFA device assigned, otherwise it is 0. </li> <li>
     * <p><b>AccountSigningCertificatesPresent</b> <p>This value is 1 if the
     * AWS account (root) has a signing certificate, otherwise it is 0. </li>
     * <li> <p><b>AssumeRolePolicySizeQuota</b> <p>The maximum allowed size
     * for assume role policy documents (trust policies), in non-whitespace
     * characters. </li> <li> <p><b>AttachedPoliciesPerGroupQuota</b> <p>The
     * maximum number of managed policies that can be attached to an IAM
     * group. </li> <li> <p><b>AttachedPoliciesPerRoleQuota</b> <p>The
     * maximum number of managed policies that can be attached to an IAM
     * role. </li> <li> <p><b>AttachedPoliciesPerUserQuota</b> <p>The maximum
     * number of managed policies that can be attached to an IAM user. </li>
     * <li> <p><b>GroupPolicySizeQuota</b> <p>The maximum allowed size for
     * the aggregate of all inline policies embedded in an IAM group, in
     * non-whitespace characters. </li> <li> <p><b>Groups</b> <p>The number
     * of IAM groups in the AWS account. </li> <li>
     * <p><b>GroupsPerUserQuota</b> <p>The maximum number of IAM groups each
     * IAM user can belong to. </li> <li> <p><b>GroupsQuota</b> <p>The
     * maximum number of IAM groups allowed in the AWS account. </li> <li>
     * <p><b>InstanceProfiles</b> <p>The number of instance profiles in the
     * AWS account. </li> <li> <p><b>InstanceProfilesQuota</b> <p>The maximum
     * number of instance profiles allowed in the AWS account. </li> <li>
     * <p><b>MFADevices</b> <p>The number of MFA devices in the AWS account,
     * including those assigned and unassigned. </li> <li>
     * <p><b>MFADevicesInUse</b> <p>The number of MFA devices that have been
     * assigned to an IAM user or to the AWS account (root). </li> <li>
     * <p><b>Policies</b> <p>The number of customer managed policies in the
     * AWS account. </li> <li> <p><b>PoliciesQuota</b> <p>The maximum number
     * of customer managed policies allowed in the AWS account. </li> <li>
     * <p><b>PolicySizeQuota</b> <p>The maximum allowed size of a customer
     * managed policy, in non-whitespace characters. </li> <li>
     * <p><b>PolicyVersionsInUse</b> <p>The number of managed policies that
     * are attached to IAM users, groups, or roles in the AWS account. </li>
     * <li> <p><b>PolicyVersionsInUseQuota</b> <p>The maximum number of
     * managed policies that can be attached to IAM users, groups, or roles
     * in the AWS account. </li> <li> <p><b>Providers</b> <p>The number of
     * identity providers in the AWS account. </li> <li>
     * <p><b>RolePolicySizeQuota</b> <p>The maximum allowed size for the
     * aggregate of all inline policies (access policies, not the trust
     * policy) embedded in an IAM role, in non-whitespace characters. </li>
     * <li> <p><b>Roles</b> <p>The number of IAM roles in the AWS account.
     * </li> <li> <p><b>RolesQuota</b> <p>The maximum number of IAM roles
     * allowed in the AWS account. </li> <li> <p><b>ServerCertificates</b>
     * <p>The number of server certificates in the AWS account. </li> <li>
     * <p><b>ServerCertificatesQuota</b> <p>The maximum number of server
     * certificates allowed in the AWS account. </li> <li>
     * <p><b>SigningCertificatesPerUserQuota</b> <p>The maximum number of
     * X.509 signing certificates allowed for each IAM user. </li> <li>
     * <p><b>UserPolicySizeQuota</b> <p>The maximum allowed size for the
     * aggregate of all inline policies embedded in an IAM user, in
     * non-whitespace characters. </li> <li> <p><b>Users</b> <p>The number of
     * IAM users in the AWS account. </li> <li> <p><b>UsersQuota</b> <p>The
     * maximum number of IAM users allowed in the AWS account. </li> <li>
     * <p><b>VersionsPerPolicyQuota</b> <p>The maximum number of policy
     * versions allowed for each managed policy. </li> </ul>
     *
     * @return A set of key value pairs containing information about IAM entity usage
     *         and IAM quotas. <p> <code>SummaryMap</code> contains the following
     *         keys: <ul> <li> <p><b>AccessKeysPerUserQuota</b> <p>The maximum number
     *         of active access keys allowed for each IAM user. </li> <li>
     *         <p><b>AccountAccessKeysPresent</b> <p>This value is 1 if the AWS
     *         account (root) has an access key, otherwise it is 0. </li> <li>
     *         <p><b>AccountMFAEnabled</b> <p>This value is 1 if the AWS account
     *         (root) has an MFA device assigned, otherwise it is 0. </li> <li>
     *         <p><b>AccountSigningCertificatesPresent</b> <p>This value is 1 if the
     *         AWS account (root) has a signing certificate, otherwise it is 0. </li>
     *         <li> <p><b>AssumeRolePolicySizeQuota</b> <p>The maximum allowed size
     *         for assume role policy documents (trust policies), in non-whitespace
     *         characters. </li> <li> <p><b>AttachedPoliciesPerGroupQuota</b> <p>The
     *         maximum number of managed policies that can be attached to an IAM
     *         group. </li> <li> <p><b>AttachedPoliciesPerRoleQuota</b> <p>The
     *         maximum number of managed policies that can be attached to an IAM
     *         role. </li> <li> <p><b>AttachedPoliciesPerUserQuota</b> <p>The maximum
     *         number of managed policies that can be attached to an IAM user. </li>
     *         <li> <p><b>GroupPolicySizeQuota</b> <p>The maximum allowed size for
     *         the aggregate of all inline policies embedded in an IAM group, in
     *         non-whitespace characters. </li> <li> <p><b>Groups</b> <p>The number
     *         of IAM groups in the AWS account. </li> <li>
     *         <p><b>GroupsPerUserQuota</b> <p>The maximum number of IAM groups each
     *         IAM user can belong to. </li> <li> <p><b>GroupsQuota</b> <p>The
     *         maximum number of IAM groups allowed in the AWS account. </li> <li>
     *         <p><b>InstanceProfiles</b> <p>The number of instance profiles in the
     *         AWS account. </li> <li> <p><b>InstanceProfilesQuota</b> <p>The maximum
     *         number of instance profiles allowed in the AWS account. </li> <li>
     *         <p><b>MFADevices</b> <p>The number of MFA devices in the AWS account,
     *         including those assigned and unassigned. </li> <li>
     *         <p><b>MFADevicesInUse</b> <p>The number of MFA devices that have been
     *         assigned to an IAM user or to the AWS account (root). </li> <li>
     *         <p><b>Policies</b> <p>The number of customer managed policies in the
     *         AWS account. </li> <li> <p><b>PoliciesQuota</b> <p>The maximum number
     *         of customer managed policies allowed in the AWS account. </li> <li>
     *         <p><b>PolicySizeQuota</b> <p>The maximum allowed size of a customer
     *         managed policy, in non-whitespace characters. </li> <li>
     *         <p><b>PolicyVersionsInUse</b> <p>The number of managed policies that
     *         are attached to IAM users, groups, or roles in the AWS account. </li>
     *         <li> <p><b>PolicyVersionsInUseQuota</b> <p>The maximum number of
     *         managed policies that can be attached to IAM users, groups, or roles
     *         in the AWS account. </li> <li> <p><b>Providers</b> <p>The number of
     *         identity providers in the AWS account. </li> <li>
     *         <p><b>RolePolicySizeQuota</b> <p>The maximum allowed size for the
     *         aggregate of all inline policies (access policies, not the trust
     *         policy) embedded in an IAM role, in non-whitespace characters. </li>
     *         <li> <p><b>Roles</b> <p>The number of IAM roles in the AWS account.
     *         </li> <li> <p><b>RolesQuota</b> <p>The maximum number of IAM roles
     *         allowed in the AWS account. </li> <li> <p><b>ServerCertificates</b>
     *         <p>The number of server certificates in the AWS account. </li> <li>
     *         <p><b>ServerCertificatesQuota</b> <p>The maximum number of server
     *         certificates allowed in the AWS account. </li> <li>
     *         <p><b>SigningCertificatesPerUserQuota</b> <p>The maximum number of
     *         X.509 signing certificates allowed for each IAM user. </li> <li>
     *         <p><b>UserPolicySizeQuota</b> <p>The maximum allowed size for the
     *         aggregate of all inline policies embedded in an IAM user, in
     *         non-whitespace characters. </li> <li> <p><b>Users</b> <p>The number of
     *         IAM users in the AWS account. </li> <li> <p><b>UsersQuota</b> <p>The
     *         maximum number of IAM users allowed in the AWS account. </li> <li>
     *         <p><b>VersionsPerPolicyQuota</b> <p>The maximum number of policy
     *         versions allowed for each managed policy. </li> </ul>
     */
    public java.util.Map<String,Integer> getSummaryMap() {
        
        if (summaryMap == null) {
            summaryMap = new java.util.HashMap<String,Integer>();
        }
        return summaryMap;
    }
    
    /**
     * A set of key value pairs containing information about IAM entity usage
     * and IAM quotas. <p> <code>SummaryMap</code> contains the following
     * keys: <ul> <li> <p><b>AccessKeysPerUserQuota</b> <p>The maximum number
     * of active access keys allowed for each IAM user. </li> <li>
     * <p><b>AccountAccessKeysPresent</b> <p>This value is 1 if the AWS
     * account (root) has an access key, otherwise it is 0. </li> <li>
     * <p><b>AccountMFAEnabled</b> <p>This value is 1 if the AWS account
     * (root) has an MFA device assigned, otherwise it is 0. </li> <li>
     * <p><b>AccountSigningCertificatesPresent</b> <p>This value is 1 if the
     * AWS account (root) has a signing certificate, otherwise it is 0. </li>
     * <li> <p><b>AssumeRolePolicySizeQuota</b> <p>The maximum allowed size
     * for assume role policy documents (trust policies), in non-whitespace
     * characters. </li> <li> <p><b>AttachedPoliciesPerGroupQuota</b> <p>The
     * maximum number of managed policies that can be attached to an IAM
     * group. </li> <li> <p><b>AttachedPoliciesPerRoleQuota</b> <p>The
     * maximum number of managed policies that can be attached to an IAM
     * role. </li> <li> <p><b>AttachedPoliciesPerUserQuota</b> <p>The maximum
     * number of managed policies that can be attached to an IAM user. </li>
     * <li> <p><b>GroupPolicySizeQuota</b> <p>The maximum allowed size for
     * the aggregate of all inline policies embedded in an IAM group, in
     * non-whitespace characters. </li> <li> <p><b>Groups</b> <p>The number
     * of IAM groups in the AWS account. </li> <li>
     * <p><b>GroupsPerUserQuota</b> <p>The maximum number of IAM groups each
     * IAM user can belong to. </li> <li> <p><b>GroupsQuota</b> <p>The
     * maximum number of IAM groups allowed in the AWS account. </li> <li>
     * <p><b>InstanceProfiles</b> <p>The number of instance profiles in the
     * AWS account. </li> <li> <p><b>InstanceProfilesQuota</b> <p>The maximum
     * number of instance profiles allowed in the AWS account. </li> <li>
     * <p><b>MFADevices</b> <p>The number of MFA devices in the AWS account,
     * including those assigned and unassigned. </li> <li>
     * <p><b>MFADevicesInUse</b> <p>The number of MFA devices that have been
     * assigned to an IAM user or to the AWS account (root). </li> <li>
     * <p><b>Policies</b> <p>The number of customer managed policies in the
     * AWS account. </li> <li> <p><b>PoliciesQuota</b> <p>The maximum number
     * of customer managed policies allowed in the AWS account. </li> <li>
     * <p><b>PolicySizeQuota</b> <p>The maximum allowed size of a customer
     * managed policy, in non-whitespace characters. </li> <li>
     * <p><b>PolicyVersionsInUse</b> <p>The number of managed policies that
     * are attached to IAM users, groups, or roles in the AWS account. </li>
     * <li> <p><b>PolicyVersionsInUseQuota</b> <p>The maximum number of
     * managed policies that can be attached to IAM users, groups, or roles
     * in the AWS account. </li> <li> <p><b>Providers</b> <p>The number of
     * identity providers in the AWS account. </li> <li>
     * <p><b>RolePolicySizeQuota</b> <p>The maximum allowed size for the
     * aggregate of all inline policies (access policies, not the trust
     * policy) embedded in an IAM role, in non-whitespace characters. </li>
     * <li> <p><b>Roles</b> <p>The number of IAM roles in the AWS account.
     * </li> <li> <p><b>RolesQuota</b> <p>The maximum number of IAM roles
     * allowed in the AWS account. </li> <li> <p><b>ServerCertificates</b>
     * <p>The number of server certificates in the AWS account. </li> <li>
     * <p><b>ServerCertificatesQuota</b> <p>The maximum number of server
     * certificates allowed in the AWS account. </li> <li>
     * <p><b>SigningCertificatesPerUserQuota</b> <p>The maximum number of
     * X.509 signing certificates allowed for each IAM user. </li> <li>
     * <p><b>UserPolicySizeQuota</b> <p>The maximum allowed size for the
     * aggregate of all inline policies embedded in an IAM user, in
     * non-whitespace characters. </li> <li> <p><b>Users</b> <p>The number of
     * IAM users in the AWS account. </li> <li> <p><b>UsersQuota</b> <p>The
     * maximum number of IAM users allowed in the AWS account. </li> <li>
     * <p><b>VersionsPerPolicyQuota</b> <p>The maximum number of policy
     * versions allowed for each managed policy. </li> </ul>
     *
     * @param summaryMap A set of key value pairs containing information about IAM entity usage
     *         and IAM quotas. <p> <code>SummaryMap</code> contains the following
     *         keys: <ul> <li> <p><b>AccessKeysPerUserQuota</b> <p>The maximum number
     *         of active access keys allowed for each IAM user. </li> <li>
     *         <p><b>AccountAccessKeysPresent</b> <p>This value is 1 if the AWS
     *         account (root) has an access key, otherwise it is 0. </li> <li>
     *         <p><b>AccountMFAEnabled</b> <p>This value is 1 if the AWS account
     *         (root) has an MFA device assigned, otherwise it is 0. </li> <li>
     *         <p><b>AccountSigningCertificatesPresent</b> <p>This value is 1 if the
     *         AWS account (root) has a signing certificate, otherwise it is 0. </li>
     *         <li> <p><b>AssumeRolePolicySizeQuota</b> <p>The maximum allowed size
     *         for assume role policy documents (trust policies), in non-whitespace
     *         characters. </li> <li> <p><b>AttachedPoliciesPerGroupQuota</b> <p>The
     *         maximum number of managed policies that can be attached to an IAM
     *         group. </li> <li> <p><b>AttachedPoliciesPerRoleQuota</b> <p>The
     *         maximum number of managed policies that can be attached to an IAM
     *         role. </li> <li> <p><b>AttachedPoliciesPerUserQuota</b> <p>The maximum
     *         number of managed policies that can be attached to an IAM user. </li>
     *         <li> <p><b>GroupPolicySizeQuota</b> <p>The maximum allowed size for
     *         the aggregate of all inline policies embedded in an IAM group, in
     *         non-whitespace characters. </li> <li> <p><b>Groups</b> <p>The number
     *         of IAM groups in the AWS account. </li> <li>
     *         <p><b>GroupsPerUserQuota</b> <p>The maximum number of IAM groups each
     *         IAM user can belong to. </li> <li> <p><b>GroupsQuota</b> <p>The
     *         maximum number of IAM groups allowed in the AWS account. </li> <li>
     *         <p><b>InstanceProfiles</b> <p>The number of instance profiles in the
     *         AWS account. </li> <li> <p><b>InstanceProfilesQuota</b> <p>The maximum
     *         number of instance profiles allowed in the AWS account. </li> <li>
     *         <p><b>MFADevices</b> <p>The number of MFA devices in the AWS account,
     *         including those assigned and unassigned. </li> <li>
     *         <p><b>MFADevicesInUse</b> <p>The number of MFA devices that have been
     *         assigned to an IAM user or to the AWS account (root). </li> <li>
     *         <p><b>Policies</b> <p>The number of customer managed policies in the
     *         AWS account. </li> <li> <p><b>PoliciesQuota</b> <p>The maximum number
     *         of customer managed policies allowed in the AWS account. </li> <li>
     *         <p><b>PolicySizeQuota</b> <p>The maximum allowed size of a customer
     *         managed policy, in non-whitespace characters. </li> <li>
     *         <p><b>PolicyVersionsInUse</b> <p>The number of managed policies that
     *         are attached to IAM users, groups, or roles in the AWS account. </li>
     *         <li> <p><b>PolicyVersionsInUseQuota</b> <p>The maximum number of
     *         managed policies that can be attached to IAM users, groups, or roles
     *         in the AWS account. </li> <li> <p><b>Providers</b> <p>The number of
     *         identity providers in the AWS account. </li> <li>
     *         <p><b>RolePolicySizeQuota</b> <p>The maximum allowed size for the
     *         aggregate of all inline policies (access policies, not the trust
     *         policy) embedded in an IAM role, in non-whitespace characters. </li>
     *         <li> <p><b>Roles</b> <p>The number of IAM roles in the AWS account.
     *         </li> <li> <p><b>RolesQuota</b> <p>The maximum number of IAM roles
     *         allowed in the AWS account. </li> <li> <p><b>ServerCertificates</b>
     *         <p>The number of server certificates in the AWS account. </li> <li>
     *         <p><b>ServerCertificatesQuota</b> <p>The maximum number of server
     *         certificates allowed in the AWS account. </li> <li>
     *         <p><b>SigningCertificatesPerUserQuota</b> <p>The maximum number of
     *         X.509 signing certificates allowed for each IAM user. </li> <li>
     *         <p><b>UserPolicySizeQuota</b> <p>The maximum allowed size for the
     *         aggregate of all inline policies embedded in an IAM user, in
     *         non-whitespace characters. </li> <li> <p><b>Users</b> <p>The number of
     *         IAM users in the AWS account. </li> <li> <p><b>UsersQuota</b> <p>The
     *         maximum number of IAM users allowed in the AWS account. </li> <li>
     *         <p><b>VersionsPerPolicyQuota</b> <p>The maximum number of policy
     *         versions allowed for each managed policy. </li> </ul>
     */
    public void setSummaryMap(java.util.Map<String,Integer> summaryMap) {
        this.summaryMap = summaryMap;
    }
    
    /**
     * A set of key value pairs containing information about IAM entity usage
     * and IAM quotas. <p> <code>SummaryMap</code> contains the following
     * keys: <ul> <li> <p><b>AccessKeysPerUserQuota</b> <p>The maximum number
     * of active access keys allowed for each IAM user. </li> <li>
     * <p><b>AccountAccessKeysPresent</b> <p>This value is 1 if the AWS
     * account (root) has an access key, otherwise it is 0. </li> <li>
     * <p><b>AccountMFAEnabled</b> <p>This value is 1 if the AWS account
     * (root) has an MFA device assigned, otherwise it is 0. </li> <li>
     * <p><b>AccountSigningCertificatesPresent</b> <p>This value is 1 if the
     * AWS account (root) has a signing certificate, otherwise it is 0. </li>
     * <li> <p><b>AssumeRolePolicySizeQuota</b> <p>The maximum allowed size
     * for assume role policy documents (trust policies), in non-whitespace
     * characters. </li> <li> <p><b>AttachedPoliciesPerGroupQuota</b> <p>The
     * maximum number of managed policies that can be attached to an IAM
     * group. </li> <li> <p><b>AttachedPoliciesPerRoleQuota</b> <p>The
     * maximum number of managed policies that can be attached to an IAM
     * role. </li> <li> <p><b>AttachedPoliciesPerUserQuota</b> <p>The maximum
     * number of managed policies that can be attached to an IAM user. </li>
     * <li> <p><b>GroupPolicySizeQuota</b> <p>The maximum allowed size for
     * the aggregate of all inline policies embedded in an IAM group, in
     * non-whitespace characters. </li> <li> <p><b>Groups</b> <p>The number
     * of IAM groups in the AWS account. </li> <li>
     * <p><b>GroupsPerUserQuota</b> <p>The maximum number of IAM groups each
     * IAM user can belong to. </li> <li> <p><b>GroupsQuota</b> <p>The
     * maximum number of IAM groups allowed in the AWS account. </li> <li>
     * <p><b>InstanceProfiles</b> <p>The number of instance profiles in the
     * AWS account. </li> <li> <p><b>InstanceProfilesQuota</b> <p>The maximum
     * number of instance profiles allowed in the AWS account. </li> <li>
     * <p><b>MFADevices</b> <p>The number of MFA devices in the AWS account,
     * including those assigned and unassigned. </li> <li>
     * <p><b>MFADevicesInUse</b> <p>The number of MFA devices that have been
     * assigned to an IAM user or to the AWS account (root). </li> <li>
     * <p><b>Policies</b> <p>The number of customer managed policies in the
     * AWS account. </li> <li> <p><b>PoliciesQuota</b> <p>The maximum number
     * of customer managed policies allowed in the AWS account. </li> <li>
     * <p><b>PolicySizeQuota</b> <p>The maximum allowed size of a customer
     * managed policy, in non-whitespace characters. </li> <li>
     * <p><b>PolicyVersionsInUse</b> <p>The number of managed policies that
     * are attached to IAM users, groups, or roles in the AWS account. </li>
     * <li> <p><b>PolicyVersionsInUseQuota</b> <p>The maximum number of
     * managed policies that can be attached to IAM users, groups, or roles
     * in the AWS account. </li> <li> <p><b>Providers</b> <p>The number of
     * identity providers in the AWS account. </li> <li>
     * <p><b>RolePolicySizeQuota</b> <p>The maximum allowed size for the
     * aggregate of all inline policies (access policies, not the trust
     * policy) embedded in an IAM role, in non-whitespace characters. </li>
     * <li> <p><b>Roles</b> <p>The number of IAM roles in the AWS account.
     * </li> <li> <p><b>RolesQuota</b> <p>The maximum number of IAM roles
     * allowed in the AWS account. </li> <li> <p><b>ServerCertificates</b>
     * <p>The number of server certificates in the AWS account. </li> <li>
     * <p><b>ServerCertificatesQuota</b> <p>The maximum number of server
     * certificates allowed in the AWS account. </li> <li>
     * <p><b>SigningCertificatesPerUserQuota</b> <p>The maximum number of
     * X.509 signing certificates allowed for each IAM user. </li> <li>
     * <p><b>UserPolicySizeQuota</b> <p>The maximum allowed size for the
     * aggregate of all inline policies embedded in an IAM user, in
     * non-whitespace characters. </li> <li> <p><b>Users</b> <p>The number of
     * IAM users in the AWS account. </li> <li> <p><b>UsersQuota</b> <p>The
     * maximum number of IAM users allowed in the AWS account. </li> <li>
     * <p><b>VersionsPerPolicyQuota</b> <p>The maximum number of policy
     * versions allowed for each managed policy. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param summaryMap A set of key value pairs containing information about IAM entity usage
     *         and IAM quotas. <p> <code>SummaryMap</code> contains the following
     *         keys: <ul> <li> <p><b>AccessKeysPerUserQuota</b> <p>The maximum number
     *         of active access keys allowed for each IAM user. </li> <li>
     *         <p><b>AccountAccessKeysPresent</b> <p>This value is 1 if the AWS
     *         account (root) has an access key, otherwise it is 0. </li> <li>
     *         <p><b>AccountMFAEnabled</b> <p>This value is 1 if the AWS account
     *         (root) has an MFA device assigned, otherwise it is 0. </li> <li>
     *         <p><b>AccountSigningCertificatesPresent</b> <p>This value is 1 if the
     *         AWS account (root) has a signing certificate, otherwise it is 0. </li>
     *         <li> <p><b>AssumeRolePolicySizeQuota</b> <p>The maximum allowed size
     *         for assume role policy documents (trust policies), in non-whitespace
     *         characters. </li> <li> <p><b>AttachedPoliciesPerGroupQuota</b> <p>The
     *         maximum number of managed policies that can be attached to an IAM
     *         group. </li> <li> <p><b>AttachedPoliciesPerRoleQuota</b> <p>The
     *         maximum number of managed policies that can be attached to an IAM
     *         role. </li> <li> <p><b>AttachedPoliciesPerUserQuota</b> <p>The maximum
     *         number of managed policies that can be attached to an IAM user. </li>
     *         <li> <p><b>GroupPolicySizeQuota</b> <p>The maximum allowed size for
     *         the aggregate of all inline policies embedded in an IAM group, in
     *         non-whitespace characters. </li> <li> <p><b>Groups</b> <p>The number
     *         of IAM groups in the AWS account. </li> <li>
     *         <p><b>GroupsPerUserQuota</b> <p>The maximum number of IAM groups each
     *         IAM user can belong to. </li> <li> <p><b>GroupsQuota</b> <p>The
     *         maximum number of IAM groups allowed in the AWS account. </li> <li>
     *         <p><b>InstanceProfiles</b> <p>The number of instance profiles in the
     *         AWS account. </li> <li> <p><b>InstanceProfilesQuota</b> <p>The maximum
     *         number of instance profiles allowed in the AWS account. </li> <li>
     *         <p><b>MFADevices</b> <p>The number of MFA devices in the AWS account,
     *         including those assigned and unassigned. </li> <li>
     *         <p><b>MFADevicesInUse</b> <p>The number of MFA devices that have been
     *         assigned to an IAM user or to the AWS account (root). </li> <li>
     *         <p><b>Policies</b> <p>The number of customer managed policies in the
     *         AWS account. </li> <li> <p><b>PoliciesQuota</b> <p>The maximum number
     *         of customer managed policies allowed in the AWS account. </li> <li>
     *         <p><b>PolicySizeQuota</b> <p>The maximum allowed size of a customer
     *         managed policy, in non-whitespace characters. </li> <li>
     *         <p><b>PolicyVersionsInUse</b> <p>The number of managed policies that
     *         are attached to IAM users, groups, or roles in the AWS account. </li>
     *         <li> <p><b>PolicyVersionsInUseQuota</b> <p>The maximum number of
     *         managed policies that can be attached to IAM users, groups, or roles
     *         in the AWS account. </li> <li> <p><b>Providers</b> <p>The number of
     *         identity providers in the AWS account. </li> <li>
     *         <p><b>RolePolicySizeQuota</b> <p>The maximum allowed size for the
     *         aggregate of all inline policies (access policies, not the trust
     *         policy) embedded in an IAM role, in non-whitespace characters. </li>
     *         <li> <p><b>Roles</b> <p>The number of IAM roles in the AWS account.
     *         </li> <li> <p><b>RolesQuota</b> <p>The maximum number of IAM roles
     *         allowed in the AWS account. </li> <li> <p><b>ServerCertificates</b>
     *         <p>The number of server certificates in the AWS account. </li> <li>
     *         <p><b>ServerCertificatesQuota</b> <p>The maximum number of server
     *         certificates allowed in the AWS account. </li> <li>
     *         <p><b>SigningCertificatesPerUserQuota</b> <p>The maximum number of
     *         X.509 signing certificates allowed for each IAM user. </li> <li>
     *         <p><b>UserPolicySizeQuota</b> <p>The maximum allowed size for the
     *         aggregate of all inline policies embedded in an IAM user, in
     *         non-whitespace characters. </li> <li> <p><b>Users</b> <p>The number of
     *         IAM users in the AWS account. </li> <li> <p><b>UsersQuota</b> <p>The
     *         maximum number of IAM users allowed in the AWS account. </li> <li>
     *         <p><b>VersionsPerPolicyQuota</b> <p>The maximum number of policy
     *         versions allowed for each managed policy. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetAccountSummaryResult withSummaryMap(java.util.Map<String,Integer> summaryMap) {
        setSummaryMap(summaryMap);
        return this;
    }

    /**
     * A set of key value pairs containing information about IAM entity usage
     * and IAM quotas. <p> <code>SummaryMap</code> contains the following
     * keys: <ul> <li> <p><b>AccessKeysPerUserQuota</b> <p>The maximum number
     * of active access keys allowed for each IAM user. </li> <li>
     * <p><b>AccountAccessKeysPresent</b> <p>This value is 1 if the AWS
     * account (root) has an access key, otherwise it is 0. </li> <li>
     * <p><b>AccountMFAEnabled</b> <p>This value is 1 if the AWS account
     * (root) has an MFA device assigned, otherwise it is 0. </li> <li>
     * <p><b>AccountSigningCertificatesPresent</b> <p>This value is 1 if the
     * AWS account (root) has a signing certificate, otherwise it is 0. </li>
     * <li> <p><b>AssumeRolePolicySizeQuota</b> <p>The maximum allowed size
     * for assume role policy documents (trust policies), in non-whitespace
     * characters. </li> <li> <p><b>AttachedPoliciesPerGroupQuota</b> <p>The
     * maximum number of managed policies that can be attached to an IAM
     * group. </li> <li> <p><b>AttachedPoliciesPerRoleQuota</b> <p>The
     * maximum number of managed policies that can be attached to an IAM
     * role. </li> <li> <p><b>AttachedPoliciesPerUserQuota</b> <p>The maximum
     * number of managed policies that can be attached to an IAM user. </li>
     * <li> <p><b>GroupPolicySizeQuota</b> <p>The maximum allowed size for
     * the aggregate of all inline policies embedded in an IAM group, in
     * non-whitespace characters. </li> <li> <p><b>Groups</b> <p>The number
     * of IAM groups in the AWS account. </li> <li>
     * <p><b>GroupsPerUserQuota</b> <p>The maximum number of IAM groups each
     * IAM user can belong to. </li> <li> <p><b>GroupsQuota</b> <p>The
     * maximum number of IAM groups allowed in the AWS account. </li> <li>
     * <p><b>InstanceProfiles</b> <p>The number of instance profiles in the
     * AWS account. </li> <li> <p><b>InstanceProfilesQuota</b> <p>The maximum
     * number of instance profiles allowed in the AWS account. </li> <li>
     * <p><b>MFADevices</b> <p>The number of MFA devices in the AWS account,
     * including those assigned and unassigned. </li> <li>
     * <p><b>MFADevicesInUse</b> <p>The number of MFA devices that have been
     * assigned to an IAM user or to the AWS account (root). </li> <li>
     * <p><b>Policies</b> <p>The number of customer managed policies in the
     * AWS account. </li> <li> <p><b>PoliciesQuota</b> <p>The maximum number
     * of customer managed policies allowed in the AWS account. </li> <li>
     * <p><b>PolicySizeQuota</b> <p>The maximum allowed size of a customer
     * managed policy, in non-whitespace characters. </li> <li>
     * <p><b>PolicyVersionsInUse</b> <p>The number of managed policies that
     * are attached to IAM users, groups, or roles in the AWS account. </li>
     * <li> <p><b>PolicyVersionsInUseQuota</b> <p>The maximum number of
     * managed policies that can be attached to IAM users, groups, or roles
     * in the AWS account. </li> <li> <p><b>Providers</b> <p>The number of
     * identity providers in the AWS account. </li> <li>
     * <p><b>RolePolicySizeQuota</b> <p>The maximum allowed size for the
     * aggregate of all inline policies (access policies, not the trust
     * policy) embedded in an IAM role, in non-whitespace characters. </li>
     * <li> <p><b>Roles</b> <p>The number of IAM roles in the AWS account.
     * </li> <li> <p><b>RolesQuota</b> <p>The maximum number of IAM roles
     * allowed in the AWS account. </li> <li> <p><b>ServerCertificates</b>
     * <p>The number of server certificates in the AWS account. </li> <li>
     * <p><b>ServerCertificatesQuota</b> <p>The maximum number of server
     * certificates allowed in the AWS account. </li> <li>
     * <p><b>SigningCertificatesPerUserQuota</b> <p>The maximum number of
     * X.509 signing certificates allowed for each IAM user. </li> <li>
     * <p><b>UserPolicySizeQuota</b> <p>The maximum allowed size for the
     * aggregate of all inline policies embedded in an IAM user, in
     * non-whitespace characters. </li> <li> <p><b>Users</b> <p>The number of
     * IAM users in the AWS account. </li> <li> <p><b>UsersQuota</b> <p>The
     * maximum number of IAM users allowed in the AWS account. </li> <li>
     * <p><b>VersionsPerPolicyQuota</b> <p>The maximum number of policy
     * versions allowed for each managed policy. </li> </ul>
     * <p>
     * The method adds a new key-value pair into SummaryMap parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into SummaryMap.
     * @param value The corresponding value of the entry to be added into SummaryMap.
     */
    public GetAccountSummaryResult addSummaryMapEntry(String key, Integer value) {
        if (null == this.summaryMap) {
            this.summaryMap = new java.util.HashMap<String,Integer>();
        }
        if (this.summaryMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.summaryMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SummaryMap.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public GetAccountSummaryResult clearSummaryMapEntries() {
        this.summaryMap = null;
        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSummaryMap() != null) sb.append("SummaryMap: " + getSummaryMap() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSummaryMap() == null) ? 0 : getSummaryMap().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetAccountSummaryResult == false) return false;
        GetAccountSummaryResult other = (GetAccountSummaryResult)obj;
        
        if (other.getSummaryMap() == null ^ this.getSummaryMap() == null) return false;
        if (other.getSummaryMap() != null && other.getSummaryMap().equals(this.getSummaryMap()) == false) return false; 
        return true;
    }
    
    @Override
    public GetAccountSummaryResult clone() {
        try {
            return (GetAccountSummaryResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    
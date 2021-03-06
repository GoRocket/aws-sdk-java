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

package com.amazonaws.services.codedeploy.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Generic Revision Info JSON Unmarshaller
 */
public class GenericRevisionInfoJsonUnmarshaller implements Unmarshaller<GenericRevisionInfo, JsonUnmarshallerContext> {

    public GenericRevisionInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        GenericRevisionInfo genericRevisionInfo = new GenericRevisionInfo();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    genericRevisionInfo.setDescription(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("deploymentGroups", targetDepth)) {
                    context.nextToken();
                    genericRevisionInfo.setDeploymentGroups(new ListUnmarshaller<String>(StringJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("firstUsedTime", targetDepth)) {
                    context.nextToken();
                    genericRevisionInfo.setFirstUsedTime(DateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastUsedTime", targetDepth)) {
                    context.nextToken();
                    genericRevisionInfo.setLastUsedTime(DateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("registerTime", targetDepth)) {
                    context.nextToken();
                    genericRevisionInfo.setRegisterTime(DateJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }

            token = context.nextToken();
        }
        
        return genericRevisionInfo;
    }

    private static GenericRevisionInfoJsonUnmarshaller instance;
    public static GenericRevisionInfoJsonUnmarshaller getInstance() {
        if (instance == null) instance = new GenericRevisionInfoJsonUnmarshaller();
        return instance;
    }
}
    
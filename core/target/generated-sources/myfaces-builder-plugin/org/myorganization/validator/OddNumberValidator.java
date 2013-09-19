/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.myorganization.validator;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;


// Generated from class org.myorganization.validator.AbstractOddNumberValidator.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class OddNumberValidator extends org.myorganization.validator.AbstractOddNumberValidator
{

    static public final String VALIDATOR_ID = 
        "org.myorganization.validator.OddNumberValidator";

    public OddNumberValidator()
    {
    }
    


    public Object saveState(FacesContext facesContext)
    {
        Object[] values = new Object[1];
        values[0] = super.saveState(facesContext);
        return values; 
    }

    public void restoreState(FacesContext facesContext, Object state)
    {
        Object[] values = (Object[])state;
        super.restoreState(facesContext,values[0]);
    }
}

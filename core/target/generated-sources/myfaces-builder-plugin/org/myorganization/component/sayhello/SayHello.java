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
package org.myorganization.component.sayhello;

import javax.el.ValueExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.PartialStateHolder;
import javax.faces.component.StateHolder;
import javax.faces.component.UIComponent;
import javax.faces.convert.Converter;


// Generated from class org.myorganization.component.sayhello.AbstractSayHello.
//
// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
public class SayHello extends org.myorganization.component.sayhello.AbstractSayHello
{

    static public final String COMPONENT_FAMILY =
        "javax.faces.Output";
    static public final String COMPONENT_TYPE =
        "org.myorganization.SayHello";
    static public final String DEFAULT_RENDERER_TYPE = 
        "org.myorganization.SayHelloRenderer";


    public SayHello()
    {
        setRendererType("org.myorganization.SayHelloRenderer");
    }

    public String getFamily()
    {
        return COMPONENT_FAMILY;
    }



    
    // Property: firstName
    public String getFirstName()
    {
        return (String) getStateHelper().eval(PropertyKeys.firstName);
    }
    
    public void setFirstName(String firstName)
    {
        getStateHelper().put(PropertyKeys.firstName, firstName ); 
    }    
    // Property: lastName
    public String getLastName()
    {
        return (String) getStateHelper().eval(PropertyKeys.lastName);
    }
    
    public void setLastName(String lastName)
    {
        getStateHelper().put(PropertyKeys.lastName, lastName ); 
    }    
    // Property: rendered
    public boolean isRendered()
    {
        return (Boolean) getStateHelper().eval(PropertyKeys.rendered, true);
    }
    
    public void setRendered(boolean rendered)
    {
        getStateHelper().put(PropertyKeys.rendered, rendered ); 
    }    

    protected enum PropertyKeys
    {
         firstName
        , lastName
        , rendered
    }

 }

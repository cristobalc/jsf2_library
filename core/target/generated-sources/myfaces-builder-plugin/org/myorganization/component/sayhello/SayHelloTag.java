// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.
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

import javax.faces.component.UIComponent;
import javax.el.ValueExpression;
import javax.el.MethodExpression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.convert.Converter;


public class SayHelloTag
    extends javax.faces.webapp.UIComponentELTag
{
    public SayHelloTag()
    {    
    }
    
    public String getComponentType()
    {
        return "org.myorganization.SayHello";
    }

    public String getRendererType()
    {
        return "org.myorganization.SayHelloRenderer";
    }

 
    private ValueExpression _firstName;
    
    public void setFirstName(ValueExpression firstName)
    {
        _firstName = firstName;
    }
 
    private ValueExpression _lastName;
    
    public void setLastName(ValueExpression lastName)
    {
        _lastName = lastName;
    }
 
    private ValueExpression _rendered;
    
    public void setRendered(ValueExpression rendered)
    {
        _rendered = rendered;
    }
 
    private ValueExpression _value;
    
    public void setValue(ValueExpression value)
    {
        _value = value;
    }
 
    private ValueExpression _converter;
    
    public void setConverter(ValueExpression converter)
    {
        _converter = converter;
    }

    protected void setProperties(UIComponent component)
    {
        if (!(component instanceof org.myorganization.component.sayhello.SayHello))
        {
            throw new IllegalArgumentException("Component "+
                component.getClass().getName() +" is no org.myorganization.component.sayhello.SayHello");
        }
        
        org.myorganization.component.sayhello.SayHello comp = (org.myorganization.component.sayhello.SayHello) component;
        
        super.setProperties(component);
        
        FacesContext context = getFacesContext();

        if (_firstName != null)
        {
            comp.setValueExpression("firstName", _firstName);
        } 
        if (_lastName != null)
        {
            comp.setValueExpression("lastName", _lastName);
        } 
        if (_rendered != null)
        {
            comp.setValueExpression("rendered", _rendered);
        } 
        if (_value != null)
        {
            comp.setValueExpression("value", _value);
        } 
        if (_converter != null)
        {
            if (!_converter.isLiteralText())
            {
                comp.setValueExpression("converter", _converter);
            }
            else
            {
                String s = _converter.getExpressionString();
                if (s != null)
                {            
                    Converter converter = getFacesContext().getApplication().createConverter(s);
                    comp.setConverter(converter);
                }
            }
        }
    }

    public void release()
    {
        super.release();
        _firstName = null;
        _lastName = null;
        _rendered = null;
        _value = null;
        _converter = null;
    }
}

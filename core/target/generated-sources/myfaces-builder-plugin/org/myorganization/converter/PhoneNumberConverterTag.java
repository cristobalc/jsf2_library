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
package org.myorganization.converter;

import javax.faces.context.FacesContext;
import javax.el.ELContext;
import javax.faces.convert.Converter;
import javax.el.ValueExpression;
import javax.faces.webapp.UIComponentTag;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;


public class PhoneNumberConverterTag
    extends org.apache.myfaces.commons.converter.ConverterTag
{

    public PhoneNumberConverterTag()
    {
        setConverterIdString("javax.faces.PhoneNumber");
    }

    public void setPageContext(PageContext context) {
        super.setPageContext(context);
        setConverterIdString("javax.faces.PhoneNumber");
    }

    protected Converter createConverter() throws JspException {
    
        ELContext elContext = FacesContext.getCurrentInstance().getELContext();            
        org.myorganization.converter.PhoneNumberConverter converter = (org.myorganization.converter.PhoneNumberConverter)super.createConverter();
        return converter;
    }

    public void release()
    {
        super.release();
    }
}

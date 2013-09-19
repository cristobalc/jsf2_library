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
package org.myorganization.validator;

import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.faces.validator.Validator;
import javax.faces.application.Application;
import javax.servlet.jsp.JspException;


public class OddNumberValidatorTag
    extends org.apache.myfaces.commons.validator.ValidatorBaseTag
{

    public OddNumberValidatorTag()
    {    
    }    

    protected Validator createValidator() throws JspException {
        String validatorId = "org.myorganization.validator.OddNumberValidator";
        Application appl = FacesContext.getCurrentInstance().getApplication();
        Validator validator = (Validator)appl.createValidator(validatorId);
        _setProperties(validator);
        return validator;
    }
    
    protected void _setProperties(Validator val) throws JspException {
        super._setProperties(val);    
        FacesContext facesContext = FacesContext.getCurrentInstance();

        org.myorganization.validator.OddNumberValidator validator = (org.myorganization.validator.OddNumberValidator) val;
    }

    public void release()
    {
        super.release();
    }
}

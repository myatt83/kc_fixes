/*
 * Copyright 2005-2014 The Kuali Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the License);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kuali.kra.proposaldevelopment.bo;

import org.kuali.kra.bo.KraPersistableBusinessObjectBase;

/**
 * 
 * This class is the bo class of mailby code.
 */
public class MailBy extends KraPersistableBusinessObjectBase {

    private String mailByCode;

    private String description;

//  ### Vivantech Fix : #39 / [#86133644] adding active indicator field and disabling the delete.
    private boolean active;
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMailByCode() {
        return mailByCode;
    }

    public void setMailByCode(String mailByCode) {
        this.mailByCode = mailByCode;
    }
    
//  ### Vivantech Fix : #39 / [#86133644] adding active indicator field and disabling the delete.
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}

/*
 * Copyright 2005-2014 The Kuali Foundation
 * 
 * Licensed under the Educational Community License, Version 2.0 (the "License");
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
package org.kuali.kra.committee.lookup.keyvalue;

import org.kuali.kra.committee.service.CommitteeService;
import org.kuali.kra.common.committee.lookup.keyvalue.CommitteeScheduleValuesFinderBase;
import org.kuali.kra.common.committee.service.CommitteeServiceBase;

/**
 * Finds the available set of dates where a protocol can be scheduled
 * for a review by a committee.
 * 
 * @author Kuali Research Administration Team (kualidev@oncourse.iu.edu)
 */
public class CommitteeScheduleValuesFinder extends CommitteeScheduleValuesFinderBase {
    
    /**
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 338230898950097350L;

    @Override
    protected Class<? extends CommitteeServiceBase> getCommitteeServiceClassHook() {
        return CommitteeService.class;
    }
}

/*
 * Copyright 2005-2014 The Kuali Foundation
 * 
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.opensource.org/licenses/ecl1.php
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kuali.kra.coi.notification;

/**
 * 
 * This class defines the replacement parameters available for the COI module
 */
public class CoiReplacementParameters {

    public static final String DOCUMENT_NUMBER = "{DOCUMENT_NUMBER}";
    public static final String SEQUENCE_NUMBER = "{SEQUENCE_NUMBER}";
    public static final String DISCLOSURE_ID = "{DISCLOSURE_ID}";
    public static final String DISCLOSURE_TYPE = "{DISCLOSURE_TYPE}";
    public static final String DISCLOSURE_NUMBER = "{DISCLOSURE_NUMBER}";
    public static final String DISCLOSURE_REPORTER = "{DISCLOSURE_REPORTER}";
    public static final String DISCLOSURE_STATUS = "{DISCLOSURE_STATUS}";
    
    public static final String[] REPLACEMENT_PARAMETERS = new String[] { DOCUMENT_NUMBER,
                                                                         SEQUENCE_NUMBER,
                                                                         DISCLOSURE_ID,
                                                                         DISCLOSURE_TYPE,
                                                                         DISCLOSURE_NUMBER,
                                                                         DISCLOSURE_REPORTER,
                                                                         DISCLOSURE_STATUS,
                                                                       };
}

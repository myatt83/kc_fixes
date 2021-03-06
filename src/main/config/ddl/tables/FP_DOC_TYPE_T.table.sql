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
CREATE TABLE FP_DOC_TYPE_T (
        FDOC_TYP_CD                    VARCHAR2(4) CONSTRAINT FP_DOC_TYPE_TN1 NOT NULL,
        OBJ_ID                         VARCHAR2(36) DEFAULT SYS_GUID() CONSTRAINT FP_DOC_TYPE_TN2 NOT NULL,
        VER_NBR                        NUMBER(8) DEFAULT 1 CONSTRAINT FP_DOC_TYPE_TN3 NOT NULL,
        FDOC_GRP_CD                    VARCHAR2(2),
        FDOC_NM                        VARCHAR2(40),
        FIN_ELIM_ELGBL_CD              VARCHAR2(1),
        FDOC_TYP_ACTIVE_CD             VARCHAR2(1),
        FDOC_RTNG_RULE_CD              VARCHAR2(1),
        FDOC_AUTOAPRV_DAYS             NUMBER(7),
        FDOC_BALANCED_CD               VARCHAR2(1),
        TRN_SCRBBR_OFST_GEN_IND        CHAR(1),
     CONSTRAINT FP_DOC_TYPE_TP1 PRIMARY KEY (
        FDOC_TYP_CD) ,
     CONSTRAINT FP_DOC_TYPE_TC0 UNIQUE (OBJ_ID) 
);

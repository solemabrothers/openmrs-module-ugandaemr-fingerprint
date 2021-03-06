/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 * <p>
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 * <p>
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.ugandaemrfingerprint.api.db;

import org.openmrs.module.ugandaemrfingerprint.UgandaEMRFingerprintService;
import org.openmrs.module.ugandaemrfingerprint.model.Fingerprint;

import java.util.List;

/**
 * Database methods for {@link UgandaEMRFingerprintService}.
 */
public interface UgandaEMRFingerprintDao {

    /*
     * Add DAO methods here
     */

    public List<Fingerprint> getPatientFingerPrint(String patientID);

    public List<Fingerprint> getPatientFingerPrints();

    public void savePatientFingerprint(Fingerprint fingerprint);

    public void deletePatientFingerPrint(String patientId);
}
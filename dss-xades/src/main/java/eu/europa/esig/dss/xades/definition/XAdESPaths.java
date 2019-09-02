package eu.europa.esig.dss.xades.definition;

public interface XAdESPaths {

	DSSNamespace getNamespace();

	String getSignedPropertiesUri();

	String getCounterSignatureUri();

	// ----------------------- From Object

	String getQualifyingPropertiesPath();

	String getSignedPropertiesPath();

	String getSignedSignaturePropertiesPath();

	String getSigningTimePath();

	String getSigningCertificatePath();

	String getSigningCertificateV2Path();

	String getSignatureProductionPlacePath();

	String getSignatureProductionPlaceV2Path();

	String getSignedDataObjectPropertiesPath();

	String getDataObjectFormatMimeType();

	String getDataObjectFormatObjectIdentifier();

	String getCommitmentTypeIndicationPath();

	String getUnsignedPropertiesPath();

	String getUnsignedSignaturePropertiesPath();

	String getCounterSignaturePath();

	String getAttributeRevocationRefsPath();

	String getCompleteRevocationRefsPath();

	String getCompleteCertificateRefsPath();

	String getCompleteCertificateRefsCertPath();

	String getCompleteCertificateRefsV2Path();

	String getCompleteCertificateRefsV2CertPath();

	String getAttributeCertificateRefsPath();

	String getAttributeCertificateRefsCertPath();

	String getAttributeCertificateRefsV2Path();

	String getAttributeCertificateRefsV2CertPath();

	String getCertificateValuesPath();

	String getRevocationValuesPath();

	String getAttributeRevocationValuesPath();

	String getTimeStampValidationDataRevocationValuesPath();

	String getSignatureTimestampsPath();

	String getSigAndRefsTimestampPath();

	String getSigAndRefsTimestampV2Path();

	String getSignaturePolicyIdentifier();

	String getEncapsulatedCertificateValuesPath();

	String getEncapsulatedAttrAuthoritiesCertValuesPath();

	String getEncapsulatedTimeStampValidationDataCertValuesPath();

	String getClaimedRolePath();

	String getClaimedRoleV2Path();

	String getCertifiedRolePath();

	String getCertifiedRoleV2Path();

	// ----------------

	String getCurrentCRLValuesChildren();

	String getCurrentCRLRefsChildren();

	String getCurrentOCSPValuesChildren();

	String getCurrentOCSPRefsChildren();

	String getCurrentOCSPRefResponderID();

	String getCurrentOCSPRefResponderIDByName();

	String getCurrentOCSPRefResponderIDByKey();

	String getCurrentOCSPRefProducedAt();

	String getCurrentDigestAlgAndValue();

	String getCurrentCertRefsCertChildren();

	String getCurrentCertChildren();

	String getCurrentCertDigest();

	String getCurrentEncapsulatedTimestamp();

	String getCurrentEncapsulatedCertificate();

	String getCurrentCertificateValuesEncapsulatedCertificate();

	String getCurrentRevocationValuesEncapsulatedOCSPValue();

	String getCurrentEncapsulatedOCSPValue();

	String getCurrentRevocationValuesEncapsulatedCRLValue();

	String getCurrentEncapsulatedCRLValue();

	String getCurrentIssuerSerialIssuerNamePath();

	String getCurrentIssuerSerialSerialNumberPath();

	String getCurrentIssuerSerialV2Path();

	String getCurrentCommitmentIdentifierPath();

	// --------------------------- Policy

	String getCurrentSignaturePolicyId();

	String getCurrentSignaturePolicyDigestAlgAndValue();

	String getCurrentSignaturePolicySPURI();

	String getCurrentSignaturePolicyDescription();

	String getCurrentSignaturePolicyImplied();

	String getCurrentInclude();

}

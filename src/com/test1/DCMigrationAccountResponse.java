package com.test1;

public class DCMigrationAccountResponse {
	private Integer dataMigrationId;
	private String dataMigrationOwner;
	private boolean activeAccount;
	private Integer dataMigrationTypeId;
	private String dataMigrationType;
	private String dataMigrationStatus;
	private Integer dataMigrationDescription;
	private Integer authorizerCount;
	private String authCountry;
	private Integer authRegionCode;
	private String exceptions;
	private String status;
	private String remarks;

	public DCMigrationAccountResponse() {

	}

	public DCMigrationAccountResponse(Integer dataMigrationId, String dataMigrationOwner, boolean activeAccount,
			Integer dataMigrationTypeId, String dataMigrationType, String dataMigrationStatus,
			Integer dataMigrationDescription, Integer authorizerCount, String authCountry, Integer authRegionCode,
			String exceptions, String status, String remarks) {
		super();
		this.dataMigrationId = dataMigrationId;
		this.dataMigrationOwner = dataMigrationOwner;
		this.activeAccount = activeAccount;
		this.dataMigrationTypeId = dataMigrationTypeId;
		this.dataMigrationType = dataMigrationType;
		this.dataMigrationStatus = dataMigrationStatus;
		this.dataMigrationDescription = dataMigrationDescription;
		this.authorizerCount = authorizerCount;
		this.authCountry = authCountry;
		this.authRegionCode = authRegionCode;
		this.exceptions = exceptions;
		this.status = status;
		this.remarks = remarks;
	}

	public Integer getDataMigrationId() {
		return dataMigrationId;
	}

	public void setDataMigrationId(Integer dataMigrationId) {
		this.dataMigrationId = dataMigrationId;
	}

	public String getDataMigrationOwner() {
		return dataMigrationOwner;
	}

	public void setDataMigrationOwner(String dataMigrationOwner) {
		this.dataMigrationOwner = dataMigrationOwner;
	}

	public boolean isActiveAccount() {
		return activeAccount;
	}

	public void setActiveAccount(boolean activeAccount) {
		this.activeAccount = activeAccount;
	}

	public Integer getDataMigrationTypeId() {
		return dataMigrationTypeId;
	}

	public void setDataMigrationTypeId(Integer dataMigrationTypeId) {
		this.dataMigrationTypeId = dataMigrationTypeId;
	}

	public String getDataMigrationType() {
		return dataMigrationType;
	}

	public void setDataMigrationType(String dataMigrationType) {
		this.dataMigrationType = dataMigrationType;
	}

	public String getDataMigrationStatus() {
		return dataMigrationStatus;
	}

	public void setDataMigrationStatus(String dataMigrationStatus) {
		this.dataMigrationStatus = dataMigrationStatus;
	}

	public Integer getDataMigrationDescription() {
		return dataMigrationDescription;
	}

	public void setDataMigrationDescription(Integer dataMigrationDescription) {
		this.dataMigrationDescription = dataMigrationDescription;
	}

	public Integer getAuthorizerCount() {
		return authorizerCount;
	}

	public void setAuthorizerCount(Integer authorizerCount) {
		this.authorizerCount = authorizerCount;
	}

	public String getAuthCountry() {
		return authCountry;
	}

	public void setAuthCountry(String authCountry) {
		this.authCountry = authCountry;
	}

	public Integer getAuthRegionCode() {
		return authRegionCode;
	}

	public void setAuthRegionCode(Integer authRegionCode) {
		this.authRegionCode = authRegionCode;
	}

	public String getExceptions() {
		return exceptions;
	}

	public void setExceptions(String exceptions) {
		this.exceptions = exceptions;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}

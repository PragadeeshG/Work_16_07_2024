package com.test1;

public class DCMigrationAccount {
	private Integer recordKey;
	private Integer dataCatalystMigrationCode;
	private String dataCatalystMigrationCodePosition;
	private String dataCatalystMigrationCodeLength;
	private String dataMigrationDigitsPosition;
	private String dataMigrationDigitsLength;
	private boolean withHoldingTaxPosition;
	private String withHoldingTaxLength;
	private String requiredTaxPosition;
	private String requiredTaxLength;
	private String fundraisingIdLength;
	private String fundraisingSpace;
	private String pulseSpaceName;
	private String futureMarket;

	public DCMigrationAccount() {

	}

	public DCMigrationAccount(Integer recordKey, Integer dataCatalystMigrationCode,
			String dataCatalystMigrationCodePosition, String dataCatalystMigrationCodeLength,
			String dataMigrationDigitsPosition, String dataMigrationDigitsLength, boolean withHoldingTaxPosition,
			String withHoldingTaxLength, String requiredTaxPosition, String requiredTaxLength,
			String fundraisingIdLength, String fundraisingSpace, String pulseSpaceName, String futureMarket) {
		super();
		this.recordKey = recordKey;
		this.dataCatalystMigrationCode = dataCatalystMigrationCode;
		this.dataCatalystMigrationCodePosition = dataCatalystMigrationCodePosition;
		this.dataCatalystMigrationCodeLength = dataCatalystMigrationCodeLength;
		this.dataMigrationDigitsPosition = dataMigrationDigitsPosition;
		this.dataMigrationDigitsLength = dataMigrationDigitsLength;
		this.withHoldingTaxPosition = withHoldingTaxPosition;
		this.withHoldingTaxLength = withHoldingTaxLength;
		this.requiredTaxPosition = requiredTaxPosition;
		this.requiredTaxLength = requiredTaxLength;
		this.fundraisingIdLength = fundraisingIdLength;
		this.fundraisingSpace = fundraisingSpace;
		this.pulseSpaceName = pulseSpaceName;
		this.futureMarket = futureMarket;
	}

	public Integer getRecordKey() {
		return recordKey;
	}

	public void setRecordKey(Integer recordKey) {
		this.recordKey = recordKey;
	}

	public Integer getDataCatalystMigrationCode() {
		return dataCatalystMigrationCode;
	}

	public void setDataCatalystMigrationCode(Integer dataCatalystMigrationCode) {
		this.dataCatalystMigrationCode = dataCatalystMigrationCode;
	}

	public String getDataCatalystMigrationCodePosition() {
		return dataCatalystMigrationCodePosition;
	}

	public void setDataCatalystMigrationCodePosition(String dataCatalystMigrationCodePosition) {
		this.dataCatalystMigrationCodePosition = dataCatalystMigrationCodePosition;
	}

	public String getDataCatalystMigrationCodeLength() {
		return dataCatalystMigrationCodeLength;
	}

	public void setDataCatalystMigrationCodeLength(String dataCatalystMigrationCodeLength) {
		this.dataCatalystMigrationCodeLength = dataCatalystMigrationCodeLength;
	}

	public String getDataMigrationDigitsPosition() {
		return dataMigrationDigitsPosition;
	}

	public void setDataMigrationDigitsPosition(String dataMigrationDigitsPosition) {
		this.dataMigrationDigitsPosition = dataMigrationDigitsPosition;
	}

	public String getDataMigrationDigitsLength() {
		return dataMigrationDigitsLength;
	}

	public void setDataMigrationDigitsLength(String dataMigrationDigitsLength) {
		this.dataMigrationDigitsLength = dataMigrationDigitsLength;
	}

	public boolean isWithHoldingTaxPosition() {
		return withHoldingTaxPosition;
	}

	public void setWithHoldingTaxPosition(boolean withHoldingTaxPosition) {
		this.withHoldingTaxPosition = withHoldingTaxPosition;
	}

	public String getWithHoldingTaxLength() {
		return withHoldingTaxLength;
	}

	public void setWithHoldingTaxLength(String withHoldingTaxLength) {
		this.withHoldingTaxLength = withHoldingTaxLength;
	}

	public String getRequiredTaxPosition() {
		return requiredTaxPosition;
	}

	public void setRequiredTaxPosition(String requiredTaxPosition) {
		this.requiredTaxPosition = requiredTaxPosition;
	}

	public String getRequiredTaxLength() {
		return requiredTaxLength;
	}

	public void setRequiredTaxLength(String requiredTaxLength) {
		this.requiredTaxLength = requiredTaxLength;
	}

	public String getFundraisingIdLength() {
		return fundraisingIdLength;
	}

	public void setFundraisingIdLength(String fundraisingIdLength) {
		this.fundraisingIdLength = fundraisingIdLength;
	}

	public String getFundraisingSpace() {
		return fundraisingSpace;
	}

	public void setFundraisingSpace(String fundraisingSpace) {
		this.fundraisingSpace = fundraisingSpace;
	}

	public String getPulseSpaceName() {
		return pulseSpaceName;
	}

	public void setPulseSpaceName(String pulseSpaceName) {
		this.pulseSpaceName = pulseSpaceName;
	}

	public String getFutureMarket() {
		return futureMarket;
	}

	public void setFutureMarket(String futureMarket) {
		this.futureMarket = futureMarket;
	}

}

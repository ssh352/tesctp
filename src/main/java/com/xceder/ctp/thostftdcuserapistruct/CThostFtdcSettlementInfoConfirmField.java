package com.xceder.ctp.thostftdcuserapistruct;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * \u6295\u8d44\u8005\u7ed3\u7b97\u7ed3\u679c\u786e\u8ba4\u4fe1\u606f<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */

public class CThostFtdcSettlementInfoConfirmField extends StructObject {
	public CThostFtdcSettlementInfoConfirmField() {
	}

	@Array({11L})
	@Field(0)
	private Pointer<Byte> BrokerID() {
		return this.io.getPointerField(this, 0);
	}

	@Array({11L})
	@Field(0)
	public void setBrokerID(String brokerID) {
		this.io.getPointerField(this, 0).setCString(brokerID);
	}

	public String getBrokerID() {
		return this.BrokerID().getCString();
	}

	@Array({13L})
	@Field(1)
	private Pointer<Byte> InvestorID() {
		return this.io.getPointerField(this, 1);
	}

	@Array({13L})
	@Field(1)
	public void setInvestorID(String investorID) {
		this.io.getPointerField(this, 1).setCString(investorID);
	}

	public String getInvestorID() {
		return this.InvestorID().getCString();
	}

	@Array({9L})
	@Field(2)
	private Pointer<Byte> ConfirmDate() {
		return this.io.getPointerField(this, 2);
	}

	@Array({9L})
	@Field(2)
	public void setConfirmDate(String confirmDate) {
		this.io.getPointerField(this, 2).setCString(confirmDate);
	}

	public String getConfirmDate() {
		return this.ConfirmDate().getCString();
	}

	@Array({9L})
	@Field(3)
	private Pointer<Byte> ConfirmTime() {
		return this.io.getPointerField(this, 3);
	}

	@Array({9L})
	@Field(3)
	public void setConfirmTime(String confirmTime) {
		this.io.getPointerField(this, 3).setCString(confirmTime);
	}

	public String getConfirmTime() {
		return this.ConfirmTime().getCString();
	}

	public CThostFtdcSettlementInfoConfirmField(Pointer pointer) {
		super(pointer);
	}
}

package com.xceder.ctp.thostftdcuserapistruct;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * \u4ea4\u6613\u7f16\u7801<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi")
public class CThostFtdcTradingCodeField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcInvestorIDType */
	@Array({13})
	@Field(0)
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11})
	@Field(1)
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9})
	@Field(2)
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcClientIDType */
	@Array({11})
	@Field(3)
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcBoolType */
	@Field(4)
	public int IsActive() {
		return this.io.getIntField(this, 4);
	}
	/** C type : TThostFtdcBoolType */
	@Field(4)
	public CThostFtdcTradingCodeField IsActive(int IsActive) {
		this.io.setIntField(this, 4, IsActive);
		return this;
	}
	/** C type : TThostFtdcClientIDTypeType */
	@Field(5)
	public byte ClientIDType() {
		return this.io.getByteField(this, 5);
	}
	/** C type : TThostFtdcClientIDTypeType */
	@Field(5)
	public CThostFtdcTradingCodeField ClientIDType(byte ClientIDType) {
		this.io.setByteField(this, 5, ClientIDType);
		return this;
	}
	public CThostFtdcTradingCodeField() {
		super();
	}
	public CThostFtdcTradingCodeField(Pointer pointer) {
		super(pointer);
	}
}

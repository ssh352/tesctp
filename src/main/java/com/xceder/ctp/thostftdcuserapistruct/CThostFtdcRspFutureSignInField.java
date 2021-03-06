package com.xceder.ctp.thostftdcuserapistruct;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * \u671f\u5546\u7b7e\u5230\u54cd\u5e94<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi")
public class CThostFtdcRspFutureSignInField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcTradeCodeType */
	@Array({7})
	@Field(0)
	public Pointer<Byte > TradeCode() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcBankIDType */
	@Array({4})
	@Field(1)
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcBankBrchIDType */
	@Array({5})
	@Field(2)
	public Pointer<Byte > BankBranchID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11})
	@Field(3)
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcFutureBranchIDType */
	@Array({31})
	@Field(4)
	public Pointer<Byte > BrokerBranchID() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : TThostFtdcTradeDateType */
	@Array({9})
	@Field(5)
	public Pointer<Byte > TradeDate() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : TThostFtdcTradeTimeType */
	@Array({9})
	@Field(6)
	public Pointer<Byte > TradeTime() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : TThostFtdcBankSerialType */
	@Array({13})
	@Field(7)
	public Pointer<Byte > BankSerial() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : TThostFtdcTradeDateType */
	@Array({9})
	@Field(8)
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : TThostFtdcSerialType */
	@Field(9)
	public int PlateSerial() {
		return this.io.getIntField(this, 9);
	}
	/** C type : TThostFtdcSerialType */
	@Field(9)
	public CThostFtdcRspFutureSignInField PlateSerial(int PlateSerial) {
		this.io.setIntField(this, 9, PlateSerial);
		return this;
	}
	/** C type : TThostFtdcLastFragmentType */
	@Field(10)
	public byte LastFragment() {
		return this.io.getByteField(this, 10);
	}
	/** C type : TThostFtdcLastFragmentType */
	@Field(10)
	public CThostFtdcRspFutureSignInField LastFragment(byte LastFragment) {
		this.io.setByteField(this, 10, LastFragment);
		return this;
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(11)
	public int SessionID() {
		return this.io.getIntField(this, 11);
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(11)
	public CThostFtdcRspFutureSignInField SessionID(int SessionID) {
		this.io.setIntField(this, 11, SessionID);
		return this;
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(12)
	public int InstallID() {
		return this.io.getIntField(this, 12);
	}
	/** C type : TThostFtdcInstallIDType */
	@Field(12)
	public CThostFtdcRspFutureSignInField InstallID(int InstallID) {
		this.io.setIntField(this, 12, InstallID);
		return this;
	}
	/** C type : TThostFtdcUserIDType */
	@Array({16})
	@Field(13)
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 13);
	}
	/** C type : TThostFtdcDigestType */
	@Array({36})
	@Field(14)
	public Pointer<Byte > Digest() {
		return this.io.getPointerField(this, 14);
	}
	/** C type : TThostFtdcCurrencyIDType */
	@Array({4})
	@Field(15)
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 15);
	}
	/** C type : TThostFtdcDeviceIDType */
	@Array({3})
	@Field(16)
	public Pointer<Byte > DeviceID() {
		return this.io.getPointerField(this, 16);
	}
	/** C type : TThostFtdcBankCodingForFutureType */
	@Array({33})
	@Field(17)
	public Pointer<Byte > BrokerIDByBank() {
		return this.io.getPointerField(this, 17);
	}
	/** C type : TThostFtdcOperNoType */
	@Array({17})
	@Field(18)
	public Pointer<Byte > OperNo() {
		return this.io.getPointerField(this, 18);
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(19)
	public int RequestID() {
		return this.io.getIntField(this, 19);
	}
	/** C type : TThostFtdcRequestIDType */
	@Field(19)
	public CThostFtdcRspFutureSignInField RequestID(int RequestID) {
		this.io.setIntField(this, 19, RequestID);
		return this;
	}
	/** C type : TThostFtdcTIDType */
	@Field(20)
	public int TID() {
		return this.io.getIntField(this, 20);
	}
	/** C type : TThostFtdcTIDType */
	@Field(20)
	public CThostFtdcRspFutureSignInField TID(int TID) {
		this.io.setIntField(this, 20, TID);
		return this;
	}
	/** C type : TThostFtdcErrorIDType */
	@Field(21)
	public int ErrorID() {
		return this.io.getIntField(this, 21);
	}
	/** C type : TThostFtdcErrorIDType */
	@Field(21)
	public CThostFtdcRspFutureSignInField ErrorID(int ErrorID) {
		this.io.setIntField(this, 21, ErrorID);
		return this;
	}
	/** C type : TThostFtdcErrorMsgType */
	@Array({81})
	@Field(22)
	public Pointer<Byte > ErrorMsg() {
		return this.io.getPointerField(this, 22);
	}
	/** C type : TThostFtdcPasswordKeyType */
	@Array({129})
	@Field(23)
	public Pointer<Byte > PinKey() {
		return this.io.getPointerField(this, 23);
	}
	/** C type : TThostFtdcPasswordKeyType */
	@Array({129})
	@Field(24)
	public Pointer<Byte > MacKey() {
		return this.io.getPointerField(this, 24);
	}
	public CThostFtdcRspFutureSignInField() {
		super();
	}
	public CThostFtdcRspFutureSignInField(Pointer pointer) {
		super(pointer);
	}
}

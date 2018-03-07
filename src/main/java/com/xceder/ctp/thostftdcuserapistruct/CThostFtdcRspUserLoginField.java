package com.xceder.ctp.thostftdcuserapistruct;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * \u7528\u6237\u767b\u5f55\u5e94\u7b54<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi")
public class CThostFtdcRspUserLoginField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcDateType */
	@Array({9})
	@Field(0)
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcTimeType */
	@Array({9})
	@Field(1)
	public Pointer<Byte > LoginTime() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11})
	@Field(2)
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcUserIDType */
	@Array({16})
	@Field(3)
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcSystemNameType */
	@Array({41})
	@Field(4)
	public Pointer<Byte > SystemName() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : TThostFtdcFrontIDType */
	@Field(5)
	public int FrontID() {
		return this.io.getIntField(this, 5);
	}
	/** C type : TThostFtdcFrontIDType */
	@Field(5)
	public CThostFtdcRspUserLoginField FrontID(int FrontID) {
		this.io.setIntField(this, 5, FrontID);
		return this;
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(6)
	public int SessionID() {
		return this.io.getIntField(this, 6);
	}
	/** C type : TThostFtdcSessionIDType */
	@Field(6)
	public CThostFtdcRspUserLoginField SessionID(int SessionID) {
		this.io.setIntField(this, 6, SessionID);
		return this;
	}
	/** C type : TThostFtdcOrderRefType */
	@Array({13})
	@Field(7)
	public Pointer<Byte > MaxOrderRef() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : TThostFtdcTimeType */
	@Array({9})
	@Field(8)
	public Pointer<Byte > SHFETime() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : TThostFtdcTimeType */
	@Array({9})
	@Field(9)
	public Pointer<Byte > DCETime() {
		return this.io.getPointerField(this, 9);
	}
	/** C type : TThostFtdcTimeType */
	@Array({9})
	@Field(10)
	public Pointer<Byte > CZCETime() {
		return this.io.getPointerField(this, 10);
	}
	/** C type : TThostFtdcTimeType */
	@Array({9})
	@Field(11)
	public Pointer<Byte > FFEXTime() {
		return this.io.getPointerField(this, 11);
	}
	/** C type : TThostFtdcTimeType */
	@Array({9})
	@Field(12)
	public Pointer<Byte > INETime() {
		return this.io.getPointerField(this, 12);
	}
	public CThostFtdcRspUserLoginField() {
		super();
	}
	public CThostFtdcRspUserLoginField(Pointer pointer) {
		super(pointer);
	}
}

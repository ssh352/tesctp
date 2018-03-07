package com.xceder.ctp.thostftdcuserapistruct;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * \u62a5\u4ef7\u67e5\u8be2<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi")
public class CThostFtdcQryQuoteField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcBrokerIDType */
	@Array({11})
	@Field(0)
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcInvestorIDType */
	@Array({13})
	@Field(1)
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : TThostFtdcInstrumentIDType */
	@Array({31})
	@Field(2)
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9})
	@Field(3)
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcOrderSysIDType */
	@Array({21})
	@Field(4)
	public Pointer<Byte > QuoteSysID() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : TThostFtdcTimeType */
	@Array({9})
	@Field(5)
	public Pointer<Byte > InsertTimeStart() {
		return this.io.getPointerField(this, 5);
	}
	/** C type : TThostFtdcTimeType */
	@Array({9})
	@Field(6)
	public Pointer<Byte > InsertTimeEnd() {
		return this.io.getPointerField(this, 6);
	}
	public CThostFtdcQryQuoteField() {
		super();
	}
	public CThostFtdcQryQuoteField(Pointer pointer) {
		super(pointer);
	}
}

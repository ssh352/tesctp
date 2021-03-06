package com.xceder.ctp.thostftdcuserapistruct;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * \u6821\u9a8c\u6295\u8d44\u8005\u5bc6\u7801<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi")
public class CThostFtdcVerifyInvestorPasswordField extends StructObject {
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
	/** C type : TThostFtdcPasswordType */
	@Array({41})
	@Field(2)
	public Pointer<Byte > Password() {
		return this.io.getPointerField(this, 2);
	}
	public CThostFtdcVerifyInvestorPasswordField() {
		super();
	}
	public CThostFtdcVerifyInvestorPasswordField(Pointer pointer) {
		super(pointer);
	}
}

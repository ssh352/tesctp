package com.xceder.ctp.thostftdcuserapistruct;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * \u884c\u60c5\u6700\u65b0\u6210\u4ea4\u5c5e\u6027<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi")
public class CThostFtdcMarketDataLastMatchField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcPriceType */
	@Field(0)
	public double LastPrice() {
		return this.io.getDoubleField(this, 0);
	}
	/** C type : TThostFtdcPriceType */
	@Field(0)
	public CThostFtdcMarketDataLastMatchField LastPrice(double LastPrice) {
		this.io.setDoubleField(this, 0, LastPrice);
		return this;
	}
	/** C type : TThostFtdcVolumeType */
	@Field(1)
	public int Volume() {
		return this.io.getIntField(this, 1);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(1)
	public CThostFtdcMarketDataLastMatchField Volume(int Volume) {
		this.io.setIntField(this, 1, Volume);
		return this;
	}
	/** C type : TThostFtdcMoneyType */
	@Field(2)
	public double Turnover() {
		return this.io.getDoubleField(this, 2);
	}
	/** C type : TThostFtdcMoneyType */
	@Field(2)
	public CThostFtdcMarketDataLastMatchField Turnover(double Turnover) {
		this.io.setDoubleField(this, 2, Turnover);
		return this;
	}
	/** C type : TThostFtdcLargeVolumeType */
	@Field(3)
	public double OpenInterest() {
		return this.io.getDoubleField(this, 3);
	}
	/** C type : TThostFtdcLargeVolumeType */
	@Field(3)
	public CThostFtdcMarketDataLastMatchField OpenInterest(double OpenInterest) {
		this.io.setDoubleField(this, 3, OpenInterest);
		return this;
	}
	public CThostFtdcMarketDataLastMatchField() {
		super();
	}
	public CThostFtdcMarketDataLastMatchField(Pointer pointer) {
		super(pointer);
	}
}

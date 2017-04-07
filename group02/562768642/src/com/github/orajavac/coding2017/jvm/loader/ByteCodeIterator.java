package com.github.orajavac.coding2017.jvm.loader;

import com.github.orajavac.coding2017.jvm.util.Util;

public class ByteCodeIterator {
	
	private byte[] codes;
	
	private int pos;
	
	public ByteCodeIterator(byte[] codes){
		this.codes = codes;
	}
	
	public String nextU4ToHexString(){
		return Util.byteToHexString(new byte[]{codes[pos++],codes[pos++],codes[pos++],codes[pos++]});
	}

	public int nextU1ToInt(){
		return Util.byteToInt(new byte[]{codes[pos++]});
	}
	
	public int nextU2ToInt(){
		return Util.byteToInt(new byte[]{codes[pos++],codes[pos++]});
	}
	
	public int nextU4ToInt(){
		return Util.byteToInt(new byte[]{codes[pos++],codes[pos++],codes[pos++],codes[pos++]});
	}
}

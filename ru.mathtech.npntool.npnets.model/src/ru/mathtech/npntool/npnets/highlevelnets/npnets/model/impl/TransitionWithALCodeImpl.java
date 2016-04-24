package ru.mathtech.npntool.npnets.highlevelnets.npnets.model.impl;
import ru.mathtech.npntool.npnets.highlevelnets.npnets.model.*;
import ru.mathtech.npntool.npnets.highlevelnets.hlpn.impl.*;
public class TransitionWithALCodeImpl extends TransitionImpl implements TransitionWithALCode {

	private String code;
	@Override
	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String getCode() {
		 return this.code;
	}

}

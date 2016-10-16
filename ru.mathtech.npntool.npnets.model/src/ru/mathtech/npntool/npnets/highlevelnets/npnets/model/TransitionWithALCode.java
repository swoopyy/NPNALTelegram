package ru.mathtech.npntool.npnets.highlevelnets.npnets.model;

import ru.mathtech.npntool.npnets.highlevelnets.hlpn.Transition;

public interface TransitionWithALCode extends Transition {
	void setCode(String code);
	String getCode();
}

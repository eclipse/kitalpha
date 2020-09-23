package org.polarsys.kitalpha.common.sirius.extension.rotativeimage;

public class RotativeDescription {
	
	public static final int FOUR_IMAGES = 0;
	public static  final int ROTATIVE = 1;
	
	public String id;
	public int mode;
	
	public RotativeDescription(String id, int mode) {
		this.id=id;
		this.mode=mode;
	}
}

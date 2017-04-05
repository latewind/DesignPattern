package com.latewind.pattern.state;

public class Noon implements TimeStatus{

	@Override
	public void done(EveryDay everyDay) {
		//  Auto-generated method stub
		
		int hour=	everyDay.getTime().getHour();
		if(hour>13){
			
			everyDay.setTimeStatus(new AfterNoon());
		}else{
		
		System.out.println("中午时间");
		}
		
	}

}

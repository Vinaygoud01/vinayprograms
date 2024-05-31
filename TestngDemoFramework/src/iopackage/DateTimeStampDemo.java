package iopackage;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class DateTimeStampDemo 
	{
	@Test
	public void TimeStamp()
	{
		Date dt=new Date();
		System.out.println("the date is :"+dt);
		SimpleDateFormat sm=new SimpleDateFormat("yyyy:mm:DD HH:Mm:ss");
		System.out.println("SimpleDateFormat :"+sm);
		String dateformated=sm.format(dt);
		System.out.println("the formated date is :"+dateformated);
	}

		
	}



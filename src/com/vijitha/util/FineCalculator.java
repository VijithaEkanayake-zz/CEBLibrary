/**
 * 
 */
package com.vijitha.util;



import com.vijitha.model.BookIssues;
import com.vijitha.model.HoliDay;

import net.objectlab.kit.datecalc.common.DateCalculator;
import net.objectlab.kit.datecalc.common.HolidayHandlerType;
import net.objectlab.kit.datecalc.joda.LocalDateKitCalculatorsFactory;

import org.joda.time.LocalDate;
/**
 * @author root
 *
 */
public class FineCalculator {
	
	
	java.text.DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd");
	String toDayString = df.format(new java.util.Date());
	LocalDate toDay = new LocalDate(toDayString);

	//PeriodCountCalculator<a> calc = DateCalculatorsFactory.getDefaultInstance().getPeriodCountCalculator();

	
	public int calculateFine(BookIssues bookIssues){
		LocalDateKitCalculatorsFactory.getDefaultInstance().registerHolidays("UK", new HoliDay().getHolidayCalendar());
		DateCalculator<LocalDate> cal = LocalDateKitCalculatorsFactory.getDefaultInstance().getDateCalculator("UK", HolidayHandlerType.FORWARD);
		//PeriodCountCalculator<LocalDate> cal2 = LocalDateKitCalculatorsFactory.getDefaultInstance().getPeriodCountCalculator();
		
		//calc.dayDiff(bookIssues.getIssuedDate(), arg1, arg2);
		cal.setStartDate(new LocalDate(bookIssues.getIssuedDate().toString()));
		LocalDate start = cal.moveByBusinessDays(10).getStartDate();
		System.out.println("start date : "+start);
		LocalDate current = cal.getCurrentBusinessDate();
		System.out.println("current date : "+current);
		//PeriodCountCalculator<LocalDate> calc = LocalDateKitCalculatorsFactory.getDefaultInstance().getPeriodCountCalculator();
		int count=0;
		while(toDay.compareTo(cal.getCurrentBusinessDate())>0){
			cal.setStartDate(cal.moveByBusinessDays(1).getCurrentBusinessDate());
			count += 1;
		}
		
		//int fine = calc.dayDiff(current, toDay, PeriodCountBasis.ACT_365);
		System.out.println("fine is : "+count);
		return count;
		
	}
	
	public String calculateReturnDate(){
		LocalDateKitCalculatorsFactory.getDefaultInstance().registerHolidays("UK", new HoliDay().getHolidayCalendar());
		DateCalculator<LocalDate> cal = LocalDateKitCalculatorsFactory.getDefaultInstance().getDateCalculator("UK", HolidayHandlerType.FORWARD);
		cal.setStartDate(toDay);
		System.out.println(cal.getCurrentBusinessDate());
		LocalDate endDate = cal.moveByBusinessDays(10).getCurrentBusinessDate();
		//String returnDate = endDate.toDate();
		System.out.println("eeee"+endDate);
		return endDate.toString();
	}
	

}

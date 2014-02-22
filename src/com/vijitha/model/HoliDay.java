/**
 * 
 */
package com.vijitha.model;

import java.util.Set;

import org.joda.time.LocalDate;

import net.objectlab.kit.datecalc.common.HolidayCalendar;

/**
 * @author root
 *
 */
public class HoliDay implements HolidayCalendar<LocalDate>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see net.objectlab.kit.datecalc.common.HolidayCalendar#getEarlyBoundary()
	 */
	@Override
	public LocalDate getEarlyBoundary() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see net.objectlab.kit.datecalc.common.HolidayCalendar#getHolidays()
	 */
	@Override
	public Set<LocalDate> getHolidays() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see net.objectlab.kit.datecalc.common.HolidayCalendar#getLateBoundary()
	 */
	@Override
	public LocalDate getLateBoundary() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see net.objectlab.kit.datecalc.common.HolidayCalendar#isHoliday(java.lang.Object)
	 */
	@Override
	public boolean isHoliday(LocalDate arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see net.objectlab.kit.datecalc.common.HolidayCalendar#setEarlyBoundary(java.lang.Object)
	 */
	@Override
	public void setEarlyBoundary(LocalDate arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see net.objectlab.kit.datecalc.common.HolidayCalendar#setHolidays(java.util.Set)
	 */
	@Override
	public void setHolidays(Set<LocalDate> arg0) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see net.objectlab.kit.datecalc.common.HolidayCalendar#setLateBoundary(java.lang.Object)
	 */
	@Override
	public void setLateBoundary(LocalDate arg0) {
		// TODO Auto-generated method stub
		
	}

}

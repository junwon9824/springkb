package com.itskb.myapp.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class InterestCalaculatorService {

	@Autowired
	@Component(name = "")
	private InterestCalaculator calaculator = new LoanInterestCalaculator();

	private InterestCalaculator calaculator2 = new  SavingInterestCalaculator()

			
			
}

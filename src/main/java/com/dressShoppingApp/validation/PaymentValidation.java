package com.dressShoppingApp.validation;

import com.dressShoppingApp.model.Payment;

public class PaymentValidation {
	public static void validation(Payment payment) throws Exception {
		if(payment.getOrderIdNo()!=null) {
		
		}
		else
		{
		throw new Exception(" Wrong Order Id No ");
		} 
		if(payment.getPaymentOption().contains("Gpay")||payment.getPaymentOption().contains("PhonePe")||payment.getPaymentOption().contains("Paytm")||payment.getPaymentOption().contains("Cash on Delivery")) {
			
		}
		else
		{
		throw new Exception(" Payment Option is not available  ");
		} 

}
}
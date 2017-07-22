package com.webservice.consume;

import com.webservice.AddSubMulDivImplService;
import com.webservice.IAddSubMulDiv;

public class AddSubMulDivConsume {

	public static void main(String[] args) {
		
		AddSubMulDivImplService service = new AddSubMulDivImplService();
		IAddSubMulDiv operation = service.getAddSubMulDivImplPort();
		
		int add_value = operation.addition(8, 2);
		System.out.println(add_value);
		
		int sub_value = operation.subtraction(8, 2);
		System.out.println(sub_value);
		
		int mul_value = operation.multiplication(8, 2);
		System.out.println(mul_value);
		
		int div_value = operation.division(8, 2);
		System.out.println(div_value);
		
	}

}

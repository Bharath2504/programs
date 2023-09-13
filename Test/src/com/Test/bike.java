package com.Test;

public class bike {
	
		public void drive() {
			Engine eng= new Engine();
			int result = eng.start();
					
			if(result >=1) {
				System.out.println("Journey Started Successfully");
			}else {
				System.out.println("engine has some problrm");
			}
			
		}

}

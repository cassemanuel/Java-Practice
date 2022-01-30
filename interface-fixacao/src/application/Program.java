package application;

import services.ContractService;
import services.OnlinePaymentService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) {

		OnlinePaymentService ps = new PaypalService();
		ContractService cs = new ContractService(ps);

	}

}

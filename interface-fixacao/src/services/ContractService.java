package services;

import entities.Contract;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void ProcessContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
		for (int i = 1; i <= months; ++i) {
			double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
		}
	}
	
}

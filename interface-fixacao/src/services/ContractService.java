package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void ProcessContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
		// valor inicial das parcelas
		for (int i = 1; i <= months; ++i) {
			double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			// valor das parcelas + taxa básica mensal
			double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
			// valor da parcela + taxa fixa mensal
			Date dueDate = addMonths(contract.getDate(), i);
			contract.getInstallments().add(new Installment(dueDate, fullQuota));
		}
	}

	private Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
	}

}

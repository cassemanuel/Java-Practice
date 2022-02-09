package services;

import java.security.InvalidParameterException;

public interface InterestService {

	double getInterestRate();

	// implementa a conta da taxa de juros usando o default
	// basicamente vira um m�todo na implementa��o, ai n�o precisa ficar copiando e colando
	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}
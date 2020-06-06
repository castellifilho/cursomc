package com.castelli.cursomc.services;

import java.util.Calendar;
import java.util.Date;
import org.springframework.stereotype.Service;
import com.castelli.cursomc.domain.PagamentoComBoleto;

@Service
public class BoletoService {

	public void preencherPagamentoComBoleto(PagamentoComBoleto pgto, Date instantDoPedido) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(instantDoPedido);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		pgto.setDataVencimento(cal.getTime());
	}
}

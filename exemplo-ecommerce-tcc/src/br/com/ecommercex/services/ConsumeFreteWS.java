package br.com.ecommercex.services;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.tempuri.CResultado;
import org.tempuri.CServico;
import org.tempuri.CalcPrecoPrazoWSLocator;
import org.tempuri.CalcPrecoPrazoWSSoap;

public class ConsumeFreteWS {
	public CalculaPrecoPrazoResponse CalculaPrecoPrazo(CalculaPrecoPrazoRequest request) {
		CResultado result = null;
		CServico[] servicos;
		CalcPrecoPrazoWSLocator locator = new CalcPrecoPrazoWSLocator();

		try {
			CalcPrecoPrazoWSSoap calcWebService = locator.getCalcPrecoPrazoWSSoap();
			result = calcWebService.calcPrecoPrazo(request.getnCdEmpresa(), request.getsDsSenha(),
					request.getnCdServico(), request.getsCepOrigem(), request.getsCepDestino(), request.getnVlPeso(),
					request.getnCdFormato(), request.getnVlComprimento(), request.getnVlAltura(),
					request.getnVlLargura(), request.getnVlDiametro(), request.getsCdMaoPropria(),
					request.getnVlValorDeclarado(), request.getsCdAvisoRecebiment());
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		servicos = result.getServicos();
		String msg = null;
		if (!servicos[0].getMsgErro().equals(""))
			msg = servicos[0].getMsgErro();
		CalculaPrecoPrazoResponse response = new CalculaPrecoPrazoResponse(servicos[0].getValor(), servicos[0].getPrazoEntrega(), msg);
		
		return response;
	}
}

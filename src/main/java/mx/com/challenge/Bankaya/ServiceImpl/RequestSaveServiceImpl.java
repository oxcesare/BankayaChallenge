package mx.com.challenge.Bankaya.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.challenge.Bankaya.Entity.RequestSaveEntity;
import mx.com.challenge.Bankaya.Repository.RequestSaveRepository;
import mx.com.challenge.Bankaya.Service.RequestSaveService;

@Service
public class RequestSaveServiceImpl implements RequestSaveService {
	
	@Autowired
	private RequestSaveRepository requestSaveService;

	@Override
	public void saveRequest(RequestSaveEntity requestSaveEntity) {
		requestSaveService.save(requestSaveEntity);		
	}	

}

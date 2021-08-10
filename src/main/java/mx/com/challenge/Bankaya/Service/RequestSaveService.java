package mx.com.challenge.Bankaya.Service;

import org.springframework.stereotype.Service;

import mx.com.challenge.Bankaya.Entity.RequestSaveEntity;

@Service
public interface RequestSaveService {
	
	public void saveRequest(RequestSaveEntity requestSaveEntity);

}

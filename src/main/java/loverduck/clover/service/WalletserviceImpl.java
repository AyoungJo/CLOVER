package loverduck.clover.service;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import loverduck.clover.entity.Wallet;
import loverduck.clover.repository.WalletRepository;

@Service
@RequiredArgsConstructor
@Transactional
public class WalletserviceImpl implements WalletService {

	private final WalletRepository walletRepository;

    public Wallet findById(Long walletId) {
        
    	Wallet wallet = walletRepository.findById(walletId).orElse(null);
    	
    	return wallet;
    }
    
}

package com.dave.walletsys.service;

import com.dave.walletsys.model.Wallet;
import com.dave.walletsys.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements WalletService{
    private final WalletRepository repository;
    @Override
    public List<Wallet> getAllWallets() {
        return repository.findAll();
    }

    @Override
    public Wallet getWalletById(Long id) {
        return repository.findById(id).orElse(new Wallet());
    }

    @Override
    public Wallet addWallet(Wallet wallet) {
        return repository.save(wallet);
    }

    @Override
    public Wallet updateWallet(Long id, Wallet wallet) {
        if(repository.existsById(id)){
            wallet.setId(id);
        }
        return repository.save(wallet);
    }

    @Override
    public void removeWallet(Long id) {
        repository.deleteById(id);
    }
}

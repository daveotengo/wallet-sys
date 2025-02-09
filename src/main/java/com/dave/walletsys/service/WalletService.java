package com.dave.walletsys.service;

import com.dave.walletsys.model.Wallet;

import java.util.List;

public interface WalletService {
    public List<Wallet> getAllWallets();

    public Wallet getWalletById(Long id);

    public Wallet addWallet(Wallet wallet);

    public Wallet updateWallet(Long id, Wallet wallet);

    public void removeWallet(Long id);
}

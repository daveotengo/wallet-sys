package com.dave.walletsys.controller;

import com.dave.walletsys.dto.WalletDTO;
import com.dave.walletsys.mapper.WalletMapper;
import com.dave.walletsys.model.Wallet;
import com.dave.walletsys.service.WalletService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/wallets")
public class WalletController {
    private final WalletService service;
    private  final WalletMapper walletMapper;
    @GetMapping
    public List<Wallet> getAllWallets(){
        return service.getAllWallets();
    }

    @GetMapping("/{id}")
    public Wallet getWalletById(@PathVariable Long id){
        return service.getWalletById(id);
    }

    @PostMapping
    public Wallet addWallet(@RequestBody WalletDTO walletDTO){
        Wallet wallet= walletMapper.toEntity(walletDTO);
        return service.addWallet(wallet);
    }

    @PutMapping("/{id}")
    public Wallet updateWallet(@PathVariable Long id, @RequestBody WalletDTO walletDTO){
        Wallet wallet= walletMapper.toEntity(walletDTO);
        return service.updateWallet(id,wallet);
    }

    @DeleteMapping
    public void removeWallet(@PathVariable Long id){
        service.removeWallet(id);
    }
}

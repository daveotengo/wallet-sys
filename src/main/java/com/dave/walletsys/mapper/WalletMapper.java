package com.dave.walletsys.mapper;

import com.dave.walletsys.blueprint.EntityMapper;
import com.dave.walletsys.dto.WalletDTO;
import com.dave.walletsys.model.Wallet;
import org.mapstruct.Mapper;

@Mapper(componentModel ="spring" ,uses = {})
public interface WalletMapper extends EntityMapper<WalletDTO, Wallet> {

}

package com.Arun.Service;

import com.Arun.Dto.ArunDto;
import com.Arun.Entity.ArunEntity;
import com.Arun.Repository.ArunEntityRepository;
import org.springframework.stereotype.Service;

@Service
public class ArunIMPL implements Arun{
    private ArunEntityRepository arunEntityRepository;

    public ArunIMPL(ArunEntityRepository arunEntityRepository) {
        this.arunEntityRepository = arunEntityRepository;
    }


    @Override
    public ArunDto addArun(ArunDto dto) {
        ArunEntity entity =new ArunEntity();
        entity.setName(dto.getName());
        entity.setMobile(dto.getMobile());
        entity.setEmailId(dto.getEmailId());

        ArunEntity saved = arunEntityRepository.save(entity);
      ArunDto ad = new ArunDto();
      ad.setId(saved.getId());
      ad.setName(saved.getName());
      ad.setMobile(saved.getMobile());
      ad.setEmailId(saved.getEmailId());
      return ad;

    }
}

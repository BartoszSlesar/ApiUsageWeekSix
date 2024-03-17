package com.bard.apiusageweeksix.services;


import com.bard.apiusageweeksix.config.ApiConfiguration;
import com.bard.apiusageweeksix.model.Spell;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class SpellService {
    private RestTemplate restTemplate;
    private final ApiConfiguration apiConfiguration;

    public SpellService(ApiConfiguration apiConfiguration){
        this.apiConfiguration = apiConfiguration;
        this.restTemplate = new RestTemplate();
    }

    public List<Spell> getAllSpells(){
        String callUrl = apiConfiguration.getSpellApiUrl();
        Spell[] spellData = restTemplate.getForObject(
                callUrl, Spell[].class);

        return Arrays.asList(spellData);
    }


}

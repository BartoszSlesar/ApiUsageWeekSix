package com.bard.apiusageweeksix.services;


import com.bard.apiusageweeksix.config.ApiConfiguration;
import com.bard.apiusageweeksix.model.Spell;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.Arrays;
import java.util.List;

@Service
public class SpellService {
    private RestClient restClient;
    private final ApiConfiguration apiConfiguration;

    public SpellService(ApiConfiguration apiConfiguration){
        this.apiConfiguration = apiConfiguration;
        this.restClient = RestClient.create();
    }

    public List<Spell> getAllSpells(){
        String callUrl = apiConfiguration.getSpellApiUrl();
        Spell[] spellData = restClient.get()
                .uri(callUrl)
                .retrieve()
                .body(Spell[].class);

        return Arrays.asList(spellData);
    }


}

package org.datapersist.course.controller;

import org.datapersist.course.model.Language;
import org.datapersist.course.service.LanguageService;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LanguageController {

    private LanguageService languageService;

    @RequestMapping("/lang")
    public List<Language> getAllLanguages(){
       return languageService.findAllLanguages();
    }

    @RequestMapping("/lang/{id}")
    public Language findLanguage(@PathVariable Long id){
        return languageService.findLanguage(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/lang")
    public void addLanguage(@RequestBody Language l){
        languageService.addLanguage(l);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/lang")
    public void updateLanguage(@RequestBody Language l){
        languageService.updateLanguage(l);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/lang/{id}")
    public void deleteLanguage(@PathVariable Long id){
        languageService.deleteLanguage(id);
    }

    @Autowired
    public void setLanguageService(LanguageService languageService) {
        this.languageService = languageService;
    }
}

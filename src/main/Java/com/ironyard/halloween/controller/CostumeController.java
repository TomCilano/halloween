package com.ironyard.halloween.controller;

import com.ironyard.halloween.data.Costume;
import com.ironyard.halloween.repository.CostumeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Tom on 10/12/16.
 */
@RestController
public class CostumeController {

    private CostumeRepo costumeRepo;
@Autowired
    public void setCostumeRepo(CostumeRepo aRepo){
    this.costumeRepo = aRepo;
}

    /**
     * Save a costume
     * @param aCostume
     * @return
     */
    @RequestMapping(value ="/costume", method = RequestMethod.POST)

    public Costume save(@RequestBody Costume aCostume){
        costumeRepo.save(aCostume);
        return costumeRepo.findOne(aCostume.getId());
    }

    /**
     * Updates a costume
     * @param aCostume
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)

    public Costume update(@RequestBody Costume aCostume){
        costumeRepo.save(aCostume);
        return costumeRepo.findOne(aCostume.getId());
    }

    /**
     * show movie by id
     * @param id
     * @return
     */

    @RequestMapping(value = "/costume/{id}", method = RequestMethod.GET)

    public Costume show(@PathVariable Long id){
        return costumeRepo.findOne(id);
    }

    /**
     * returns a list of costumes
     * @return
     */
    @RequestMapping(value = "/costumeList", method = RequestMethod.GET)

    public Iterable<Costume> list() {
        return costumeRepo.findAll();}

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)

    public Costume delete(@PathVariable Long id){
        Costume deleted = costumeRepo.findOne(id);
        costumeRepo.delete(id);
        return deleted;
    }
}

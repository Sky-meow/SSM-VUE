package template.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import template.entity.PetCategory;
import template.mapper.PetCategoryMapper;

import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/one")
public class ControOne {
    @Autowired
    PetCategoryMapper petCategoryMapper;

    @ResponseBody
    @GetMapping()
    public List getOne(){
        return petCategoryMapper.selectAll();
    }

    @PostMapping()
    @ResponseBody
    public PetCategory postOne(@RequestBody PetCategory petCategory){
        //List<PetCategory> list = new ArrayList<>();
        //list.add(petCategory);
        petCategoryMapper.insert(petCategory);
        return petCategory;
       // return list;
    }
}

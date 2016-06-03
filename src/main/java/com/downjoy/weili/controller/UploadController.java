package com.downjoy.weili.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
    
    @RequestMapping(value = "/uploadImage")  
    public String upload(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request, ModelMap model) {  
  
        System.out.println("¿ªÊ¼");  
        String path = request.getSession().getServletContext().getRealPath("uploadImage");  
        String fileName = file.getOriginalFilename();  
//        String fileName = new Date().getTime()+".jpg";  
        System.out.println(path);  
        File targetFile = new File(path, fileName);  
        System.out.println(targetFile.getPath());;
        if(!targetFile.exists()){  
            targetFile.mkdirs();  
        }  
  
        //±£´æ  
        try {  
            file.transferTo(targetFile);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        model.addAttribute("fileUrl", request.getContextPath()+"/uploadImage/"+fileName);  
//        model.addAttribute("fileUrl", targetFile.getPath());
        return "result";  
    }  
}

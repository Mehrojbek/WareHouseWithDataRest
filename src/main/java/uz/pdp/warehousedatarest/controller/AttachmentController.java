package uz.pdp.warehousedatarest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.warehousedatarest.entity.Attachment;
import uz.pdp.warehousedatarest.payload.ApiResponse;
import uz.pdp.warehousedatarest.service.AttachmentService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/attachment")
public class AttachmentController {

    @Autowired
    AttachmentService attachmentService;

    @PostMapping("/uploadFile")
    public ResponseEntity<?> uploadFile(MultipartHttpServletRequest request){
        ApiResponse apiResponse = attachmentService.uploadFile(request);
        return ResponseEntity.status(apiResponse.isSuccess()?200:404).body(apiResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getFile(@PathVariable Integer id, HttpServletResponse response){
        ApiResponse apiResponse = attachmentService.getFile(id, response);
        return ResponseEntity.status(apiResponse.isSuccess()?200:404).body(apiResponse);
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        List<Attachment> attachmentList = attachmentService.getAll();
        return ResponseEntity.ok(attachmentList);
    }
}

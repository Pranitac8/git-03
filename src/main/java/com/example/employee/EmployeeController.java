
package com.example.employee;
import java.util.List;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/employees")
public class EmployeeController {
 @GetMapping
 public List<String> getAll(){
   return List.of("John","Alice","Bob");
 }
}

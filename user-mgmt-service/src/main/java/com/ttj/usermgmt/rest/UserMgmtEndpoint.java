/*
 * package com.ttj.usermgmt.rest;
 * 
 * import com.ttj.usermgmt.domain.ProductDto; import
 * com.ttj.usermgmt.service.UserMgmtServiceImpl;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.cloud.context.config.annotation.RefreshScope; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.*;
 * 
 * import java.sql.SQLException;
 * 
 * @RestController
 * 
 * @RequestMapping("/users")
 * 
 * @RefreshScope public class UserMgmtEndpoint {
 * 
 * @Autowired private UserMgmtServiceImpl userMgmtServiceImpl;
 * 
 * 
 * @RequestMapping(value = "/getProductById/{id}", method = RequestMethod.GET,
 * produces = "application/json") public ResponseEntity<?>
 * getProductById(@PathVariable(value = "id") Integer id) throws SQLException,
 * ClassNotFoundException {
 * 
 * return new ResponseEntity<>(userMgmtServiceImpl.getById(id),
 * HttpStatus.CREATED); }
 * 
 * 
 * @RequestMapping(value = "/getProduct", method = RequestMethod.GET, produces =
 * "application/json") public ResponseEntity<?> getProduct() throws
 * SQLException, ClassNotFoundException { userMgmtServiceImpl.getProduct();
 * return new ResponseEntity<>(userMgmtServiceImpl, HttpStatus.CREATED); }
 * 
 * @RequestMapping(value = "/product", method = RequestMethod.POST, produces =
 * "application/json") public ResponseEntity<?> createProduct(@RequestBody
 * ProductDto product) throws SQLException, ClassNotFoundException {
 * userMgmtServiceImpl.save(product); return new ResponseEntity<>(product,
 * HttpStatus.CREATED); }
 * 
 * @RequestMapping(value = "/updateProduct", method = RequestMethod.POST,
 * produces = "application/json") public ResponseEntity<?>
 * upStudent(@RequestBody ProductDto product) throws SQLException,
 * ClassNotFoundException { userMgmtServiceImpl.update(product); return new
 * ResponseEntity<>("Data Updated", HttpStatus.CREATED); }
 * 
 * 
 * @RequestMapping(value = "/deleteProduct/{id}", method = RequestMethod.GET,
 * produces = "application/json") public ResponseEntity<?>
 * delStudent(@PathVariable(value = "id") Integer id) throws SQLException,
 * ClassNotFoundException { productService.delete(id); return new
 * ResponseEntity<>("Data Deleted", HttpStatus.CREATED); }
 * 
 * 
 * 
 * @Value("${message}") private String message;
 * 
 * @RequestMapping(method = RequestMethod.GET, produces = "application/json")
 * public String welcome() { return message; }
 * 
 * @RequestMapping(value="/{userId}", method = RequestMethod.GET, produces =
 * "application/json") public User findUserById(@PathVariable("userId") String
 * userId) { User user = userMgmtService.findByUserId(userId); return user; }
 * 
 * @RequestMapping(value = "/create", method = RequestMethod.POST, consumes =
 * "application/json") public String createUser(@RequestBody User user) {
 * userMgmtService.saveUser(user); return "UserId: "+user.getId(); }
 * 
 * @RequestMapping(value = "/listAll", method = RequestMethod.GET, produces =
 * "application/json") public List<User> listUsers() { return
 * userMgmtService.listAllUsers(); }
 * 
 * 
 * }
 */
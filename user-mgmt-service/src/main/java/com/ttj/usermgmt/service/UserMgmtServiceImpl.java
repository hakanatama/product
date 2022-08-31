/*
 * package com.ttj.usermgmt.service;
 * 
 * import com.ttj.usermgmt.domain.ProductDto; import
 * com.ttj.usermgmt.domain.User; import com.ttj.usermgmt.repo.UserRepository;
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * @Service public class UserMgmtServiceImpl {
 * 
 * @Autowired UserRepository userRepo;
 * 
 * public User save(ProductDto product) {
 * 
 * User newProduct = new User(); newProduct.setName(product.getName());
 * newProduct.setPrice(product.getPrice());
 * 
 * return userRepo.save(newProduct); }
 * 
 * public User update(ProductDto product) {
 * 
 * User upProduct = new User(); upProduct.setId(product.getId());
 * upProduct.setName(product.getName()); upProduct.setPrice(product.getPrice());
 * 
 * return userRepo.save(upProduct); }
 * 
 * 
 * public void delete(Integer id) {
 * 
 * userRepo.deleteById(id);;
 * 
 * }
 * 
 * 
 * 
 * public User getById(Integer id) {
 * 
 * return userRepo.findById(id).get();
 * 
 * }
 * 
 * public Iterable<User> getProduct() {
 * 
 * return userRepo.findAll();
 * 
 * }
 * 
 * @Override public void saveUser(User user) { userRepo.save(user); }
 * 
 * @Override public User findByUserId(String userId) { return
 * userRepo.findByUserId(userId); }
 * 
 * @Override public void deleteUser(String userId) { User user =
 * userRepo.findByUserId(userId); userRepo.delete(user); }
 * 
 * @Override public List<User> listAllUsers(){ return userRepo.findAll(); }
 * 
 * 
 * }
 */